package ut2EstructControl;
import java.util.Scanner;
public class Ejercicio4ForIf {
	//Clasificador de Pares, Impares y Media
	public static void main(String[] args) {
		//definimos nuestas variables
		int numNumeros;
		double media = 0;
		int numPares = 0;
		int numImpares = 0;
		int num;
		//Pedimos el numero de numeros a introducir
		System.out.print("¿Cuantos numeros vas a introducir?: ");
		Scanner sc = new Scanner(System.in);
		numNumeros = sc.nextInt();
		for (int i= 0; i<numNumeros; i++ ) {
			System.out.print("Introduce el numero: ");
			num = sc.nextInt();
				if (num % 2 == 0) {
					numPares++;
					media +=num;
				}
				else if (num % 2 != 0){
					numImpares++;
					media +=num;
				}
		}
		sc.close();
		media = media / numNumeros;
		System.out.println("Resultados:");
		System.out.println("-Cantidad de pares: "+ numPares);
		System.out.println("-Cantidad de impares: "+ numImpares);
		System.out.println("Media total: "+media);
	}
}
