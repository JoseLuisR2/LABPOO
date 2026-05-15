public class NaveExploracion extends NaveBase {
    private String tipoSensor;

    public NaveExploracion(String nombre, String sensor) {
        super(nombre);
        this.tipoSensor = sensor;
    }

    @Override
    public void realizarMision() {
        System.out.println(nombre + " escaneando sector con sensor " + tipoSensor);
    }

    @Override
    public void mostrarEstado() {
        super.mostrarEstado();
        System.out.println("Alcance de sensores: Óptimo.");
    }

    @Override
    public void activarSistemas() {
        System.out.println("Calibrando antenas de largo alcance.");
    }
}