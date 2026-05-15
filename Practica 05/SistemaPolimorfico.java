public class SistemaPolimorfico {
    public static void main(String[] args) {
        NaveBase[] flota = {
                new NaveTransporte("Carguero-01"),
                new NaveCombate("Interceptor-X"),
                new NaveInvestigacion("Discovery")
        };

        for (NaveBase nave : flota) {
            nave.iniciarCicloOperativo();

            if (nave instanceof NaveCombate) {
                NaveCombate naveAtaque = (NaveCombate) nave;
                naveAtaque.disparar("Piratas Espaciales");
            }

            System.out.println("---");
        }
    }
}