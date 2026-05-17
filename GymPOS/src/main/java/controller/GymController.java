package controller;

import model.*;
import util.Serializador;
import util.GeneradorReporteTask;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GymController {
    private List<Cliente> listaClientes;
    private Inventario inventario;
    private final String ARCHIVO_DATOS = "clientes.dat";
    private ExecutorService executor = Executors.newSingleThreadExecutor();

    public GymController() {
        this.listaClientes = Serializador.cargarDatos(ARCHIVO_DATOS);
        if (this.listaClientes == null || this.listaClientes.isEmpty()) {
            this.listaClientes = new ArrayList<>();
            for (int i = 1; i <= 20; i++) {
                listaClientes.add(new Cliente("ID-" + i, "Cliente " + i, i % 2 == 0 ? "Anual" : "Mensual"));
            }
            Serializador.guardarDatos(listaClientes, ARCHIVO_DATOS);
        }
        this.inventario = new Inventario();
        inventario.agregarEquipo(new Equipo("Mancuernas 10kg", 15, "Excelente"));
        inventario.agregarEquipo(new Equipo("Caminadora Pro", 5, "Mantenimiento"));
    }

    public void agregarCliente(Cliente c) {
        listaClientes.add(c);
        Serializador.guardarDatos(listaClientes, ARCHIVO_DATOS);
    }

    public void renovarSuscripcion(Cliente c, boolean esAnual) {
        c.setMembresia(esAnual ? "Anual" : "Mensual");
        c.setPuntos(c.getPuntos() + 100);
        Serializador.guardarDatos(listaClientes, ARCHIVO_DATOS);
    }

    public List<Cliente> getListaClientes() { return listaClientes; }
    public List<Equipo> getInventario() { return inventario.getEquipos(); }
    public void ejecutarReporteHilo(String nombre) { executor.submit(new GeneradorReporteTask(nombre)); }
    public void cerrarServicio() { executor.shutdown(); }
}