package ut1IntroProg;
import java.util.Scanner;

public class ExaUt1FabrizioNapa {

//constantes
	
	 public static final double PRECIO_INFANTIL = 5.5;


	 public static final double PRECIO_JUVENIL = 8.2;


	 public static final double PRECIO_ADULTO = 12.5;


	 public static final double PRECIO_SENIOR = 6.0;


	 public static double calcularImporte(int infantiles, int juveniles, int adultos, int seniors) {
		 
		return (infantiles * PRECIO_INFANTIL) + (juveniles * PRECIO_JUVENIL) + (adultos * PRECIO_ADULTO) + (seniors * PRECIO_SENIOR);




	 }


	 

//programa principal
	 public static void main(String[] args) {

		 System.out.print("¿Cuantas entradas infantiles?: ");
		 Scanner sc = new Scanner(System.in);
		 int iNumEntradaInfantiles = sc.nextInt();
		 System.out.print("¿Cuantas entradas juveniles?: ");
		 int iNumEntradaJuveniles = sc.nextInt();
		 System.out.print("¿Cuantas entradas de Adultos?: ");
		 int iNumEntradaAdultos = sc.nextInt();
		 System.out.print("¿Cuantas entradas Senior?: ");
		 int iNumEntradaSenior = sc.nextInt();
		 sc.close();
		 double dPrecio = calcularImporte(iNumEntradaInfantiles,iNumEntradaJuveniles,iNumEntradaAdultos,iNumEntradaSenior);
		 System.out.println("El precio total es de: "+ dPrecio + " Euros");
	 }


	 


	 


	}



