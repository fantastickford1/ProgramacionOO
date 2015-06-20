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
public class Administrativos extends Personas{
    
    private String puesto;
    
    public Administrativos(){
        super();
        this.puesto = " ";
    }
    
    public Administrativos(String puesto,String nombre, String sexo, int edad){
        super(nombre,sexo,edad);
        this.puesto = puesto;
    }
    
    public String getPuesto(){
        return this.puesto;
    }
}
