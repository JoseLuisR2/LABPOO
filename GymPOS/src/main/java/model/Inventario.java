package model;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Equipo> listaEquipos = new ArrayList<>();

    public void agregarEquipo(Equipo e) {
        listaEquipos.add(e);
    }

    public List<Equipo> getEquipos() {
        return listaEquipos;
    }
}