package model;

public class PlanMensual extends Membresia {
    public PlanMensual() {
        super("Mensual Estándar", 500.0);
    }

    @Override
    public double calcularCostoFinal() {
        return precioBase;
    }
}