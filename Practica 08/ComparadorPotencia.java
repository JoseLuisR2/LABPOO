import java.util.Comparator;

public class ComparadorPotencia implements Comparator<Nave> {
    @Override
    public int compare(Nave n1, Nave n2) {
        return Integer.compare(n2.getPotencia(), n1.getPotencia());
    }
}