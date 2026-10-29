package ut2EstructControl;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio16DecimalBinario {
//calculadora decimal a binario
	
	
public static void decimalBinario(int numero) {
	int iBit = 0;
	int iNumOriginal = numero;
	String strResultado = "";
	if (numero == 0) {
		//si el numero es 0
		strResultado = "0";
	} else {
	    while (numero > 0) {
	        iBit = numero & 1;   
	        // Lee el primer bit del numero
	        strResultado = iBit + strResultado;
	        numero >>= 1;     
	        // Desecha el bit que hemos leido
	    }
	}
	//por pantalla el resultado
	System.out.println("El numero " + iNumOriginal + " equivale a: " + strResultado + " en binario");
		
}
	


	public static void main(String[] args) {
		int iNum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero en decimal: ");
		//comprobamos que el numero dado es valido
		try {
			iNum = sc.nextInt();
			decimalBinario(iNum);
		//si el usuario usa algo que no sea un numero en decimal
		}catch(InputMismatchException ime){ 
			System.out.println("Introduce un numero");
		//si hay cualquier otro error	
		}catch(Exception e){
			System.out.println("Ha oocurrido un error");
		//ceramos el escaner para ahorrar recursos	
		}finally {
			sc.close();
		}
	}

}
