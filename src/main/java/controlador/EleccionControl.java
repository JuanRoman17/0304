/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Eleccion;
import servicio.EleccionServiceImpl;

/**
 *
 * @author Juan Diego Roman
 */
public class EleccionControl {

    private EleccionServiceImpl eleccionServiceImpl;

    public EleccionControl() {
        eleccionServiceImpl = new EleccionServiceImpl();
    }

    public void crear(String[] data) {
        var publicidad = data[0];
        var campaña = data[1];
        var propuestas = data[2];
        var alianza = data[3];
        var beneficio = data[4];
        var eleccion = new Eleccion(publicidad,campaña,propuestas,alianza,beneficio);
        this.eleccionServiceImpl.crear(eleccion);
    }

    public List<Eleccion> listar() {
        return this.eleccionServiceImpl.listar();

    }

}
