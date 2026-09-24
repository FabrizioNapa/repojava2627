package ut1IntroProg;
import java.util.Scanner;
public class Ejercicio2Entrada {

	public static void main(String[] args) {
		//Programa que pida un numero por pantalla y lo muestre
		int num ;
		System.out.print("Escribe un numero del 1 al 10");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		System.out.println("El numero leido es: "+num);
		sc.close();
	}

}
