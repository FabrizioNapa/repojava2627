package ut1IntroProg;
import java.util.Scanner;

public class Ejercicio31Edad {
	
	public static int calcularEdadProximoAnio(int edadquelepaso) {
		return edadquelepaso +1;
	}

	public static void main(String[] args) {
		//defino edad
		int edad;
		//Le muestro el mensaje
		System.out.println("Dime tu edad");
		
		Scanner sc = new Scanner(System.in);
		edad = sc.nextInt();
		sc.close();
		int siguienteEdad = calcularEdadProximoAnio(edad);
		
		System.out.println("Tu edad el año que viene será de: " + siguienteEdad);
	}
}
