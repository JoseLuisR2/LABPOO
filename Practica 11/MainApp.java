package Practica11;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class MainApp extends Application {
    private TableView<Nave> tabla = new TableView<>();
    private ObservableList<Nave> datos = FXCollections.observableArrayList();

    @Override
    public void start(Stage stage) {
        VBox root = new VBox(15);
        root.setPadding(new Insets(20));
        root.getStyleClass().add("root");

        TextField buscador = new TextField();
        buscador.setPromptText("Buscar...");

        FilteredList<Nave> listaFiltrada = new FilteredList<>(datos, p -> true);
        buscador.textProperty().addListener((obs, v, n) -> {
            listaFiltrada.setPredicate(nave -> {
                if (n == null || n.isEmpty()) return true;
                String f = n.toLowerCase();
                return nave.getId().toLowerCase().contains(f) ||
                        nave.getTipo().toLowerCase().contains(f);
            });
        });

        TableColumn<Nave, String> c1 = new TableColumn<>("ID");
        c1.setCellValueFactory(new PropertyValueFactory<>("id"));
        TableColumn<Nave, String> c2 = new TableColumn<>("Tipo");
        c2.setCellValueFactory(new PropertyValueFactory<>("tipo"));

        tabla.getColumns().addAll(c1, c2);
        tabla.setItems(listaFiltrada);

        CampoValidado t1 = new CampoValidado("ID");
        CampoValidado t2 = new CampoValidado("Tipo");
        BotonEstelar btn = new BotonEstelar("Agregar");

        btn.setOnAction(e -> {
            if (!t1.getText().isEmpty() && !t2.getText().isEmpty()) {
                datos.add(new Nave(t1.getText(), t2.getText(), 100));
                t1.clear();
                t2.clear();
            } else {
                Alert a = new Alert(Alert.AlertType.WARNING, "Llenar campos");
                a.showAndWait();
            }
        });

        root.getChildren().addAll(new Label("Control de Flota"), buscador, tabla, t1, t2, btn);

        Scene sc = new Scene(root, 500, 600);




        stage.setTitle("Terminal de Control de Flota Estelar - Hola profe ");
        stage.setScene(sc);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}