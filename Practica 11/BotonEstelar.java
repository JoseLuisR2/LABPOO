package Practica11;

import javafx.scene.control.Button;

public class BotonEstelar extends Button {
    public BotonEstelar(String texto) {
        super(texto);
        this.setStyle("-fx-background-color: #1a1a2e; -fx-text-fill: #e94560;");

        this.setOnMouseEntered(e -> this.setStyle("-fx-background-color: #e94560; -fx-text-fill: #1a1a2e;"));
        this.setOnMouseExited(e -> this.setStyle("-fx-background-color: #1a1a2e; -fx-text-fill: #e94560;"));
    }
}