package ut1IntroProg;
import java.util.Scanner;

public class EstadoAcademico {
	
	//metodo para saber si está aprobado o no
	public static double Media(double dNota1, double dNota2,double dNota3) {
		double media;
		media = (dNota1 + dNota2 + dNota3) / 3;
		return media;
		
		}
	//programa base
	public static void main(String[] args) {
		System.out.println("Programa para saber la media del alumno y saber si esta aprobado");
		Scanner sc = new Scanner(System.in);
		System.out.println("Porfavor, digite la primera nota con decimales");
		double dNota1;
		dNota1 = sc.nextDouble();
		double dNota2;
		System.out.println("Porfavor, digite la segunda segunda nota con decimales");
		dNota2 = sc.nextDouble();
		System.out.println("Porfavor, digite la tercera nota con decimales");
		double dNota3;
		dNota3 = sc.nextDouble();
		sc.close();
		double dMedia = Media(dNota1,dNota2,dNota3);
		int iMedia = (int) dMedia;
		System.out.println("La nota media del expediente es de: "+dMedia);
		System.out.println("La nota media del boletin  es de: "+iMedia);
		System.out.println("Estado del alumno: " + (dMedia >=5.0 ? "APROBADO":"SUSPENSO"));
	}

}
