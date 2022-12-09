/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Dignidad;
import servicio.DignidadServiceImpl;

/**
 *
 * @author Juan Diego Roman
 */
public class DignidadControl {

    private DignidadServiceImpl dignidadServiceImpl;
    
    public DignidadControl() {
        dignidadServiceImpl = new DignidadServiceImpl();
    }
    
    public void crear(String[] data) {
        var canton = data[0];
        var mesa = Integer.valueOf(data[1]).intValue();
        var numeroVotos = Integer.valueOf(data[2]).intValue();
        var lugarVotacion = data[3];
        var candidato = data[4];
        var dignidad = new Dignidad(canton,mesa,numeroVotos,lugarVotacion,candidato );
        this.dignidadServiceImpl.crear(dignidad);
    }

    public List<Dignidad> listar() {
        return this.dignidadServiceImpl.listar();
        
    }
}
