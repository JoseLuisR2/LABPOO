public class NaveInvestigacion extends NaveBase {
    public NaveInvestigacion(String nombre) {
        super(nombre);
    }

    @Override
    public void realizarMision() {
        System.out.println(nombre + " recolectando muestras.");
    }

    @Override
    public double calcularConsumoEnergia(int distancia) {
        return distancia * 0.3;
    }

    @Override
    public boolean realizarMantenimiento() {
        System.out.println("Calibrando microscopios.");
        return true;
    }

    public void escanear() {
        System.out.println("Escaneando...");
    }

    public void escanear(int profundidad) {
        System.out.println("Escaneo a " + profundidad + "m.");
    }

    public void escanear(String elemento) {
        System.out.println("Buscando " + elemento + ".");
    }
}