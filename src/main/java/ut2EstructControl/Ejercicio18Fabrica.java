package ut2EstructControl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio18Fabrica {

	public static void main(String[] args) {
		// Variables necesarias
		int iLoteDefectuoso = 0;
		int iTotalDefectuosos = 0;
		int iMayorDefectuoso = -1; // Inicializado en -1 para que cualquier valor >= 0 sea el primer máximo
		int iDefectuosos = 0;
		int iControl = 50;

		// Mostramos el mensaje por pantalla
		System.out.println("--- CONTROL DE CALIDAD DIARIO ---");
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 6; i++) {
			System.out.print("Introduce piezas defectuosas del Lote " + i + ": ");
			
			// Validamos los datos
			try {
				iDefectuosos = sc.nextInt(); 

				// Comprobamos que los datos entran en nuestro rango
				if (iDefectuosos >= 0 && iDefectuosos <= 100) {
					// Añadimos el dato al total
					iTotalDefectuosos += iDefectuosos;

					// Comprobamos si este es el lote más defectuoso
					if (iDefectuosos > iMayorDefectuoso) {
						iMayorDefectuoso = iDefectuosos; // Guardamos el nuevo récord de piezas
						iLoteDefectuoso = i;             // Guardamos el número del lote
					}
				} else {
					System.out.println("-> Error: La cantidad debe estar entre 0 y 100.");
					i--; // Volvemos a pedir este mismo lote
				}
			} catch (InputMismatchException ime) {
				// El dato no es un número
				System.out.println("-> Error: Tipo de dato no válido. Debe ser un número.");
				sc.next(); // OBLIGATORIO: Limpia el buffer para no entrar en bucle infinito
				i--;       // Volvemos a pedir este mismo lote
			} catch (Exception e) {
				// Ha ocurrido otro tipo de error
				System.out.println("-> Error: Ha ocurrido un error inesperado.");
				sc.next();
				i--;
			}
		}

		sc.close();

		System.out.println("--- RESUMEN DEL DÍA ---");
		System.out.println("Lote con más defectuosas: Lote " + iLoteDefectuoso);
		System.out.println("Total de piezas defectuosas: " + iTotalDefectuosos);
		System.out.println("Estado del control diario: " + (iControl > iTotalDefectuosos ? "APROBADO" : "RECHAZADO"));
	}
}