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
public class Alumnos extends Personas {
    
    private String matricula;
    private int grado;
    private String grupo;
    private String carrera;
    
    public Alumnos(){
        super();
        this.matricula= " ";
        this.grado = 0;
        this.carrera = " ";
        this.grupo = " ";
    }
    
    public Alumnos(String matricula,String carrera,String grupo,int grado,String nombre, String sexo, int edad){
        super(nombre,sexo,edad);
        this.matricula = matricula;
        this.carrera = carrera;
        this.grado = grado;
        this.grupo = grupo;
    }
    
    public String getMatricula(){
        return this.matricula;
    }
    
    public String getCarrera(){
        return this.carrera;
    }
    
    public String getGrupo(){
        return this.grupo;
    }
    
    public int getGrado(){
        return this.grado;
    }
    
    
    
}
