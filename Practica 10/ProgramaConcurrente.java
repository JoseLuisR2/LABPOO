import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProgramaConcurrente {
    public static void main(String[] args) {
        TanqueCombustible tanque = new TanqueCombustible();

        NaveHilo nave1 = new NaveHilo("Destructor-01", tanque);
        NaveHilo nave2 = new NaveHilo("Caza-04", tanque);

        Thread cisterna = new Thread(new CisternaRunnable(tanque));
        cisterna.setDaemon(true);

        ExecutorService pool = Executors.newFixedThreadPool(2);

        System.out.println("--- INICIANDO SIMULACION DE ESTACION ---");

        nave1.start();
        nave2.start();
        cisterna.start();

        pool.execute(() -> {
            for(int i=0; i<3; i++) {
                tanque.extraer(50, "Sonda-Automatica");
                try { Thread.sleep(500); } catch (InterruptedException e) {}
            }
        });

        pool.shutdown();
    }
}