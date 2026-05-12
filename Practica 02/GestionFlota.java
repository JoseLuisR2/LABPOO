import java.util.ArrayList;

public class GestionFlota {
    private ArrayList<NaveEspacial> listaNaves;

    public GestionFlota() {
        this.listaNaves = new ArrayList<>();
    }


    public void registrarNave(NaveEspacial n) {
        listaNaves.add(n);
        System.out.println("Sistema: Nave '" + n.getNombre() + "' registrada en la flota.");
    }


    public NaveEspacial buscarNavePorNombre(String nombreBusqueda) {
        for (NaveEspacial nave : listaNaves) {
            if (nave.getNombre().equalsIgnoreCase(nombreBusqueda)) {
                return nave;
            }
        }
        return null;
    }


    public void mostrarReporteGeneral() {
        System.out.println("\n-Estado actual de la flota-");
        if (listaNaves.isEmpty()) {
            System.out.println("No hay naves registradas en el hangar.");
        } else {
            for (NaveEspacial nave : listaNaves) {
                System.out.println(nave.obtenerReporteSistemas());
            }
        }
    }
}


