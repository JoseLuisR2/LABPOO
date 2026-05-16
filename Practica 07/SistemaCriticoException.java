import java.time.LocalDateTime;

public class SistemaCriticoException extends FlotaException {
    private final LocalDateTime timestamp;
    private final int codigoError;

    public SistemaCriticoException(String mensaje, int codigo) {
        super(mensaje);
        this.timestamp = LocalDateTime.now();
        this.codigoError = codigo;
    }

    public String getDetallesTecnicos() {
        return "Codigo: " + codigoError + " | Hora: " + timestamp;
    }
}