package ut2EstructControl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio24ExaIntervalosFabrizioNapaTest{

	@Test
    void testSuma() {
        assertEquals(25,
        		Ejercicio24ExaIntervalosFabrizioNapa.suma(3, 7));
    }

    @Test
    void testSumaUnSoloNumero() {
        assertEquals(5,
        		Ejercicio24ExaIntervalosFabrizioNapa.suma(5, 5));
    }

    @Test
    void testMedia() {
        assertEquals(5.0,
        		Ejercicio24ExaIntervalosFabrizioNapa.media(3, 7));
    }

    @Test
    void testMediaDecimal() {
        assertEquals(2.5,
        		Ejercicio24ExaIntervalosFabrizioNapa.media(1,4 ));
    }

}
