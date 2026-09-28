package ut1IntroProg;
import java.util.Scanner;



public class Ejercicio33Media {
	
	public static double calcularMedia(double nota1, double nota2) {
		return (double) ((nota1 + nota2) / 2);
	}

	public static void main(String[] args) {
		double nota1;
		double	nota2;
		double media;
		System.out.println("Dame la primera nota");
		Scanner sc = new Scanner(System.in);
		nota1 = sc.nextInt();
		System.out.println("Dame la segunda nota");
		nota2 = sc.nextInt();
		media = calcularMedia(nota1,nota2);
		sc.close();
		System.out.println("Tu nota media es: "+media);
}
	}
