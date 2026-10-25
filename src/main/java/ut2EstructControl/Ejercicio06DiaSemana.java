package ut2EstructControl;
import java.util.Scanner;
public class Ejercicio06DiaSemana {
	public static void main(String[] args) {
		
		//programa que pide un numero del 1 al 7 y dice el dia que es
		
		Scanner sc = new Scanner(System.in);
		int dia; //dia dado por el usuario
		System.out.print("¿Que numero del dia de la semana?: ");
		dia=sc.nextInt();
		switch(dia) {
			case 1:
				System.out.println("Lunes");
				break;
			case 2:
				System.out.println("Martes");
				break;
			case 3:
				System.out.println("Miercoles");
				break;
			case 4:
				System.out.println("Jueves");
				break;
			case 5:
				System.out.println("Viernes");
				break;
			case 6:
				System.out.println("Sabado");
				break;
			case 7:
				System.out.println("Domingo");
				break;
			default:
				System.out.println("Introduce un numero del 1 al 7");
		}
		
		System.out.println("Fin programa");
	}
}
