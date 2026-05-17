package util;

public class GeneradorReporteTask implements Runnable {
    private String nombreReporte;

    public GeneradorReporteTask(String nombreReporte) {
        this.nombreReporte = nombreReporte;
    }

    @Override
    public void run() {
        try {
            System.out.println("Iniciando generación de reporte: " + nombreReporte);
            Thread.sleep(5000);
            System.out.println("Reporte '" + nombreReporte + "' finalizado con éxito.");
        } catch (InterruptedException e) {
            System.err.println("La generación del reporte fue interrumpida.");
        }
    }
}