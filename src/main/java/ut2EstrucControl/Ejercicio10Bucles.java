package ut2EstrucControl;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio10Bucles {

	public static void main(String[] args) {
		//for sencillo del 1 al 10
		
		System.out.print("Cuenta ascendente: ");
		for (int i = 1; i <= 10; i++) {
		    System.out.print(i+" ");
		}
		
		System.out.print("\nCuenta decendente: ");
		for (int i = 10; i > 0 ; i--) {
		    System.out.print(i+" ");
		}
		
		System.out.print("\nNúmeros impares: ");
		for (int i = 0; i < 20 ; i+=2) {
		    System.out.print(i+" ");
		}
		
		//con un for la suma de los primeros 100 números
		
		System.out.print("\nLa suma de los primero 100 números: ");
		int suma=0;
		for (int i = 0; i <= 100; i++) {
			suma=suma+i;
		}
		System.out.print(suma);
		
		/*Siguiete nivel */
		
		System.out.println("\nMatriz 3x3");
		for (int i = 1; i <= 3 ; i++) {
			for (int j = 1; j <=3; j++) {
				System.out.print("("+i+", "+j+")");
			}
			System.out.println();
		}
		
		
		//Triangulo
		System.out.println("Vamos a pintar un triangulo alineado a la derecha");
		
		for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
		
		System.out.println("\nVamos a pintar un triangulo alineado a la izquierda");

		for (int i = 1; i <= 5; i++) {
		    for (int j = 1; j <= i; j++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
		
		int i=5;
		int j=++i;
		int k=i++;
		System.out.println("i="+i);
		System.out.println("j="+j);
		System.out.println("k="+k);
		
	}

}
