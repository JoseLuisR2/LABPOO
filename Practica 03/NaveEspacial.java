public class NaveEspacial {
    private String nombre;
    private double nivelCombustible;
    private int tripulantes;
    private Motor motor;

    public NaveEspacial(String nombre, int tripulantes, Motor motor) {
        this.setNombre(nombre);
        this.setTripulantes(tripulantes);
        this.nivelCombustible = 100.0;
        this.motor = motor;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        if (nombre != null && nombre.trim().length() >= 3) {
            this.nombre = nombre;
        } else {
            System.out.println("Error de registro: El nombre de la nave debe ser descriptivo y mayor a 2 caracteres.");
        }
    }
    // Validaciones de seguridad
    public int getTripulantes() {
        return tripulantes;
    }

    public void setTripulantes(int tripulantes) {

        if (tripulantes >= 0 && tripulantes <= 10) {
            this.tripulantes = tripulantes;
        } else {
            System.out.println("Alerta: Capacidad de tripulación fuera de rango (Permitido: 0 a 10 ocupantes).");
        }
    }

    public double getNivelCombustible() {
        return nivelCombustible;
    }


    public void setNivelCombustible(double nivel) {
        if (nivel >= 0.0 && nivel <= 100.0) {
            this.nivelCombustible = nivel;
        }
    }


    @Override
    public String toString() {
        return ">>> Expediente Técnico de Nave <<<\n" +
                "Identificador: " + nombre + "\n" +
                "Energía actual: " + nivelCombustible + "%\n" +
                "Personal a bordo: " + tripulantes + " tripulantes\n" +
                "Estado del Motor: " + (motor != null ? motor.toString() : "No asignado");
    }
}