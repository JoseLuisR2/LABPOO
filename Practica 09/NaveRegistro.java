import java.io.Serializable;

public class NaveRegistro implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String tipo;
    private int potencia;

    public NaveRegistro(String id, String tipo, int potencia) {
        this.id = id;
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public String toJSON() {
        return "  {\n    \"id\": \"" + id + "\",\n    \"tipo\": \"" + tipo + "\",\n    \"potencia\": " + potencia + "\n  }";
    }

    @Override
    public String toString() {
        return id + "," + tipo + "," + potencia;
    }
}