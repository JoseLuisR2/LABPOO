package Practica11;

public class Nave {
    private String id;
    private String tipo;
    private int potencia;

    public Nave(String id, String tipo, int potencia) {
        this.id = id;
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public String getId() { return id; }
    public String getTipo() { return tipo; }
    public int getPotencia() { return potencia; }

    public void setId(String id) { this.id = id; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public void setPotencia(int potencia) { this.potencia = potencia; }
}