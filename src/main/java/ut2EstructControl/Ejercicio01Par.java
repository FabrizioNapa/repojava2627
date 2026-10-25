package ut2EstructControl;
import java.util.Scanner;
public class Ejercicio01Par {

	
	
	public static void main(String[] args) {
		//Programa que pide un numero y dice si es par o impar
		Scanner sc = new Scanner(System.in);
		int iNum;
		System.out.print("Introduzca un numero: ");
		iNum = sc.nextInt();
		//El numero es par
		if (iNum % 2 == 0){
			System.out.println("El numero "+iNum+" es par");
		}
		//El numero es impar
		else{
			System.out.println("El numero "+iNum+" es impar");
	
		}
	
		sc.close();
	}
	
}
