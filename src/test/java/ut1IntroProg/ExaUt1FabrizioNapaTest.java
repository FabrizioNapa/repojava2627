//Plantilla del JunitTest, cambia lo que necesites.
package ut1IntroProg;
 
import static org.junit.jupiter.api.Assertions.*;
 
import org.junit.jupiter.api.Test;
 
class ExaUt1FabrizioNapaTest {
 
@Test
void testSoloInfantiles() {
double resultado = ExaUt1FabrizioNapa.calcularImporte(2, 0, 0, 0);
 
assertEquals(11.0, resultado, 0.001);
}
 
@Test
void testSoloJuveniles() {
double resultado = ExaUt1FabrizioNapa.calcularImporte(0, 3, 0, 0);
 
assertEquals(24.6, resultado, 0.001);
}
 
@Test
void testSoloAdultos() {
double resultado = ExaUt1FabrizioNapa.calcularImporte(0, 0, 2, 0);
 
assertEquals(25.0, resultado, 0.001);
}
 
@Test
void testSoloSenior() {
double resultado = ExaUt1FabrizioNapa.calcularImporte(0, 0, 0, 4);
 
assertEquals(24.0, resultado, 0.001);
}
 
@Test
void testTodosLosTipos() {
double resultado = ExaUt1FabrizioNapa.calcularImporte(2, 1, 1, 1);
 
assertEquals(37.7, resultado, 0.001);
}
 
@Test
void testSinEntradas() {
double resultado = ExaUt1FabrizioNapa.calcularImporte(0, 0, 0, 0);
 
assertEquals(0.0, resultado, 0.001);
}
 
}