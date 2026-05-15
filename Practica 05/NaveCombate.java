public class NaveCombate extends NaveBase {
    public NaveCombate(String nombre) {
        super(nombre);
    }

    @Override
    public void realizarMision() {
        System.out.println(nombre + " patrullando sector.");
    }

    @Override
    public double calcularConsumoEnergia(int distancia) {
        return distancia * 1.2;
    }

    @Override
    public boolean realizarMantenimiento() {
        System.out.println("Revisando armamento.");
        return true;
    }

    public void disparar() {
        System.out.println("Fuego!");
    }

    public void disparar(int rafagas) {
        System.out.println("Fuego " + rafagas + " veces!");
    }

    public void disparar(String objetivo) {
        System.out.println("Fuego contra " + objetivo + "!");
    }
}