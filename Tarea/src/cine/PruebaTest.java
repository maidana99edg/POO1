package cine;

import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaTest {

	@Test
	public void cargadeButacasTest() {
		SalaDeCine sala = new SalaDeCine(5, 8);
		assertNotNull(sala);
	}

	@Test
	public void ProbarReservaTest() {
		SalaDeCine sala = new SalaDeCine(5, 8);
sala.ocuparButaca(1, 2);
assertTrue(sala.EstaOcupada(1, 2));
	}
	@Test
	public void CantidadTest() {
		SalaDeCine sala = new SalaDeCine(5, 8);
		sala.ocuparButaca(1, 2);
		int esperado = 1;
		int obtenido= sala.cantidadDeButacasOcupadas();

assertEquals(esperado, obtenido, 0);
	}
}
