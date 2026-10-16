package ut1IntroProg;
import java.util.Scanner;




public class DescuentoJoven {

public static boolean esPar(int iNumero) {
		return iNumero % 2 == 0;
		
	}

public static boolean Descuento(int iEdad) {
	return iEdad >= 14 && iEdad <= 26;
}

public static boolean mayorEdad(int iEdad) {
	return iEdad >= 18;
}


public static void main(String[] args) {	
System.out.print("Introduce tu edad: ");
Scanner sc = new Scanner(System.in);
int iEdad = sc.nextInt();
sc.close();
boolean bPar = esPar(iEdad);
boolean bDescuento = Descuento(iEdad);
boolean bMayorEdad = mayorEdad(iEdad);
System.out.println("Tu edad es: "+ (bPar == true ? "Par" : "Impar"));
System.out.println("¿Aplica descuento joven?: " + (bDescuento == true ? "Si":"No"));
System.out.println("¿Es mayor de edad? " + bMayorEdad);
	
	
	
}
}
