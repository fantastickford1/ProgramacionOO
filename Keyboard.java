import java.io.InputStream;

public class Keyboard{

  char c;
  String phrase;
  String sentence;

  Keyboard(){
  }

  Keyboard(char ch, String ph, String sent){
    c = ch;
    phrase = ph;
    sentence = sent;
  }


  char ReadKey(){
    char c=0;
    System.out.println("Ingresa un caracter");
    try{
      c=(char)System.in.read();
    }catch(java.io.IOException ioex){
    }
    return c;
  }

  String ReadLogKeyboard(){
    char b=0;
    String phrase = new String("");
    System.out.println("Ingresa una frase");
    try{
      while((b=(char)System.in.read()) != '\n')
        phrase = phrase + b;
    }catch(java.io.IOException ioex){
    }
    return phrase;
  }

  String ReadLogKeyUnt(){
    char d=0;
    String sentence = new String("");
    System.out.println("Ingresa una frase(2)");
    try{
      while((d=(char)System.in.read()) != '*')
        sentence = sentence + d;
    }catch(java.io.IOException ioex){
    }
    return sentence;
  }

  void PrintAll(){
    System.out.println("El caracter ingresado es: " + c);
    System.out.println("La frase (1) es: " + phrase);
    System.out.println("La frase (2) es: " + sentence);
  }

  public static void main(String[] args) {

  Keyboard in = new Keyboard();
  String frt = in.ReadLogKeyboard();
  char dig = in.ReadKey();
  String scd = in.ReadLogKeyUnt();

  Keyboard out = new Keyboard(dig,frt,scd);

  out.PrintAll();
  }

}
