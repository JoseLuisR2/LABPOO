public class NaveHilo extends Thread {
    private TanqueCombustible tanque;
    private String nombre;

    public NaveHilo(String nombre, TanqueCombustible tanque) {
        this.nombre = nombre;
        this.tanque = tanque;
    }

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            tanque.extraer(150, nombre);
            try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}