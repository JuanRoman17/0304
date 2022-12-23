/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Eleccion;
import servicio.CandidatoServiceImpl;
import servicio.DignidadServiceImpl;
import servicio.EleccionServiceImpl;

/**
 *
 * @author Juan Diego Roman
 */
public class EleccionControl {

    private EleccionServiceImpl eleccionServiceImpl = new EleccionServiceImpl();
    private DignidadServiceImpl dignidadServiceImpl = new DignidadServiceImpl();
    private CandidatoServiceImpl candidatoServiceImpl = new CandidatoServiceImpl();

    public EleccionControl() {
        eleccionServiceImpl = new EleccionServiceImpl();
    }

    public void crear(String[] dato) {
        var canton = dato[0];
        var candidato = this.candidatoServiceImpl.buscarPorLista(Integer.valueOf(dato[1]).intValue());
        var numeroVotos = Integer.valueOf(dato[2]).intValue();
        var dignidad = this.dignidadServiceImpl.buscarPorAlianza(dato[3]);
        var nroEleccion = Integer.valueOf(dato[4]).intValue();
        var eleccion = new Eleccion(canton, candidato, numeroVotos, dignidad, nroEleccion);
        this.eleccionServiceImpl.crear(eleccion);
    }

    public String modificar(String[] dato) {
        var retorno = "No se pudo modificar";

        var canton = dato[0];
        var candidato = this.candidatoServiceImpl.buscarPorLista(Integer.valueOf(dato[1]).intValue());
        var numeroVotos = Integer.valueOf(dato[2]).intValue();
        var dignidad = this.dignidadServiceImpl.buscarPorAlianza(dato[3]);
        var nroEleccion = Integer.valueOf(dato[4]).intValue();
        var eleccion = new Eleccion(canton, candidato, numeroVotos, dignidad, nroEleccion);

        this.eleccionServiceImpl.modificar(eleccion, nroEleccion);
        retorno = "Se modifico";
        return retorno;

    }

    public List<Eleccion> listar() {

        return this.eleccionServiceImpl.listar();

    }

    public void eliminar(int nroElecciones) {

        var nroeleccion = Integer.valueOf(nroElecciones).intValue();
        this.eleccionServiceImpl.eliminar(nroElecciones);

    }

}
