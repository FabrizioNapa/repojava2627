package ut2EstructControl;
import java.util.Scanner;
public class Ejercicio02Iguales {
	//Programa que pide dos numeros y verifica si son iguales
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//creamos nuestras variables
		int iNum1;
		int iNum2;
		//obtener los numeros
		System.out.print("Dame un numero: ");
		iNum1 = sc.nextInt();
		System.out.print("Dame otro numero: ");
		iNum2 = sc.nextInt();
		//Los condicionales
		sc.close();
		//Si son iguales
		if (iNum1 == iNum2) {
			System.out.println("Los dos numeros son iguales");
		}
		else {
			System.out.println("Los dos numeros no son iguales");
		}
		
	}
	
	
	
	
}
