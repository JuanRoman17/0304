/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Provincia;

/**
 *
 * @author Juan Diego Roman
 */
public class ProvinciaServiceImpl implements ProvinciaService {
    
    private List<Provincia> provinciaList;

    public ProvinciaServiceImpl() {
        provinciaList = new ArrayList<>();
    }

    @Override
    public void crear(Provincia provincia) {
        this.provinciaList.add(provincia);
    }

    @Override
    public List<Provincia> listar() {
        return this.provinciaList;
    }
}
