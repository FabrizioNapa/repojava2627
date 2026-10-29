package ut1IntroProg;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class invertirNumeroTest{

    // ==========================================
    // PRUEBAS EJERCICIO 1: EstadoAcademico
    // ==========================================

    @Test
    @DisplayName("EstadoAcademico: Cálculo de media decimal correcto")
    public void testMediaEstadoAcademico() {
        double n1 = 4.5;
        double n2 = 6.8;
        double n3 = 5.2;
        
        double mediaObtenida = EstadoAcademico.Media(n1, n2, n3);
        double mediaEsperada = 5.5;

        // Se incluye un delta (0.0001) para comparar números de tipo double con precisión
        assertEquals(mediaEsperada, mediaObtenida, 0.0001, "La media calculada debería ser 5.5");
    }

    // ==========================================
    // PRUEBAS EJERCICIO 2: DescuentoJoven
    // ==========================================

    @Test
    @DisplayName("DescuentoJoven: Verificación de números pares e impares")
    public void testEsPar() {
        assertTrue(DescuentoJoven.esPar(20), "El número 20 debe devolver true (par)");
        assertFalse(DescuentoJoven.esPar(21), "El número 21 debe devolver false (impar)");
        assertTrue(DescuentoJoven.esPar(0), "El número 0 debe devolver true (par)");
    }

    @Test
    @DisplayName("DescuentoJoven: Rango de Descuento Joven (14 a 26 años inclusive)")
    public void testDescuentoJoven() {
        // Casos dentro del rango (Límites y valor medio)
        assertTrue(DescuentoJoven.Descuento(14), "14 años es el límite inferior y debe aplicar descuento");
        assertTrue(DescuentoJoven.Descuento(20), "20 años está dentro del rango y debe aplicar descuento");
        assertTrue(DescuentoJoven.Descuento(26), "26 años es el límite superior y debe aplicar descuento");

        // Casos fuera del rango
        assertFalse(DescuentoJoven.Descuento(13), "13 años está fuera del rango y no debe aplicar descuento");
        assertFalse(DescuentoJoven.Descuento(27), "27 años está fuera del rango y no debe aplicar descuento");
    }

    @Test
    @DisplayName("DescuentoJoven: Comprobación de mayoría de edad (>= 18)")
    public void testMayorEdad() {
        assertTrue(DescuentoJoven.mayorEdad(18), "18 años es mayor de edad (true)");
        assertTrue(DescuentoJoven.mayorEdad(25), "25 años es mayor de edad (true)");
        assertFalse(DescuentoJoven.mayorEdad(17), "17 años es menor de edad (false)");
    }
}