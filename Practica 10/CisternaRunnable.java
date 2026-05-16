public class CisternaRunnable implements Runnable {
    private TanqueCombustible tanque;

    public CisternaRunnable(TanqueCombustible tanque) {
        this.tanque = tanque;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(3000);
                tanque.recargar(200);
            }
        } catch (InterruptedException e) {
            System.out.println("[SISTEMA] Cisterna fuera de servicio.");
        }
    }
}