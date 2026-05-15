public class SondaLigera extends NaveExploracion {
    public SondaLigera(String nombre) {
        super(nombre, "Radiacion Gamma");
    }

    @Override
    public void realizarMision() {
        System.out.println(nombre + " desplegando mini sondas de reconocimiento.");
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Sonda: " + nombre + " | Bateria: " + energia + "%");
        System.out.println("Modo: Sigilo activo.");
    }

    @Override
    public void activarSistemas() {
        super.activarSistemas();
        System.out.println("Encendiendo camaras de alta resolucion.");
    }
}