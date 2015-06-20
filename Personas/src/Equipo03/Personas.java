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
public class Personas {
    
    private String nombre;
    private String sexo;
    private int edad;
    
    public Personas(){
        this.nombre = " ";
        this.edad = 0;
        this.sexo = " ";
    }
    
    public Personas(String nombre, String sexo, int edad){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    public String GetName(){

        return this.nombre;
    }
    
    public String GetSexo(){
        return this.sexo;
    }
    
    public int GetEdad(){
        return this.edad;
    }
    
}
