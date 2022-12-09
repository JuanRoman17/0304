/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Juan Diego Roman
 */
public class Canton {
    
    private String nombre;
    private double expancionTerritorial;
    private double nroHabitantes;
    private Pais pais;
    private Provincia provincia;
    
public Canton(String nombre, double expancionTerritorial, double nroHabitantes, Pais pais, Provincia provincia) {
        this.nombre = nombre;
        this.expancionTerritorial = expancionTerritorial;
        this.nroHabitantes = nroHabitantes;
        this.pais = pais;
        this.provincia = provincia;
    }

    public Canton(String nombre, double expancionTerritorial, double nroHabitantes, String pais, String provincia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getExpancionTerritorial() {
        return expancionTerritorial;
    }

    public void setExpancionTerritorial(double expancionTerritorial) {
        this.expancionTerritorial = expancionTerritorial;
    }

    public double getNroHabitantes() {
        return nroHabitantes;
    }

    public void setNroHabitantes(double nroHabitantes) {
        this.nroHabitantes = nroHabitantes;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Canton{" + "nombre=" + nombre + ", expancionTerritorial=" + expancionTerritorial + ", nroHabitantes=" + nroHabitantes + ", pais=" + pais + ", provincia=" + provincia + '}';
    }


    
    
}
