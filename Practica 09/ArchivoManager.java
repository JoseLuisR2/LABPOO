import java.io.*;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ArchivoManager {
    private final String DIR_BASE = "datos_flota";

    public ArchivoManager() {
        try {
            Files.createDirectories(Paths.get(DIR_BASE));
        } catch (IOException e) {
            System.err.println("Error al crear directorio base.");
        }
    }

    public void exportarJSON(List<NaveRegistro> naves) {
        StringBuilder sb = new StringBuilder("[\n");
        for (int i = 0; i < naves.size(); i++) {
            sb.append(naves.get(i).toJSON());
            if (i < naves.size() - 1) sb.append(",");
            sb.append("\n");
        }
        sb.append("]");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(DIR_BASE + "/flota.json"))) {
            bw.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<NaveRegistro> leerCSV(String ruta) {
        List<NaveRegistro> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] columnas = linea.split(",");
                if (columnas.length >= 3) {
                    lista.add(new NaveRegistro(columnas, columnas, Integer.parseInt(columnas)));
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error al procesar archivo.");
        }
        return lista;
    }

    public void backupManual(String nombreArchivo) {
        String ts = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
        Path origen = Paths.get(DIR_BASE, nombreArchivo);
        Path destino = Paths.get(DIR_BASE, "backup_" + ts + "_" + nombreArchivo);
        try {
            if (Files.exists(origen)) {
                Files.copy(origen, destino);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}