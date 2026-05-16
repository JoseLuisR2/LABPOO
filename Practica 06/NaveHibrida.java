public class NaveHibrida extends NaveEstelar implements Combatiente, Investigador {
    public NaveHibrida(String modelo) {
        super(modelo);
    }

    @Override
    public void realizarMisionPrincipal() {
        System.out.println("Mision de escolta cientifica.");
    }

    @Override
    public void atacar() { System.out.println("Defensa activada."); }

    @Override
    public void recargarEscudos() { System.out.println("Cargando escudos."); }

    @Override
    public void analizarMuestra() { System.out.println("Analisis en curso."); }

    @Override
    public void escanearFirmaEnergetica() { System.out.println("Escaneo listo."); }
}