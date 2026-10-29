package ut2EstructControl;
import java.util.Scanner;
public class Ejercicio3While {

	public static void main(String[] args) {
		System.out.println("Programa que suma numeros positivos");
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		int contador = 0;
		System.out.print("Dime un numero positivo (Numero 0 para salir): ");
		numero = sc.nextInt();
		int suma = 0;
		while (numero > 0) {
			contador++;
			suma += numero;
			System.out.print("Dime un numero positivo (Numero 0 para salir): ");
			numero = sc.nextInt();	
			
		}	
		sc.close();
		System.out.println("Has introducido "+contador+" numeros positivos");
		System.out.println("La suma total es de: "+suma);
	}

}
