package exception;

public class PagoRechazadoException extends GymException {
    public PagoRechazadoException(String motivo) {
        super("Error en el procesamiento del pago: " + motivo);
    }
}