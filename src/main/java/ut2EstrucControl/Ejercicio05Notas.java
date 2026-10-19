package ut2EstructControl;
import java.util.Scanner;
public class Ejercicio05Notas {

	public static void main(String[] args) {
		double nota;
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime la nota con o sin decimales: ");
		nota = sc.nextDouble(); 
		sc.close();
		if (nota <= 10 && nota >= 0){
			
			if(nota >= 0 && nota <=2.99) {
				System.out.println("La nota "+nota+" es un Muy deficiente");
			}
			else if(nota >= 3 && nota <=4.99) {
				System.out.println("La nota "+nota+" es un Insuficiente");
			}
			else if(nota >= 5 && nota <=5.99) {
				System.out.println("La nota "+nota+" es un Bien");
			}
			else if(nota >= 6 && nota <=8.99) {
				System.out.println("La nota "+nota+" es un Notable");
			}
			else if(nota >= 9 && nota <=10) {
				System.out.println("La nota "+nota+" es un Sobresaliente");
			}
		}
		else {
			System.out.println("Dame un numero valido");
		}
	}
}
