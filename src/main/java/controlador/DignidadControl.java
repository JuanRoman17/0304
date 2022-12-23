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
        
        var dignidad = new Dignidad(publicidad, campaña, propuestas, alianza);
        this.dignidadServiceImpl.crear(dignidad);
    }
    
    public String modificar(String[] dat){
        var retorno = "No se pudo crear";
        
        var publicidad = dat[0];
        var campaña = dat[1];
        var propuestas = dat[2];
        var alianza = dat[3];
        
        var dignidad = new Dignidad(publicidad, campaña, propuestas, alianza);
        
        this.dignidadServiceImpl.modificar(dignidad, alianza);
        retorno = "Dignidad"+ dignidad.getAlianza()+"Modificado";
        return retorno;
    }
    

    public List<Dignidad> listar() {
        return this.dignidadServiceImpl.listar();
        
    }
    public void eliminar(String alianzas){
        
        var alianza = alianzas;
        this.dignidadServiceImpl.eliminar(alianza);
    }
}
