public class CajaNegra implements AutoCloseable {
    public void registrarVuelo(String datos) {
        System.out.println("Grabando en caja negra: " + datos);
    }

    @Override
    public void close() {
        System.out.println("Caja negra cerrada y sellada correctamente.");
    }
}