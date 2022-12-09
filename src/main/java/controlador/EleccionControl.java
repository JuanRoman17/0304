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

    public void crear(String[] dato) {
        var canton = dato[0];
        var mesas = Integer.valueOf(dato[1]).intValue();
        var nrocandidatos=Integer.valueOf(dato[2]).intValue();
        var numeroVotos = Integer.valueOf(dato[3]).intValue();
        var lugarVotacion = dato[4];
        var eleccion = new Eleccion(canton,mesas,nrocandidatos,numeroVotos, lugarVotacion );
        this.eleccionServiceImpl.crear(eleccion);
    }

    public List<Eleccion> listar() {
        return this.eleccionServiceImpl.listar();

    }

}
