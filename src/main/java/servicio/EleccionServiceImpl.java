/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Eleccion;

/**
 *
 * @author Juan Diego Roman
 */
public class EleccionServiceImpl implements EleccionService {
    
    private List<Eleccion> eleccionList;
    
    public EleccionServiceImpl() {
        eleccionList = new ArrayList<>();
    }

    @Override
    public void crear(Eleccion eleccion) {
        this.eleccionList.add(eleccion);
    }

    @Override
    public List<Eleccion> listar() {
        return this.eleccionList;
    }
    
    
    
}
