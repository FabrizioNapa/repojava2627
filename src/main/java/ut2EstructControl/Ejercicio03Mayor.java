package ut2EstructControl;

import java.util.Scanner;

public class Ejercicio03Mayor {

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
		if (iNum1 < iNum2) {
			System.out.println("El numero mayor es: "+iNum2);
		}
		else if (iNum1 > iNum2){
			System.out.println("El numero mayor es: "+iNum1);
			
		}
		else {
			System.out.println("Los dos numeros son iguales");
		}
		
	}
	
	
	
	
}


