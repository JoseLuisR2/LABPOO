public abstract class NaveEstelar {
    protected String modelo;
    protected int nivelEnergia;

    public NaveEstelar(String modelo) {
        this.modelo = modelo;
        this.nivelEnergia = 100;
    }

    public abstract void realizarMisionPrincipal();

    public void mostrarEstatus() {
        System.out.println("Modelo: " + modelo + " | Energia: " + nivelEnergia + "%");
    }
}