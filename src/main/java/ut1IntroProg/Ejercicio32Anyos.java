package ut1IntroProg;
import java.util.Scanner;


public class Ejercicio32Anyos {
	//función
	
	public static int calcularEdadActual(int anioActual, int anioNacimiento) {
		return anioActual - anioNacimiento;
	}

	public static void main(String[] args) {
		//Variables
		int anioActual;
		int anioNacimiento;
		int edad;
		//Enviamos mensaje
		System.out.println("Dime en que año estamos");
		//Escaneamos
		Scanner sc = new Scanner(System.in);
		//Guardamos el input
		anioActual = sc.nextInt();
		System.out.println("Dime en que año naciste");
		//Guardamos el siguiente input
		anioNacimiento = sc.nextInt();
		//Cerramos el escan
		sc.close();
		//Llamamos a la funcion y guardamos el dato
		edad = calcularEdadActual(anioActual,anioNacimiento);
		//Mostramos al usuario
		System.out.println("Tu edad es de: "+ edad);
	}

}
