/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Eleccion;

/**
 *
 * @author Juan Diego Roman
 */
public interface EleccionService {
    
    public void crear(Eleccion eleccion);

    public List<Eleccion> listar();
    
}
