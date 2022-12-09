/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import modelo.Candidato;
/**
 *
 * @author Juan Diego Roman
 */
public class Eleccion {

    private String canton;
    private int mesas;
    private  int nroCandidatos;
    private int numeroVotos;
    private String lugarVotacion;

    public Eleccion(String canton, int mesas, int nroCandidatos, int numeroVotos, String lugarVotacion) {
        this.canton = canton;
        this.mesas = mesas;
        this.nroCandidatos = nroCandidatos;
        this.numeroVotos = numeroVotos;
        this.lugarVotacion = lugarVotacion;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public int getMesas() {
        return mesas;
    }

    public void setMesas(int mesas) {
        this.mesas = mesas;
    }

    public int getNroCandidatos() {
        return nroCandidatos;
    }

    public void setNroCandidatos(int nroCandidatos) {
        this.nroCandidatos = nroCandidatos;
    }

    public int getNumeroVotos() {
        return numeroVotos;
    }

    public void setNumeroVotos(int numeroVotos) {
        this.numeroVotos = numeroVotos;
    }

    public String getLugarVotacion() {
        return lugarVotacion;
    }

    public void setLugarVotacion(String lugarVotacion) {
        this.lugarVotacion = lugarVotacion;
    }

    @Override
    public String toString() {
        return "Eleccion{" + "canton=" + canton + ", mesas=" + mesas + ", nroCandidatos=" 
                + nroCandidatos + ", numeroVotos=" + numeroVotos + ", lugarVotacion=" 
                + lugarVotacion + '}';
    }

    

    
}
