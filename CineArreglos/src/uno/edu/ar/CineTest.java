package uno.edu.ar;

import static org.junit.Assert.*;

import org.junit.Test;

public class CineTest {

	@Test
	public void EstaOcupadaTest() {
		SalaDeCine sala1 = new SalaDeCine(30, 5);
		sala1.OcuparButaca(1, 3);
		sala1.OcuparButaca(2, 2);
		assertTrue(sala1.estaOcupada(2, 3));
		
	}

}
