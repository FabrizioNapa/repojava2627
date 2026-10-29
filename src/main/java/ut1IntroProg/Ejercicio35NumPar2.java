package ut1IntroProg;

import java.util.Scanner;

public class Ejercicio35NumPar2 {
	
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
		//si el numero dado es 0
		if (numero == 0) {
			System.out.println("El numero no es ni par ni impar, es 0.");
			
		//si el numero dado no es par
		}else if(numero != 0) {
			resto = esPar(numero);
			if (resto == 0) {
				System.out.println("El numero "+numero+" es par");
				}
		//si el numero dado es par	
			else if(resto == 1) {
				System.out.println("El numero "+numero+" es impar");
				}
		}
		
			
	}
		
		
		
}


