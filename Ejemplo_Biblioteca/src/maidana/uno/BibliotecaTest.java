package maidana.uno;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class BibliotecaTest {

	@Test
	public void sinLibrosTest() {
		Biblioteca bibli = new Biblioteca(50);
		assertEquals(0, bibli.cuantosLibros());
	}
	
	@Test
	public void agregarUnLibrosTest() {
		Biblioteca bibli = new Biblioteca(50);
		assertEquals(0, bibli.cuantosLibros());
		Genero infantiles = null;
		bibli.agregarLibro("El Rey Leon", "Chris Sanders", infantiles, 500);
		assertEquals(1, bibli.cuantosLibros());
	}
	
	@Test
	public void sinLugarTest() {
		Biblioteca bibli = new Biblioteca(50);
		assertEquals(0, bibli.cuantosLibros());
		Genero novela = null;
		bibli.agregarLibro("El amor en tiempos de colera", "Gabriel Garcia Marquez", novela, 120);
		assertEquals(1, bibli.cuantosLibros());
		Genero infantiles = null;
		assertFalse(bibli.agregarLibro("El Rey Leon", "Chris Sanders", infantiles, 210));
		Libro esperado = new Libro("El amor en tiempos de colera", "Gabriel Garcia Marquez", 1000);
		assertEquals(esperado.getTitulo(), bibli.libroEnLaPosicion(10));
	}
	
	@Test
	public void consultarSiHayLibrosEnLaPrimeraPosicionTest() {
		Biblioteca bibli = new Biblioteca(50);
		assertEquals(0, bibli.cuantosLibros());
		Genero novela = null;
		bibli.agregarLibro("Cien años de soledad", "Gabriel Garcia Marquez", novela, 300);
		assertEquals("Cien años de soledad", bibli.libroEnLaPosicion(1));
	}

}

