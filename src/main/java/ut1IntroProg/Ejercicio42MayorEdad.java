package ut1IntroProg;
import java.util.Scanner;

public class Ejercicio42MayorEdad {

	public static void main(String[] args) {
	int iAnioNacimiento;
	int iAnioActual;
	System.out.println("Dime tu año de nacimiento");
	Scanner sc = new Scanner(System.in);
	iAnioNacimiento = sc.nextInt();
	System.out.println("En que año estamos?");
	iAnioActual = sc.nextInt();
	sc.close();
	int iEdad = iAnioActual - iAnioNacimiento;
	System.out.println("Tu edad es de "+iEdad + (iEdad >= 18 ? ". Eres mayor de edad":". Eres menor de edad"));
	}

}
