/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Dignidad;

/**
 *
 * @author Juan Diego Roman
 */
public class DignidadServiceImpl implements DignidadService {
    
    private List<Dignidad> dignidadList;

    public DignidadServiceImpl() {
        dignidadList = new ArrayList<>();
    }

    @Override
    public void crear(Dignidad dignidad) {
        this.dignidadList.add(dignidad);
    }

    @Override
    public List<Dignidad> listar() {
        return this.dignidadList;
    }

    @Override
    public Dignidad buscarPorAlianza(String alianza) {
        Dignidad retorno = null;
        for (var dignidad : this.dignidadList) {
            if (alianza == dignidad.getAlianza()) {
                retorno = dignidad;
                break;
            }
        }
        return retorno;
    }

    @Override
    public void modificar(Dignidad dignidad, String alianza) {
        var indice = -1;
        for (var dignidades : this.dignidadList ){
            indice++;
            if(alianza ==dignidades.getAlianza()){
                this.dignidadList.set(indice, dignidad);
            }
        }
    }

    @Override
    public void eliminar(String alianza) {
        var indice = -1;
        for (var dignidades : this.dignidadList) {
            indice++;
            if (alianza == dignidades.getAlianza()) {
                this.dignidadList.remove(indice);

            }

        }
    }
}
