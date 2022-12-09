/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package vista;

import controlador.CandidatoControl;
import controlador.DignidadControl;
import controlador.EleccionControl;

/**
 *
 * @author Juan Diego Roman
 */
public class Principal {

    public static void main(String[] args) {
        var candidatoJuan=new CandidatoControl();
        String[]datos= new String [6];
        datos[0]="Juan";
        datos[1]="25";
        datos[2]="no binario";
        datos[3]="quito";
        datos[4]="v";
        datos[5]="2022";
        
        candidatoJuan.crear(datos);
        
        for(var candidato:candidatoJuan.listar()){
            System.out.println("candidato = "+ candidato.toString());
        }
    
        var eleccionJ=new EleccionControl();
        String[]dato= new String [5];
        dato[0]="Paute";
        dato[1]="20";
        dato[2]="12";
        dato[3]="1200";
        dato[4]="Zhumir";
        eleccionJ.crear(dato);
        
        for(var eleccion:eleccionJ.listar()){
            System.out.println("eleccion = "+ eleccion.toString() );
        }
        var dignidadJ=new DignidadControl();
        String[]dat= new String [5];
        dat[0]="Juntos mejor";
        dat[1]="Solidaria";
        dat[2]="regalar plata";
        dat[3]="Pais";
        dat[4]="f";
        
        dignidadJ.crear(dat);
        
        for(var dignidad:dignidadJ.listar()){
            System.out.println("eleccion = "+ dignidad.toString() );
    }
    }
}
