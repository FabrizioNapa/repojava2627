package ut2EstructControl;
import java.util.Scanner;
public class Ejercicio14Primos {
	
	private static boolean comprobarPrimo(int num) {
		int i = 2;
		boolean esPrimo = true;
		double raizNum= Math.sqrt(num);
		while (i < raizNum && esPrimo) {
			System.out.println(i);
			System.out.println("El resto de dividir "+num+" y "+i+" es: " +num%i);
			if (num%i==0) {
				esPrimo= false;
			}
			i++;
			
		}
		return esPrimo;
	}
	/*
private static void pintarMenores(int num) {
		for(int i = 1; i<num;i++) {
			
		
		}
	}
*/	
	
	
	public static void main(String[] args) {
		System.out.print("Introduce un numero: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean bNumPrimo = comprobarPrimo(num);
		sc.close();
		if(bNumPrimo)
			System.out.println("El numero "+num +" es primo");
		else
			System.out.println("El numero "+num + " NO es primo");

}}
