public class NaveTransporte extends NaveBase {
    public NaveTransporte(String nombre) {
        super(nombre);
    }

    @Override
    public void realizarMision() {
        System.out.println(nombre + " entregando suministros.");
    }

    @Override
    public double calcularConsumoEnergia(int distancia) {
        return distancia * 0.5;
    }

    @Override
    public boolean realizarMantenimiento() {
        System.out.println("Limpiando bodegas.");
        return true;
    }

    public void cargar(int toneladas) {
        System.out.println("Cargando " + toneladas + "t.");
    }

    public void cargar(String material) {
        System.out.println("Cargando " + material + ".");
    }

    public void cargar(int toneladas, String material) {
        System.out.println("Cargando " + toneladas + "t de " + material + ".");
    }
}