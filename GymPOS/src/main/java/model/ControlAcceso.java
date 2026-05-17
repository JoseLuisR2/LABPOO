package model;

import java.util.ArrayList;
import java.util.List;

public class ControlAcceso {
    private List<RegistroAcceso> historial = new ArrayList<>();

    public void registrarEntrada(String id) {
        historial.add(new RegistroAcceso(id));
        System.out.println("Acceso registrado para ID: " + id);
    }
}