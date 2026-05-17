package model;

import java.io.Serializable;

public abstract class Membresia implements Serializable {
    protected String nombrePlan;
    protected double precioBase;

    public Membresia(String nombrePlan, double precioBase) {
        this.nombrePlan = nombrePlan;
        this.precioBase = precioBase;
    }

    public abstract double calcularCostoFinal();
}