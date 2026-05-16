import java.util.*;
import java.util.stream.Collectors;

public class GestorFlota {
    private List<Nave> listaPrincipal = new ArrayList<>();
    private Set<String> idsUnicos = new HashSet<>();
    private Map<String, Nave> mapaBusqueda = new HashMap<>();
    private Queue<String> historialMisiones = new LinkedList<>();

    public void agregarNave(Nave n) {
        if (idsUnicos.add(n.getId())) {
            listaPrincipal.add(n);
            mapaBusqueda.put(n.getId(), n);
            historialMisiones.offer("Nave " + n.getId() + " registrada.");
        }
    }

    public List<Nave> filtrarNavesCriticas() {
        return listaPrincipal.stream()
                .filter(n -> n.getPotencia() > 500 && n.getCombustible() < 30.0)
                .collect(Collectors.toList());
    }

    public void eliminarNave(String id) {
        Iterator<Nave> it = listaPrincipal.iterator();
        while (it.hasNext()) {
            if (it.next().getId().equals(id)) {
                it.remove();
                idsUnicos.remove(id);
                mapaBusqueda.remove(id);
                break;
            }
        }
    }

    public List<Nave> getLista() { return listaPrincipal; }
    public Nave buscarPorId(String id) { return mapaBusqueda.get(id); }
}