import java.io.*;
import java.util.List;

public class SerializadorNaves {
    public static void guardar(List<NaveRegistro> naves, String ruta) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta))) {
            oos.writeObject(naves);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public static List<NaveRegistro> cargar(String ruta) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta))) {
            return (List<NaveRegistro>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return null;
        }
    }
}