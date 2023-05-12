package uno.edu.ar;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmpleadoTest {

	@Test
	public void PorDefaulfTest() {
		Gerente pablo = new Gerente();
		assertEquals(" ", pablo.getNombre());
		assertEquals(0, pablo.getSueldo(), 0.001);
	}
	@Test
	public void CreoUnGerenteParametizadoTest() {
		Gerente pablo = new Gerente("Edgar", 800.61);
		assertEquals("Edgar", pablo.getNombre());
		assertEquals(1601.22, pablo.getSueldo(), 0.001);
		
	}

}
