package uno.edu.ar;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ArregloTest {

	@Test
	public void OrdenadoTest() {
		Arreglos arreglos = new Arreglos();
		int [] v1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int [] v2 = {1, 3, 3, 4, 5, 0};
		
		assertFalse(arreglos.estaOrdenado(v1));
		assertTrue(arreglos.estaOrdenado(v2));
		
		
		
	}

	
		
	

}
