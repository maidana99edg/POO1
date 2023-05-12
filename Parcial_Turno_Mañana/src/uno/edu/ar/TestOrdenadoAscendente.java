package uno.edu.ar;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestOrdenadoAscendente {

	@Test
	public void OrdenadoTest() {
		
	VerificacionDeOrden verificacion = new VerificacionDeOrden();
		int [] v1 = {54, 25, 86, 12, 65};
		int [] v2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int [] v3 = {1, 1, 1, 1, 1, 1};
		assertTrue(verificacion.estaOrdenadoAscendentemente(v1));
		assertTrue(verificacion.estaOrdenadoAscendentemente(v2));
		//assertTrue(verificacion.estaOrdenadoAscendentemente(v3));

	}
}
