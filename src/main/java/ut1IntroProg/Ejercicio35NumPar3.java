package ut1IntroProg;

import java.util.Scanner;

public class Ejercicio35NumPar3{

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println("Programa para saber si el numero es o no es par.");
        System.out.println("Introduce un numero");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        sc.close();
        System.out.println("El numero " + numero + " es par? "+esPar(numero));
    }
}

