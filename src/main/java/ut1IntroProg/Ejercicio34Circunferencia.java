package ut1IntroProg;

import java.util.Scanner;

public class Ejercicio34Circunferencia {
	
	//funcion para calcular area de la circunferencia
	public static double areaCircunferencia(double radio) {
		double PI =3.1416;
		return (radio * radio) * PI;
	}
	
	//funcion calcular longitud
	public static double longitudCircunferencia(double radio) {
		return radio * 2;
	}
	
	public static void main(String[] args) {
		//Las variables pueden contener decimales
		double area;
		double longitud;
		double radio;
		System.out.println("Programa para calcular el area y logitud de una circunferencia");
		System.out.println("Dime el radio");
		//recibir el radio
		Scanner sc = new Scanner(System.in);
		radio = sc.nextDouble();
		sc.close();
		area = areaCircunferencia(radio);
		longitud = longitudCircunferencia(radio);
		System.out.println("El area de la circunferencia es de: "+area);
		System.out.println("La logitud de la circunferencia es de: "+longitud);
		
		

	}

}
