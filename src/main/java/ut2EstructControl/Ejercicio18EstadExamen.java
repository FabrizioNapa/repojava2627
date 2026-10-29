package ut2EstructControl;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Ejercicio18EstadExamen {
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iCeros = 0;
		int iAprobados = 0;
		int iSuspensos = 0;
		int iMediaSuspensos = 0;
		int imediaAprobados = 0;
		for(int i = 1; i<=10; i++) {
			System.out.print("Introduce un numero: ");
			try {
				int nota = sc.nextInt();
				if (nota == 0) {
					
				}
				
			
		}catch(InputMismatchException ime){
			
		}finally {
			}
		}
		
	}
}
