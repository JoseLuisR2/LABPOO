import java.util.Comparator;

public class ComparadorCombustible implements Comparator<Nave> {
    @Override
    public int compare(Nave n1, Nave n2) {
        return Double.compare(n1.getCombustible(), n2.getCombustible());
    }
}