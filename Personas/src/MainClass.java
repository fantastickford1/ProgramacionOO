import Equipo03.Alumnos;
import Equipo03.Administrativos;
import Equipo03.Profesores;
public class MainClass {
    
   public static void main(String[] args) {
       
       //recibe: String matricula,String carrera,String grupo,int grado,String nombre, String sexo, int edad 
       Alumnos a = new Alumnos("3457794","IDS","A",3,"Juan","Masculino",158);
       //recibe: String folio,String nombre, String sexo, int edad
       Profesores p = new Profesores("SDW7984","Dr. Pimentel","Masculino",25);
       
       //recibe: String puesto,String nombre, String sexo, int edad
       Administrativos ad = new Administrativos("Rectoria","Jesica","Femenino",25);
       
       //datos de alumnos//
       System.out.println("\nEl alumno tiene los siguientes datos:");
       System.out.println(a.GetName());
       System.out.println(a.GetEdad());
       System.out.println(a.getCarrera());
       
       //datos de maestro//
       System.out.println("\nLos datos de x maestro es:");
       System.out.println(p.GetName());
       System.out.println(p.getFolio());
       System.out.println(p.GetEdad());
       
       //daros de Administrativo//
       System.out.println("\nLos datos de x Administrativo");
       System.out.println(ad.GetName());
       System.out.println(ad.getPuesto());
       System.out.println(ad.GetEdad());
       
       
       System.out.println("\n\nIntegranres de Equipo");
       System.out.println("Kevin Serrano - 133369");
       System.out.println("Luis Angel Farelo Toledo - 143404");
       System.out.println("Ericel Nucamendi Jose - 133407");
       System.out.println("Javier de Jesus Flores Herrera - 143372");
       System.out.println("Carlos Alejandro Zenteno Robles - 143382");
    }
}
