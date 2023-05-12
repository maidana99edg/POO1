package uno.edu.ar.com;

import static org.junit.Assert.*;

import org.junit.Test;

public class PuntoTest {

	@Test
	public void distanciaAOtroPuntoTest() {
		Punto punto1 = new Punto(100.0, 200.0);
		Punto punto2 = new Punto(400.0, 800.0);
		double esperado = 670.82;
		double obtenido = punto1.distanciaAotroPunto(punto2);
		assertEquals(esperado, obtenido, 0.001);
	}

}
