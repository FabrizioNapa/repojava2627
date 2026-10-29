package ut2EstructControl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MatematicasTest {
	 @Test
	    void factorialDeCeroDebeSerUno() {
	        assertEquals(1, Matematicas.factorial(0));
	    }

	    @Test
	    void factorialDeUnoDebeSerUno() {
	        assertEquals(1, Matematicas.factorial(1));
	    }

	    @Test
	    void factorialDeTresDebeSerSeis() {
	        assertEquals(6, Matematicas.factorial(3));
	    }

	    @Test
	    void factorialDeCincoDebeSerCientoVeinte() {
	        assertEquals(120, Matematicas.factorial(5));
	    
	    }
	    }

