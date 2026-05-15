import java.util.ArrayList;

public class CentroControl {
    private ArrayList<NaveBase> flota;

    public CentroControl() {
        flota = new ArrayList<>();
    }

    public void agregarNave(NaveBase n) {
        flota.add(n);
    }

    public void ejecutarOperaciones() {
        for (NaveBase n : flota) {
            n.activarSistemas();
            n.realizarMision();
            n.mostrarEstado();
            System.out.println("----------");
        }
    }

    public static void main(String[] args) {
        CentroControl control = new CentroControl();

        control.agregarNave(new NaveCarga("Titan", 500));
        control.agregarNave(new NaveExploracion("Voyager", "Lidar"));
        control.agregarNave(new SondaLigera("Drone-X"));

        control.ejecutarOperaciones();
    }
}