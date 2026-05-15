public class NaveBase {
    protected String nombre;
    protected double energia;

    public NaveBase(String nombre) {
        this.nombre = nombre;
        this.energia = 100.0;
    }

    public void realizarMision() {
        System.out.println(nombre + " iniciando protocolo base de mision.");
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + " | Energia: " + energia + "%");
    }

    public void activarSistemas() {
        System.out.println("Sistemas generales encendidos.");
    }
}