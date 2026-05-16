public class SondaExploradora extends NaveEstelar implements Volable, Investigador {
    public SondaExploradora(String modelo) {
        super(modelo);
    }

    @Override
    public void realizarMisionPrincipal() {
        System.out.println("Explorando nebulosa.");
    }

    @Override
    public void despegar() { System.out.println("Sonda iniciando vuelo."); }

    @Override
    public void aterrizar() { System.out.println("Sonda regresando a base."); }

    @Override
    public void analizarMuestra() { System.out.println("Muestra analizada."); }

    @Override
    public void escanearFirmaEnergetica() { System.out.println("Lectura de energia completa."); }
}