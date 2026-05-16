public class CoordenadasInvalidasException extends FlotaException {
    public CoordenadasInvalidasException(String coordenadas) {
        super("Trayectoria rechazada. Las coordenadas " + coordenadas + " estan fuera del cuadrante.");
    }
}