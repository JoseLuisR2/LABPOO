import java.util.List;
import java.util.Scanner;

public class ProgramaIO {
    public static void main(String[] args) {
        ArchivoManager am = new ArchivoManager();
        Scanner sc = new Scanner(System.in);

        System.out.println("--- GESTION DE ARCHIVOS ---");
        System.out.println("1. Importar CSV | 2. Guardar Binario | 3. Exportar JSON | 4. Backup");
        int op = sc.nextInt();

        List<NaveRegistro> flota = am.leerCSV("naves.csv");

        switch (op) {
            case 2:
                SerializadorNaves.guardar(flota, "datos_flota/flota.dat");
                break;
            case 3:
                am.exportarJSON(flota);
                break;
            case 4:
                am.backupManual("flota.json");
                break;
            default:
                System.out.println("Operacion terminada.");
        }
    }
}