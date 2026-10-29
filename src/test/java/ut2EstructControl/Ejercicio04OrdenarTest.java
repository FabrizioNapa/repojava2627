package ut2EstructControl;


import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Ejercicio04OrdenarTest {

    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;
    private ByteArrayOutputStream outContent;

    @BeforeEach
    void setUpStreams() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    @Test
    void testCaso1_Num1Mayor() {
        // Caso: num1 > num2 && num2 > num3 (Ej: 9, 5, 2 -> 952)
        String input = "9\n5\n2\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Ejercicio04Ordenar.main(new String[]{});

        String output = outContent.toString().trim();
        assertTrue(output.endsWith("952"));
    }

    @Test
    void testCaso2_Num1YNum3() {
        // Caso: num1 > num2 && num3 > num2 (Ej: 9, 2, 5 -> 952)
        String input = "9\n2\n5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Ejercicio04Ordenar.main(new String[]{});

        String output = outContent.toString().trim();
        assertTrue(output.endsWith("952"));
    }

    @Test
    void testCaso3_Num2Mayor() {
        // Caso: num2 > num1 && num1 > num3 (Ej: 3, 7, 1 -> 731)
        String input = "3\n7\n1\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Ejercicio04Ordenar.main(new String[]{});

        String output = outContent.toString().trim();
        assertTrue(output.endsWith("731"));
    }

    @Test
    void testCaso4_Num2YNum3() {
        // Caso: num2 > num1 && num3 > num1 (Ej: 1, 7, 3 -> 731)
        String input = "1\n7\n3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Ejercicio04Ordenar.main(new String[]{});

        String output = outContent.toString().trim();
        assertTrue(output.endsWith("731"));
    }

    @Test
    void testCaso5_Num3YNum2() {
        // Caso: num3 > num1 && num2 > num1 (Ej: 2, 5, 8 -> 852)
        String input = "2\n5\n8\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Ejercicio04Ordenar.main(new String[]{});

        String output = outContent.toString().trim();
        assertTrue(output.endsWith("852"));
    }

    @Test
    void testCaso6_Num3YNum1() {
        // Caso: num3 > num1 && num1 > num2 (Ej: 5, 2, 8 -> 852)
        String input = "5\n2\n8\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Ejercicio04Ordenar.main(new String[]{});

        String output = outContent.toString().trim();
        assertTrue(output.endsWith("852"));
    }
}