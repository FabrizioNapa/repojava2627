package ut2EstructControl;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio15Num {

	public static void main(String[] args) {
		System.out.print("Introduce un numero: ");
		Scanner sc = new Scanner(System.in);
		try {
		int iNum1 = sc.nextInt();
		System.out.println("Numero leído: "+iNum1);
		} catch (InputMismatchException ime){
			System.err.println("Error al leer el numero, debe ser un numero entero");
			//ime.prinStackTrace();
		}
		finally {
			sc.close();
		}
	}

}
