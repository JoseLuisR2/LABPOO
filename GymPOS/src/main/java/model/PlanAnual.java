package model;

public class PlanAnual extends Membresia {
    public PlanAnual() {
        super("Anual Premium", 5000.0);
    }

    @Override
    public double calcularCostoFinal() {
        return precioBase * 0.85;
    }
}