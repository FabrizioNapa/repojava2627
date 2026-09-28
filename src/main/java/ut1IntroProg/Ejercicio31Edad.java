package ut1IntroProg;
import java.util.Scanner;

public class Ejercicio31Edad {

	public static void main(String[] args) {
		int edad;
		System.out.println("Dime tu edad");
		Scanner sc = new Scanner(System.in);
		edad = sc.nextInt();
		sc.close();
		System.out.println("Tu edad el año que viene será de: " + (edad+1));
	}
}
