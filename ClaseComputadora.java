public class Computadora{   //creacion de clase

    String keyboard;
    String color;
    String marca;

    int getSpeed(){
      return 0;
    }

    int getSizeHD(){
      return 0;
    }

    public static void main(String argv[]){ //crecion de objeto
      int a=5, b=6;
      a=b;
      Computadora compuDeGabriel, cloneCDG;
      compuDeGabriel = new Computadora();
      cloneCDG = compuDeGabriel;
      cloneCDG.color = "Cafe";
      compuDeGabriel.keyboard = "Espanol";
      compuDeGabriel.color = "Blanca";
      compuDeGabriel.marca = "HarryPotter";

      System.out.println("La Computadora de grabriel es de color " + cloneCDG.color);

    }
}
