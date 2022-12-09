/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Candidato;

/**
 *
 * @author Juan Diego Roman
 */
public class CandidatoServiceImpl implements CandidatoService {

    private List<Candidato> candidatoList;

    public CandidatoServiceImpl() {
        candidatoList = new ArrayList<>();
    }

    @Override
    public void crear(Candidato candidato) {
        this.candidatoList.add(candidato);
    }

    @Override
    public List<Candidato> listar() {
        return this.candidatoList;
    }

}
