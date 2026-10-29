package ut2EstructControl;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Ejercicio17Factorial {
	
	
	
	public static void main(String[] args) {
		System.out.print("Introduce un numero: ");
		Scanner sc = new Scanner(System.in);
		try {
		int iNum = sc.nextInt();
		int iResultado = Matematicas.factorial(iNum);
		System.out.println("El factorial de "+iNum+" es: "+iResultado);
		} catch (InputMismatchException ime) {
			System.out.println("Introduce un numero entero");
		} catch(Exception e) {
			System.out.println("Ha ocurrido un error");
		}
		finally {
			sc.close();
		}
	}
}
