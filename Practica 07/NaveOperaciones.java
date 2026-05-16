public class NaveOperaciones {
    public void realizarViaje(int combustible, String coordenadas) throws FlotaException {
        if (combustible < 20) {
            throw new CombustibleInsuficienteException("Falcon-9");
        }
        if (coordenadas.contains("X")) {
            throw new CoordenadasInvalidasException(coordenadas);
        }
        if (combustible == 50) {
            throw new SistemaCriticoException("Falla de motor principal", 505);
        }
        System.out.println("Viaje iniciado con exito.");
    }
}