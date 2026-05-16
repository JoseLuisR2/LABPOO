public class CombustibleInsuficienteException extends FlotaException {
    public CombustibleInsuficienteException(String nave) {
        super("Error en " + nave + ": Combustible por debajo del nivel de seguridad.");
    }
}