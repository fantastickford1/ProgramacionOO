import java.io.InputStream;

public class GetUsers{
  String datos;
  String nombre;
  String username;
  String dominio;

  /*String GetName(String datos){
  }
  String GetEmail(String datos){
  }
  String GetUsername(String datos){
  }
  String GetDominio(String datos){
  }*/
  String GetDat(int num_usr){
    System.out.println("\nIngrese el nombre completo y correo electronico");
    char dts;
    String datos = new String("");
    for(int aux=1;aux<=num_usr;aux++){
      try{while((dts=(char)System.in.read()) != '\n')
        datos = datos + dts;
      }catch(java.io.IOException ioex){
      }
    }
    return datos;
  }

  public static void main(String argv[]){

    GetUsers usuarios = new GetUsers();

    System.out.println("Numero de Usuarios a ingresar?");
    int obtion=0;
    try{
      obtion=System.in.read();
      obtion = Character.getNumericValue(obtion);
    }catch(java.io.IOException ioex){
    }
    System.out.println(obtion);
    usuarios.GetDat(obtion);

  }



}
