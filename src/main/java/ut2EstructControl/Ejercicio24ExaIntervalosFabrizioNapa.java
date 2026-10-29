package ut2EstructControl;
import java.util.InputMismatchException;
import java.util.Scanner;
 
public class Ejercicio24ExaIntervalosFabrizioNapa {
 
/**
* Método suma
* @param int inferior
* @param int superior
* @return int 
* @author JAGD
*/
public static int suma(int inferior, int superior) {
int suma = 0;
//hacemos un for con i valor del inferior hasta que i sea igual o mayor que superior
for (int i =inferior;i<=superior;i++){
	//añadimos el i a la suma
	suma += i;	}
 
return suma;}
 
/**
* Método media
* @param int inferior
* @param int superior
* @return double 
* @author JAGD
*/
public static double media(int inferior, int superior) {
	
double media = 0;
//la media es la suma de los valores divididos entre la cantidad de valores, en este caso 2
media = ((double)inferior + (double)superior)/2;
return media;
}
 
public static void main(String[] args) {
	int iNum = 0;
	int iInferior = 0;
	int iSuperior = 0;
	Scanner sc = new Scanner(System.in);
	try {
		//validamos que sea un numero	
		do{
			System.out.println("");
		System.out.println("--- Menu del programa del alumno Fabrizio ---");
		
		
			System.out.print("Introduce el límite inferior: ");
			//guardamos el dato dado por el usuario
			iInferior = sc.nextInt();
			System.out.print("Introduce el límite Superior: ");
			//guardamos el segundo dato
			iSuperior = sc.nextInt();
			//ejecutamos el menú
			System.out.println("-- MENÚ--");
			System.out.println("1.Calcular suma intervalo");
			System.out.println("2.Calcular media intervalo");
			System.out.println("0.Salir");
			System.out.print("Opcion: ");
			iNum = sc.nextInt();
			if(iNum ==1){
				double dResultado = suma(iInferior,iSuperior);
				System.out.println("La suma del intervalo es: "+dResultado);
			}else if(iNum ==2){
				double dResultado = media(iInferior,iSuperior);
				System.out.println("La media del intervalo es: "+dResultado);
		
			}else if(iNum >2){
				System.out.println("Introduce un numero del 0 al 2");
			}
		}while(iNum == 1 || iNum ==2);
		//nuestra condicion para que se repita
	}catch(InputMismatchException ime){
			//si no es un numero, mostramos el error
			System.out.println("Error. Introduce un numero ");
		}catch(Exception e){
			//en caso de cualquier otro error, lo comunicamos
			System.out.println("Error");
		}finally {
			if (iNum == 0){
				//solo si el usuario eligío salir
				System.out.println("Fin del programa");
			}
			//al finalizar el codigo cerramos el scanner y avisamos al usuario
			sc.close();
			System.out.println("Cerrando recursos...");
		}
		
	
	
	
	}
}
 

