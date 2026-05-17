package model;

import java.io.Serializable;

public class Cliente implements Serializable {
    private String id;
    private String nombre;
    private String membresia;
    private double puntos;

    public Cliente(String id, String nombre, String membresia) {
        this.id = id;
        this.nombre = nombre;
        this.membresia = membresia;
        this.puntos = 0;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getMembresia() { return membresia; }
    public double getPuntos() { return puntos; }
    public void setPuntos(double puntos) { this.puntos = puntos; }
    public void setMembresia(String membresia) { this.membresia = membresia; }
}