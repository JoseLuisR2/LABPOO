public class CazaCombate extends NaveEstelar implements Volable, Combatiente {
    public CazaCombate(String modelo) {
        super(modelo);
    }

    @Override
    public void realizarMisionPrincipal() {
        System.out.println("Patrullando espacio profundo.");
    }

    @Override
    public void despegar() { System.out.println("Caza despegando."); }

    @Override
    public void aterrizar() { System.out.println("Caza aterrizando."); }

    @Override
    public void atacar() { System.out.println("Lanzando misiles."); }

    @Override
    public void recargarEscudos() { System.out.println("Escudos al maximo."); }
}