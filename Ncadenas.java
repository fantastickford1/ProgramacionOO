import java.util.Scanner;
public class Ncadenas{
	public static void main(String argv[]){
		int repetida=-1;
		Scanner leer = new Scanner(System.in);
    System.out.println("Introducir el numero de cadenas:  ");
    int numero = leer.nextInt();
    String[] s = new String[numero];
		System.out.println("Introducir las cadenas:\n");
		for(int i=0; i<numero; i+=1){
      s[i] = leer.next();
      if(s[0].equals(s[i])){
      repetida+=1;
      }
		}
		System.out.println(repetida + " son iguales a la primera\n");
	}
}
