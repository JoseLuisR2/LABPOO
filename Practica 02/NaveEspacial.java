public class NaveEspacial {

    private String nombre;
    private String modelo;
    private int capacidadCarga;
    private double nivelCombustible;
    private boolean enOrbita;




    public NaveEspacial(String nombre, String modelo, int capacidadCarga, double combustible) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.capacidadCarga = capacidadCarga;
        this.nivelCombustible = combustible;
        this.enOrbita = false;
    }


    public NaveEspacial(String nombre, String modelo) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.capacidadCarga = 50;
        this.nivelCombustible = 100.0;
        this.enOrbita = false;
    }


    public NaveEspacial(NaveEspacial otraNave) {
        this.nombre = otraNave.nombre + " M II";
        this.modelo = otraNave.modelo;
        this.capacidadCarga = otraNave.capacidadCarga;
        this.nivelCombustible = otraNave.nivelCombustible;
        this.enOrbita = false;
    }




    public void ejecutarDespegue() {
        if (nivelCombustible > 25.0) {
            enOrbita = true;
            nivelCombustible -= 20.5;
            System.out.println("Sistemas OK. " + nombre + " se encuentra ahora en orbita.");
        } else {
            System.out.println("Falla en el lanzamiento: Combustible insuficiente.");
        }
    }


    public void recargarEnergia(double cantidad) {
        if (cantidad > 0) {
            nivelCombustible += cantidad;
            if (nivelCombustible > 100) nivelCombustible = 100;
            System.out.println("Recarga finalizada. Nivel: " + nivelCombustible + "%");
        }
    }


    public String obtenerReporteSistemas() {
        String estado = enOrbita ? "En orbita" : "En hangar";
        return "Reporte [" + nombre + "] - Modelo: " + modelo + " - Estado: " + estado;
    }


    public void realizarRevisionTecnica() {
        if (!enOrbita) {
            System.out.println("Revisión de turbinas y fuselaje para " + nombre + " completada.");
        } else {
            System.out.println("No se puede realizar mantenimiento en pleno vuelo.");
        }
    }


    public void programarTrayectoria(String destino) {
        System.out.println("Calculando coordenadas hacia: " + destino);
        System.out.println("Trayectoria cargada en el ordenador de la nave " + nombre);
    }


    public String getNombre() {

        return nombre;
    }
}