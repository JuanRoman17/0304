/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Candidato;

/**
 *
 * @author Juan Diego Roman
 */
public interface CandidatoService {

    public void crear(Candidato candidato);

    public List<Candidato> listar();

}
