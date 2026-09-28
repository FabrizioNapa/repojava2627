package ut1IntroProg;
import java.util.Scanner;


public class Ejercicio32Anyos {

	public static void main(String[] args) {
		int anioActual;
		int anioNacimiento;
		System.out.println("Dime en que año estamos");
		Scanner sc = new Scanner(System.in);
		anioActual = sc.nextInt();
		System.out.println("Dime en que año naciste");
		anioNacimiento = sc.nextInt();
		sc.close();
		System.out.println("Tu edad es de: "+ (anioActual-anioNacimiento));
	}

}
