import java.util.Objects;

public class Nave implements Comparable<Nave> {
    private String id;
    private String tipo;
    private int potencia;
    private double combustible;

    public Nave(String id, String tipo, int potencia, double combustible) {
        this.id = id;
        this.tipo = tipo;
        this.potencia = potencia;
        this.combustible = combustible;
    }

    @Override
    public int compareTo(Nave otra) {
        return this.id.compareTo(otra.id);
    }


    public String getId() { return id; }
    public String getTipo() { return tipo; }
    public int getPotencia() { return potencia; }
    public double getCombustible() { return combustible; }

    @Override
    public String toString() {
        return String.format("ID: %s | Tipo: %s | Potencia: %d | Combustible: %.1f", id, tipo, potencia, combustible);
    }
}