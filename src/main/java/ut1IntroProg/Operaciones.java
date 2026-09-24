package ut1IntroProg;
import java.util.Scanner;
public class Operaciones {
	public static void main(String[] args) {
		int num1;
		int num2;
		System.out.println("Dame un numero");
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		System.out.println("Dame otro numero");
		num2 = sc.nextInt();
		sc.close();
		System.out.println("La suma es: "+(num1 + num2));
		System.out.println("La resta es: "+(num1 - num2));
		System.out.println("La multiplicación  es: "+(num1 * num2));
		System.out.println("La división es: "+(num1 / num2));
		
	}
}
