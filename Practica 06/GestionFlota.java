import java.util.ArrayList;

public class GestionFlota {
    private ArrayList<NaveEstelar> flota = new ArrayList<>();

    public void agregar(NaveEstelar n) { flota.add(n); }

    public void ejecutarFlota() {
        for (NaveEstelar n : flota) {
            n.mostrarEstatus();
            n.realizarMisionPrincipal();
            if (n instanceof Volable) { ((Volable) n).despegar(); }
            System.out.println("---");
        }
    }

    public static void main(String[] args) {
        GestionFlota g = new GestionFlota();
        g.agregar(new CazaCombate("Interceptor"));
        g.agregar(new SondaExploradora("Discovery"));
        g.agregar(new NaveHibrida("Cerberus"));
        g.ejecutarFlota();
    }
}