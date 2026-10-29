package ut1IntroProg;
import java.util.Scanner;

//Verificar si el area con ese numero de campos es legal

public class CamposFutbol {
	
	public static boolean verificarCampos(int iNumeroCampos, int iAreaCampo) {
		 int iCampoMinimo = iNumeroCampos * (90*45);
		 int iCampoMaximo = iNumeroCampos * (120*90);
		 return iAreaCampo >= iCampoMinimo && iAreaCampo <= iCampoMaximo;
		 
	}          

	public static void main(String[] args) {
		//programa principal
		int iNumeroCampos;
		int iAreaCampo;
		System.out.print("Introduce el numero de metros cuadrados: ");
		Scanner sc = new Scanner(System.in);
		iAreaCampo = sc.nextInt();
		System.out.print("Introduce el numero de campos: ");
		iNumeroCampos = sc.nextInt();
		sc.close();
		System.out.println("¿Caben " + iNumeroCampos +" campos en " + iAreaCampo + " metros?");
		System.out.println(verificarCampos(iNumeroCampos, iAreaCampo));

	}

}
