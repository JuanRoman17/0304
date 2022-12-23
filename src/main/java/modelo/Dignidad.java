/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Juan Diego Roman
 */
public class Dignidad {

    private String publicidad;
    private String campaña;
    private String propuestas;
    private String alianza;
    

    public Dignidad(String publicidad, String campaña, String propuestas, String alianza) {
        this.publicidad = publicidad;
        this.campaña = campaña;
        this.propuestas = propuestas;
        this.alianza = alianza;
       
    }

    public Dignidad(String publicidad, String campaña, String propuestas, String alianza, String eleccion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getPublicidad() {
        return publicidad;
    }

    public void setPublicidad(String publicidad) {
        this.publicidad = publicidad;
    }

    public String getCampaña() {
        return campaña;
    }

    public void setCampaña(String campaña) {
        this.campaña = campaña;
    }

    public String getPropuestas() {
        return propuestas;
    }

    public void setPropuestas(String propuestas) {
        this.propuestas = propuestas;
    }

    public String getAlianza() {
        return alianza;
    }

    public void setAlianza(String alianza) {
        this.alianza = alianza;
    }

    

    @Override
    public String toString() {
        return "Dignidad{" + "publicidad=" + publicidad + ", campa\u00f1a=" 
                + campaña + ", propuestas=" + propuestas + ", alianza=" + alianza 
                 + '}';
    }

    

}
