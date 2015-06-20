/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Equipo03;

/**
 *
 * @author Karlos
 */
public class Profesores extends Personas {
    
    private String folio;
    
    
    
    public Profesores(){
        super();
        this.folio = " ";
    }
    
    public Profesores(String folio,String nombre, String sexo, int edad){
        super(nombre,sexo,edad);
        this.folio = folio;
    }
    
    public String getFolio(){
        return folio;
    }
    
    
}
