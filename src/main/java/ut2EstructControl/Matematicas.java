package ut2EstructControl;

public class Matematicas {
	public static int factorial(int num) {
		int resultado = 1;
		
		 for (int i = 2;i <= num; i++) {
			 resultado *= i;
		 }
		
		
		
		return resultado; 
	}
}
