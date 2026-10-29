package ut1IntroProg;
import java.util.Scanner;
public class Operaciones {
	public static void main(String[] args) {
		//defino variables
		int num1;
		int num2;
		System.out.println("Dame un numero");
		//inicio el escaner
		Scanner sc = new Scanner(System.in);
		//guardo el dato del usuario
		num1 = sc.nextInt();
		System.out.println("Dame otro numero");
		//guardo el segundo dato
		num2 = sc.nextInt();
		//cierro el escaner
		sc.close();
		//muestro las operaciones
		System.out.println("La suma es: "+(num1 + num2));
		System.out.println("La resta es: "+(num1 - num2));
		System.out.println("La multiplicación  es: "+(num1 * num2));
		System.out.println("La división es: "+(num1 / num2));
		
	}
}
