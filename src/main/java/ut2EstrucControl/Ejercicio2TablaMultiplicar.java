package ut2EstrucControl;
import java.util.Scanner;
public class Ejercicio2TablaMultiplicar {

	public static void main(String[] args) {
		int numMax;
		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.print("Dame un numero: ");
		numero = sc.nextInt();
		System.out.print("Has que numero quieres que se multiplica (Incluido el mismo): ");
		numMax = sc.nextInt();
		sc.close();
		int resultado;
		int contador = 0;
		for (int i = 1; i <= numMax; i ++) {
			resultado = numero * i;
			System.out.println(numero +" x "+ i +" = " +resultado);
			contador += resultado; 
		}
		System.out.println("La suma total es de: " + contador);

	}

}
