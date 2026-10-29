package ut1IntroProg;
import java.util.Scanner;

public class Ejercicio41MayorMenor {

	public static void main(String[] args) {
		int  iNumb1;
		int iNumb2;
		System.out.println("Dame un numero");
		Scanner sc = new Scanner(System.in);
		iNumb1 = sc.nextInt();
		System.out.println("Dame otro numero");
		iNumb2 = sc.nextInt();
		sc.close();
		System.out.println(iNumb1>iNumb2 ? "El numero "+iNumb1+" es mayor que "+iNumb2:"El numero "+iNumb2+" es mayor que "+iNumb1);

	}

}
