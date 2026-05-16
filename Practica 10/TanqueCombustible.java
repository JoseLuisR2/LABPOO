public class TanqueCombustible {
    private int litros = 500;

    public synchronized void extraer(int cantidad, String nave) {
        while (litros < cantidad) {
            try {
                System.out.println("[ALERTA] " + nave + " esperando combustible. Tanque insuficiente.");
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        litros -= cantidad;
        System.out.println("[SUMINISTRO] " + nave + " extrajo " + cantidad + "L. Quedan: " + litros + "L.");
        notifyAll();
    }

    public synchronized void recargar(int cantidad) {
        litros += cantidad;
        System.out.println("[ESTACION] Tanque recargado con " + cantidad + "L. Total: " + litros + "L.");
        notifyAll();
    }
}