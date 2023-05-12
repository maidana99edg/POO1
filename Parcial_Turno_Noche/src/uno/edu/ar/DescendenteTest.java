package uno.edu.ar;

import static org.junit.Assert.*;

import org.junit.Test;

public class DescendenteTest {

	@Test
	public void ultimaPosicionTest() {
		ListaDeReproduccion laPrevia = new ListaDeReproduccion(3);
		laPrevia.agregarCancion("DON OMAR", "BANDOLERO", 4);
		laPrevia.agregarCancion("DADDY YANKY", "CON CALMA", 5);
		int esperado = 2;
		int obtenido = laPrevia.cantidadDeCanciones();
		assertEquals(esperado, obtenido);
	}

}
