package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        MainViewController viewController = new MainViewController();
        Scene scene = new Scene(viewController.crearInterfazPrincipal(), 850, 600);
        primaryStage.setTitle("TitanGym POS - Proyecto Integrador");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}