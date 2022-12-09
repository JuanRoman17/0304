/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Juan Diego Roman
 */
public class Candidato {

    private String nombreCandidato;
    private int edad;
    private String genero;
    private String lugarDeNacimiento;
    private String religion;
    private int añoActual;

    public Candidato(String nombreCandidato, int edad, String genero, String lugarDeNacimiento, String religion, int añoActual) {
        this.nombreCandidato = nombreCandidato;
        this.edad = edad;
        this.genero = genero;
        this.lugarDeNacimiento = lugarDeNacimiento;
        this.religion = religion;
    }

    public String getNombreCandidato() {
        return nombreCandidato;
    }

    public void setNombreCandidato(String nombreCandidato) {
        this.nombreCandidato = nombreCandidato;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getLugarDeNacimiento() {
        return lugarDeNacimiento;
    }

    public void setLugarDeNacimiento(String lugarDeNacimiento) {
        this.lugarDeNacimiento = lugarDeNacimiento;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public int getAñoActual() {
        return añoActual;
    }

    public void setAñoActual(int añoActual) {
        this.añoActual = añoActual;
    }

    @Override
    public String toString() {
        return "Candidato{" + "nombreCandidato=" + nombreCandidato + ", edad="
                + edad + ", genero=" + genero + ", lugarDeNacimiento="
                + lugarDeNacimiento + ", religion=" + religion + ", a\u00f1oActual="
                + añoActual + '}';
    }

}
