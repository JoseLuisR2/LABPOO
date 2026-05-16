public class SimuladorEspacial {
    public static void main(String[] args) {
        NaveOperaciones op = new NaveOperaciones();

        try (CajaNegra cn = new CajaNegra()) {
            cn.registrarVuelo("Mision Marte");
            op.realizarViaje(10, "A1-B2");
        } catch (CombustibleInsuficienteException e) {
            System.err.println("LOG [WARNING]: " + e.getMessage());
        } catch (SistemaCriticoException e) {
            System.err.println("LOG [CRITICAL]: " + e.getMessage() + " | " + e.getDetallesTecnicos());
        } catch (FlotaException e) {
            System.err.println("LOG [ERROR]: " + e.getMessage());
        } finally {
            System.out.println("Simulacion finalizada.");
        }
    }
}