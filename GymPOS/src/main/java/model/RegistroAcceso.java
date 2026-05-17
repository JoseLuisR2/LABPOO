package model;

import java.time.LocalDateTime;

public class RegistroAcceso {
    private String clienteId;
    private LocalDateTime fechaEntrada;

    public RegistroAcceso(String clienteId) {
        this.clienteId = clienteId;
        this.fechaEntrada = LocalDateTime.now();
    }
}