package ut1IntroProg;

import java.util.Scanner;

public class Ejercicio35NumPar {
	
	public static int comprobarPar(int numero) {
		return numero % 2;
	}

	public static void main(String[] args) {
		//programa para detectar si es par o impar
		
		int numero;
		int resto;
		System.out.println("Programa para saber si el numero es o no es par.");
		System.out.println("Introduce un numero");
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		sc.close();
		if (numero == 0) {
			System.out.println("El numero no es ni par ni impar, es 0.");
		
		}else if(numero != 0) {
			resto = comprobarPar(numero);
			if (resto == 0) {
				System.out.println("El numero "+numero+" es par");
				}
			else if(resto == 1) {
				System.out.println("El numero "+numero+" es impar");
				}
		}
		
			
	}
		
		
		
}


