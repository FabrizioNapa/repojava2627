package ut2EstructControl;

import java.util.Scanner;

public class SimulacroExamUT2prueba2 {

    public static String diasSemana(int numero) {
        return switch (numero) {
            case 1 -> "lunes";
            case 2 -> "martes";
            case 3 -> "miercoles";
            case 4 -> "jueves";
            case 5 -> "viernes";
            case 6 -> "sabado";
            case 7 -> "domingo";
            default -> "";
        };
    }

    public static void main(String[] args) {

        int iMayor = 0;
        int iMenor = 0;
        int iNum;
        int iDiaMalo = 0;
        int iDiaBueno = 0;
        int iDomingo = 0;
        int iMedia = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la recaudacion de martes a domingo");

        for (int i = 2; i < 8; i++) {

            String dia = diasSemana(i);
            System.out.print("Recaudacion del " + dia + ": ");

            iNum = sc.nextInt();

            // Inicializar mayor y menor con el primer dato
            if (i == 2) {
                iMayor = iNum;
                iMenor = iNum;
                iDiaBueno = i;
                iDiaMalo = i;
            } else {
                if (iNum > iMayor) {
                    iMayor = iNum;
                    iDiaBueno = i;
                }

                if (iNum < iMenor) {
                    iMenor = iNum;
                    iDiaMalo = i;
                }
            }

            // Guardar la recaudacion del domingo
            if (i == 7) {
                iDomingo = iNum;
            } else {
                // Sumar de martes a sabado
                iMedia += iNum;
            }
        }

        System.out.println("Peor dia: " + diasSemana(iDiaMalo));
        System.out.println("Mejor dia: " + diasSemana(iDiaBueno));

        // Comparar el domingo con la media de martes a sabado
        double media = iMedia / 5.0;

        System.out.println(iDomingo < media ? "SI" : "NO");

        sc.close();
    }
}