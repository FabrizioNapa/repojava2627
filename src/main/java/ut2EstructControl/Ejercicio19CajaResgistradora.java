package ut2EstructControl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio19CajaResgistradora {

	public static double descuentos(int producto, double precio) {
		double dDescuento = switch (producto) {
			case 1 -> 10;
			case 2 -> 15;
			case 3 -> 20;
			default -> 0;
		};

		double dPrecioFinal = precio * (1 - dDescuento / 100);
		System.out.println("-> Precio final del artículo (" + dDescuento + "% desc.): " + dPrecioFinal + " €");
		return dPrecioFinal;
	}

	public static void main(String[] args) {
		// Variables
		double dPrecioTotal = 0;
		int iArticuloMayor = 0;
		double dPrecioMayor = 0;
		double dDescuentoEspecial = 100.0;

		System.out.println("--- PROCESANDO COMPRA ---");
		Scanner sc = new Scanner(System.in);

		// Bucle para 3 artículos
		for (int i = 1; i <= 3; i++) {
			System.out.println("\n--- Artículo " + i + " ---");

			try {
				System.out.print("Introduce tipo de producto (1:Camiseta, 2:Pantalón, 3:Chaqueta): ");
				int iArticulo = sc.nextInt();

				if (iArticulo >= 1 && iArticulo <= 3) {
					System.out.print("Introduce el precio original: ");
					double dPrecio = sc.nextDouble();

					// Verificamos si el precio está en el rango válido (1.0 a 500.0)
					if (dPrecio >= 1.0 && dPrecio <= 500.0) {
						// Calculamos el precio con descuento
						double dPrecioConDescuento = descuentos(iArticulo, dPrecio);

						// Acumulamos al total
						dPrecioTotal += dPrecioConDescuento;

						// Verificamos si este artículo es el de mayor precio final
						if (dPrecioConDescuento > dPrecioMayor) {
							dPrecioMayor = dPrecioConDescuento;
							iArticuloMayor = i; // Guardamos la posición del artículo (1, 2 o 3)
						}
					} else {
						System.out.println("-> Error: El precio debe estar entre 1.0 € y 500.0 €.");
						i--; // Sin sc.next() porque el número sí se leyó correctamente
					}
				} else {
					System.out.println("-> Error: Tipo de producto no válido (debe ser 1, 2 o 3).");
					i--; // Sin sc.next()
				}
			} catch (InputMismatchException ime) {
				System.out.println("-> Error: Tipo de dato no válido. Introduce un número.");
				sc.next(); // OBLIGATORIO AQUÍ: limpia las letras atascadas
				i--;
			} catch (Exception e) {
				System.out.println("-> Error inesperado.");
				sc.next();
				i--;
			}
		}

		sc.close();

		// Resumen final de la compra
		System.out.println("\n--- RESUMEN DE COMPRA ---");
		System.out.println("Total a pagar: " + dPrecioTotal + " €");
		System.out.println("Artículo con mayor precio final: Artículo " + iArticuloMayor);
		System.out.println("Estado de la venta: " + (dPrecioTotal > dDescuentoEspecial ? "DESCUENTO ESPECIAL APLICADO" : "VENTA ESTÁNDAR"));
	}
}