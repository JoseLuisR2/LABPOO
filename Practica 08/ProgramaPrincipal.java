import java.util.*;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        GestorFlota gestor = new GestorFlota();
        Scanner sc = new Scanner(System.in);

        
        String[] tipos = {"Caza", "Carguero", "Explorador"};
        for (int i = 1; i <= 15; i++) {
            gestor.agregarNave(new Nave("NV-" + i, tipos[i % 3], 200 + (i * 50), 10 + (i * 5)));
        }

        int op;
        do {
            System.out.println("\n-- CENTRO DE COMANDO --");
            System.out.println("1. Listar Flota | 2. Buscar ID | 3. Filtrar Criticas | 4. Salir");
            op = sc.nextInt();

            switch (op) {
                case 1 -> gestor.getLista().forEach(System.out::println);
                case 2 -> {
                    System.out.print("ID: ");
                    System.out.println(gestor.buscarPorId(sc.next()));
                }
                case 3 -> gestor.filtrarNavesCriticas().forEach(System.out::println);
            }
        } while (op != 4);
    }
}