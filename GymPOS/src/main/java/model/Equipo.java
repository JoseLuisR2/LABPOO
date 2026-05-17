package model;

import java.io.Serializable;

public class Equipo implements Serializable {
    private String nombre;
    private int cantidad;
    private String estado;

    public Equipo(String nombre, int cantidad, String estado) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.estado = estado;
    }

   
    public String getNombre() { return nombre; }
    public int getCantidad() { return cantidad; }
}