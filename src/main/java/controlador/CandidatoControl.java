/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Candidato;
import servicio.CandidatoServiceImpl;
import modelo.Dignidad;

/**
 *
 * @author Juan Diego Roman
 */
public class CandidatoControl {
    
    private CandidatoServiceImpl candidatoServiceImpl;
    
    public CandidatoControl(){
        candidatoServiceImpl = new CandidatoServiceImpl();
    }
    
    public void crear(String [] data){
        var nombreCandidato=data[0];
        var edad=Integer.valueOf(data[1]).intValue();
        var genero=data[2];
        var lugarDeNacimiento=data[3];
        var dignidad=data[4];
        var añoActual=Integer.valueOf(data[5]).intValue();
        var candidato=new Candidato(nombreCandidato, edad, genero, lugarDeNacimiento, dignidad, añoActual );
        this.candidatoServiceImpl.crear(candidato);
    }
    public List<Candidato> listar(){
        return this.candidatoServiceImpl.listar();
    
    }
    
}
