/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Pais;

/**
 *
 * @author Juan Diego Roman
 */
public interface PaisService {
    
    public void crear(Pais pais);

    public List<Pais> listar();
    
}
