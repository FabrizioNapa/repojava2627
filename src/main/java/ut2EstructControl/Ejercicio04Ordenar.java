package ut2EstructControl;
import java.util.Scanner;
public class Ejercicio04Ordenar {

	public static void main(String[] args) {
		//Variables con los tres numeros
		int num1;
		int num2;
		int num3;
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime el primer numero: ");
		num1 = sc.nextInt();
		System.out.print("Dime el segundo numero: ");
		num2 = sc.nextInt();
		System.out.print("Dime el tercer numero: ");
		num3 = sc.nextInt();
		int primerNum = 0;
		int segundoNum = 0;
		int tercerNum = 0;
		
		if(num1 > num2 && num1 > num2) {
			primerNum = num1;
			if(num2 > num3){
				segundoNum = num2;
				tercerNum = num3;
			if(num3 > num2);
			segundoNum = num3;
			tercerNum = num2;
			}
		if(num2 > num1 && num2 > num3) {
			
		}	
			
		}
		System.out.println(primerNum + "" + segundoNum + "" + tercerNum);
	}

}
