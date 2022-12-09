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
    
    public void crear(String[] dat) {
        var publicidad = dat[0];
        var campaña = dat[1];
        var propuestas = dat[2];
        var alianza = dat[3];
        var eleccion = dat[4];
        var dignidad = new Dignidad(publicidad, campaña, propuestas, alianza, eleccion);
        this.dignidadServiceImpl.crear(dignidad);
    }

    public List<Dignidad> listar() {
        return this.dignidadServiceImpl.listar();
        
    }
}
