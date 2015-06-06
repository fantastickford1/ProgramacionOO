import java.io.InputStream;

public class GetUsers{
  String datos;
  String[] nombre;
  String[] username;
  int usr;

  GetUsers(){
    usr=0;
  }

  String GetDat(){

    char dts;
    String datos = new String("");
    try{
      while((dts=(char)System.in.read()) != '>')
        datos = datos + dts;
    }catch(java.io.IOException ioex){
      }
    return datos;
  }

  void Dividir(String data_in, int cont){
    System.out.println("----------Usuario" + cont + "----------");
    nombre = data_in.split("<");
    System.out.println("Nombre:"+nombre[0].toUpperCase());
    System.out.println("Email: "+nombre[1]);
    username = nombre[1].split("@");
    System.out.println("Username: "+username[0]);
    System.out.println("Dominio: "+username[1]);
    System.out.println("------------------------------------\n");
  }

  public static void main(String argv[]){

    GetUsers pt = new GetUsers();

    String datos;
    int usr=0;

    System.out.println("Numero de usuarios:");
    try{
      usr = System.in.read();
    }catch(java.io.IOException ioex){
    }
    usr = Character.getNumericValue(usr);

    System.out.println("\nIngrese el nombre completo y correo electronico");

    for(int aux=1;aux<=usr;aux++){
      datos = pt.GetDat();
      pt.Dividir(datos,aux);
    }
  }
}
