package ut1IntroProg;

import java.util.Scanner;

public class Ejercicio35NumPar {
	
	public static int esPar(int numero) {
		return numero % 2;
	}

	public static void main(String[] args) {
		//programa para detectar si es par o impar
		int numero;
		int resto;
		System.out.println("Programa para saber si el numero es o no es par.");
		System.out.println("Introduce un numero");
		//leo el numero del usuario
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		sc.close();
		resto = esPar(numero);
		if (resto == 0) {
			System.out.println("El numero "+numero+" es par");
				}
		//si el numero dado es par	
		else{
			System.out.println("El numero "+numero+" es impar");
				}
		}
		
			
	}
		
		
		


