package uno.com.ar;

import static org.junit.Assert.*;

import org.junit.Test;

public class NotaTest {

	@Test
	public void InicializarNotaTest() {
	Nota Juan = new Nota(10);
	int esperado = 10;
	int obtenido = Juan.obtenerValor();
	assertEquals(esperado, obtenido);
	}
	public void AproboTest() {
		Nota Juan = new Nota(10);
		assertTrue(Juan.aprobado());
		}
	public void DesaproboTest() {
		Nota Juan = new Nota(3);
		assertTrue(Juan.desaprobado());
		}
}
