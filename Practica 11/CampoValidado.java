package Practica11;

import javafx.scene.control.TextField;

public class CampoValidado extends TextField {
    public CampoValidado(String p) {
        setPromptText(p);
        this.textProperty().addListener((o, v, n) -> {
            if (n.trim().isEmpty()) {
                this.setStyle("-fx-border-color: #e94560;");
            } else {
                this.setStyle("-fx-border-color: #0f3460;");
            }
        });
    }
}