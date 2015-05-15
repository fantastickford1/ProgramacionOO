import java.util.Scanner;

public class Area{
	public static void main(String argv[]){

		Scanner keyboard = new Scanner(System.in);
		//MENU
		System.out.println("Selecciona la figura a sacar el area");
		System.out.println("1. Circulo");
		System.out.println("2. Rectangulo");
		System.out.println("3. Triangulo");

		int obtn = keyboard.nextInt();

		switch(obtn){
			case 1:{
				System.out.println("Introduce el radio del circulo al cuadrado");
				double radio = keyboard.nextInt();
				double crlA = 3.1416 * radio;
				System.out.println("El area del circulo es: " + radio);
				break;
			}
			case 2:{
				System.out.println("Introduce la base");
				float base = keyboard.nextInt();
				System.out.println("Introduce la altura");
				float altura = keyboard.nextInt();
				float rectA = base * altura;
				System.out.println("El area del rectangulo es: " + rectA);
				break;
			}
			case 3:{
				System.out.println("Introduce la base");
				float base = keyboard.nextInt();
				System.out.println("Introduce la altura");
				float altura = keyboard.nextInt();
				float trnA = (base * altura)/2;
				System.out.println("El area del triangulo es: " + trnA);
				break;
			}
			default:
				System.out.println("Obcion invalida");
		}
	}
}