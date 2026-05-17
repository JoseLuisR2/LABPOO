package view;

import controller.GymController;
import model.Cliente;
import model.Equipo;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import java.util.Optional;

public class MainViewController {
    private GymController logicController = new GymController();

    public TabPane crearInterfazPrincipal() {
        TabPane tabPane = new TabPane();
        tabPane.getTabs().addAll(
                new Tab("Socios", crearSeccionClientes()),
                new Tab("Inventario", crearSeccionInventario()),
                new Tab("Notificaciones", crearSeccionAvisos())
        );
        tabPane.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE);
        return tabPane;
    }

    private VBox crearSeccionClientes() {
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10));

        TableView<Cliente> tabla = new TableView<>();
        actualizarTabla(tabla);

        TableColumn<Cliente, String> colId = new TableColumn<>("ID");
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        TableColumn<Cliente, String> colNombre = new TableColumn<>("Nombre");
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        TableColumn<Cliente, String> colMem = new TableColumn<>("Plan");
        colMem.setCellValueFactory(new PropertyValueFactory<>("membresia"));
        TableColumn<Cliente, Double> colPts = new TableColumn<>("Puntos");
        colPts.setCellValueFactory(new PropertyValueFactory<>("puntos"));

        tabla.getColumns().addAll(colId, colNombre, colMem, colPts);

        Button btnNuevo = new Button("Agregar Nuevo Socio");
        btnNuevo.setOnAction(e -> {
            mostrarDialogoNuevoCliente();
            actualizarTabla(tabla);
        });

        Button btnRenovar = new Button("Renovar Membresía Seleccionada");
        btnRenovar.setOnAction(e -> {
            Cliente sel = tabla.getSelectionModel().getSelectedItem();
            if (sel != null) {
                mostrarDialogoRenovacion(sel);
                actualizarTabla(tabla);
            }
        });

        layout.getChildren().addAll(new Label("Gestión de Socios"), tabla, btnNuevo, btnRenovar);
        return layout;
    }

    private void mostrarDialogoNuevoCliente() {
        Dialog<Cliente> dialog = new Dialog<>();
        dialog.setTitle("Nuevo Socio");
        ButtonType loginButtonType = new ButtonType("Guardar", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().addAll(loginButtonType, ButtonType.CANCEL);

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        TextField id = new TextField();
        TextField nombre = new TextField();
        ComboBox<String> plan = new ComboBox<>(FXCollections.observableArrayList("Mensual", "Anual"));
        plan.setValue("Mensual");

        grid.add(new Label("ID:"), 0, 0);
        grid.add(id, 1, 0);
        grid.add(new Label("Nombre:"), 0, 1);
        grid.add(nombre, 1, 1);
        grid.add(new Label("Plan:"), 0, 2);
        grid.add(plan, 1, 2);

        dialog.getDialogPane().setContent(grid);
        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == loginButtonType) {
                return new Cliente(id.getText(), nombre.getText(), plan.getValue());
            }
            return null;
        });

        Optional<Cliente> result = dialog.showAndWait();
        result.ifPresent(cliente -> logicController.agregarCliente(cliente));
    }

    private void mostrarDialogoRenovacion(Cliente c) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Renovación");
        alert.setHeaderText("Renovar a " + c.getNombre());
        alert.setContentText("Selecciona el nuevo periodo:");

        ButtonType btnMensual = new ButtonType("Mensual ($500)");
        ButtonType btnAnual = new ButtonType("Anual ($4250 - 15% Desc)");
        alert.getButtonTypes().setAll(btnMensual, btnAnual, ButtonType.CANCEL);

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == btnMensual) {
            logicController.renovarSuscripcion(c, false);
        } else if (result.get() == btnAnual) {
            logicController.renovarSuscripcion(c, true);
        }
    }

    private void actualizarTabla(TableView<Cliente> tabla) {
        tabla.setItems(FXCollections.observableArrayList(logicController.getListaClientes()));
        tabla.refresh();
    }

    private VBox crearSeccionInventario() {
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10));
        ListView<String> lista = new ListView<>();
        for (Equipo e : logicController.getInventario()) {
            lista.getItems().add(e.getNombre() + " | Stock: " + e.getCantidad());
        }
        layout.getChildren().addAll(new Label("Equipamiento"), lista);
        return layout;
    }

    private VBox crearSeccionAvisos() {
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10));
        TextArea area = new TextArea("Clases hoy:\n- 08:00 Yoga\n- 18:00 Box");
        area.setEditable(false);
        Button btnRep = new Button("Generar Reporte");
        btnRep.setOnAction(e -> logicController.ejecutarReporteHilo("Reporte_Actividad"));
        layout.getChildren().addAll(new Label("Avisos"), area, btnRep);
        return layout;
    }
}