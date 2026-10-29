package ut2EstructControl;
import java.util.Scanner;
public class SimulacroExamUT2 {

	public static void main(String[] args) {
		System.out.println("Programa que suma los km recorridos");
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		int contador = 0;
		int recorridos = 0;
		System.out.print("Dime los kilomeros que has hecho hoy (Numero 0 para salir): ");
		numero = sc.nextInt();
		recorridos += numero;
		int suma = 0;
		while (numero > 0) {
			contador++;
			suma += (2 * recorridos);
			System.out.print("Dime los kilometos mas que has hecho comparado a ayer (Numero 0 para salir): ");
			numero = sc.nextInt();	
			recorridos += numero;
		}	
		sc.close();
		System.out.println("Has recorrido: "+suma+ " km");
	}

}
