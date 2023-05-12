package referencias;

import static org.junit.Assert.*;

import org.junit.Test;

public class CirculoTest {

	@Test
	public void crearCirculoParametrisadoTest() {
		Circulo c1 = new Circulo(2);
		assertNotNull(c1);
	}
	@Test
	public void crearCirculoParametrisadoYpidoRadioTest() {
		Circulo c1 = new Circulo(2);
		assertEquals(2, c1.getRadio(), 0.001);
	}
	public void crearCirculoPorDefaultTest() {
		Circulo c1 = new Circulo();
		assertNotNull(c1);
	}
	@Test
	public void crearCirculoPorDefaultYpidoRadioTest() {
		Circulo c1 = new Circulo();
		assertEquals(1, c1.getRadio(), 0.001);
	}
	@Test
	public void ReferenciasIgualesTest() {
		Circulo c = new Circulo();
		Circulo o = c;
		
		assertTrue(c == o);
		assertTrue(c.equals(o));
	}
	@Test
	public void ReferenciasDistintasTest() {
		Circulo c = new Circulo(1.3);
		Circulo o = new Circulo(1.3);
		
		assertFalse(c == o);
		assertTrue(c.equals(o));
	}
	@Test(expected = Error.class)
	public void radioInvalido() {
		Circulo c = new Circulo(-1);
		
	}
}
