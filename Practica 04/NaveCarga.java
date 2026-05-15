public class NaveCarga extends NaveBase {
    private int capacidadTonelaje;

    public NaveCarga(String nombre, int capacidad) {
        super(nombre);
        this.capacidadTonelaje = capacidad;
    }

    @Override
    public void realizarMision() {
        System.out.println(nombre + " transportando " + capacidadTonelaje + " toneladas de recursos.");
    }

    @Override
    public void mostrarEstado() {
        super.mostrarEstado();
        System.out.println("Estado de bodega: Cargada al maximo.");
    }

    @Override
    public void activarSistemas() {
        System.out.println("Activando gruas y sellos de presion.");
    }
}