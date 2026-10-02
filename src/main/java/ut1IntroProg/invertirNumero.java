package ut1IntroProg;

import java.util.Scanner;




public class invertirNumero {

	
public static int invertir(int numero) {
	int d1 = numero % 10;
	int d2 = (numero / 10) % 10;
	int d3 = (numero / 100) % 10;
	int d4 = (numero / 1000) % 10;
	int d5 = (numero / 10000);
	
	System.out.println(d1);
	System.out.println(d2);
	System.out.println(d3);
	System.out.println(d4);
	System.out.println(d5);
	
	int resultado = (d1 * 10000) + (d2 * 1000) + (d3 * 100) + (d4*10) + d5;
	return resultado;
	
	
	}


public static void main(String[] args) {
	int respuesta;
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce un numero de 5 digitos");
	respuesta = sc.nextInt();
	int numeroInvertido = invertir(respuesta);
	System.out.println("El numero era: "+respuesta);
	System.out.println("El numero invertido es: "+ numeroInvertido);
}
}
