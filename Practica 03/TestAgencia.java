public class TestAgencia {
    public static void main(String[] args) {

        Motor motorPrueba = new Motor("Nuclear", 800);
        NaveEspacial nave = new NaveEspacial("Vanguard", 4, motorPrueba);

        System.out.println("= Inicio depruebas =");


        System.out.println("Prueba 1 (Lectura): " + nave.getNombre() + " con " + nave.getTripulantes() + " personas.");


        System.out.println("\nPrueba 2: Intentando asignar nombre 'X'...");
        nave.setNombre("X");

        System.out.println("Nombre actual tras error: " + nave.getNombre());


        System.out.println("\nPrueba 3: Intentando asignar 99 tripulantes...");
        nave.setTripulantes(99);

        System.out.println("Tripulantes tras error: " + nave.getTripulantes());


        System.out.println("\nPrueba 4: Asignando valores válidos (Nombre: Explorer, Tripulantes: 10)...");
        nave.setNombre("Explorer");
        nave.setTripulantes(10);

        if (nave.getNombre().equals("Explorer") && nave.getTripulantes() == 10) {
            System.out.println("Resultado: PRUEBA SUPERADA");
        }


        System.out.println("\nPrueba 5: Verificación de reporte final:");
        System.out.println(nave.toString());

        System.out.println("\n=== FIN DE LAS PRUEBAS ===");
    }
}