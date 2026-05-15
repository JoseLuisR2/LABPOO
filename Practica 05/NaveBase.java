public abstract class NaveBase implements OperacionesNave {
    protected String nombre;
    protected double energia;

    public NaveBase(String nombre) {
        this.nombre = nombre;
        this.energia = 100.0;
    }

    public abstract void realizarMision();

    public final void iniciarCicloOperativo() {
        System.out.println("Iniciando sistemas de " + nombre);
        realizarMision();
        double consumo = calcularConsumoEnergia(100);
        energia -= consumo;
        System.out.println("Energia restante: " + energia + "%");
    }

    public String getNombre() {
        return nombre;
    }
}