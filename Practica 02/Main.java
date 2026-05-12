public class Main {
    public static void main(String[] args) {

        GestionFlota miAgencia = new GestionFlota();


        NaveEspacial n1 = new NaveEspacial("Falcon 9", "SpaceX", 22, 100.0);
        NaveEspacial n2 = new NaveEspacial("Vostok 1", "URSS", 5, 45.0);


        NaveEspacial n3 = new NaveEspacial("Starship", "Starship Corp");
        NaveEspacial n4 = new NaveEspacial("Discovery", "NASA");


        NaveEspacial n5 = new NaveEspacial(n1);


        miAgencia.registrarNave(n1);
        miAgencia.registrarNave(n2);
        miAgencia.registrarNave(n3);
        miAgencia.registrarNave(n4);
        miAgencia.registrarNave(n5);


        System.out.println("- Iniciando operaciones -");
        n1.ejecutarDespegue();
        n3.programarTrayectoria("Marte");
        n4.realizarRevisionTecnica();
        n2.recargarEnergia(30.5);


        miAgencia.mostrarReporteGeneral();

        String busqueda = "Discovery";
        System.out.println("Buscando nave: " + busqueda);
        NaveEspacial encontrada = miAgencia.buscarNavePorNombre(busqueda);
        if (encontrada != null) {
            System.out.println("Resultado: " + encontrada.obtenerReporteSistemas());
        }
    }
}