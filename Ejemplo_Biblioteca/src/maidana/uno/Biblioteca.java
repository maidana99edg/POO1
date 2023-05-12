package maidana.uno;

public class Biblioteca {
	private Libro[] libros;
	private int cantLibros = 0;
	private int posicionDelLibroConMasPaginas = 0;
	
	
	public Biblioteca(int maxCantidadDeLibros) {
		this.libros = new Libro[maxCantidadDeLibros];
	}
	
	public int cuantosLibros() {
		return this.cantLibros;
	}
	
	public boolean agregarLibro(String titulo, String autor, Genero genero, int paginas) {
		if(this.cantLibros < getMaximaCantidadDeLibros()) {
			libros[cantLibros] = new Libro(titulo, autor, paginas);
			setPosicionDelLibroConMasPaginas();
			cantLibros++;
			return true;
		}
		return false;
	}
	
	public String libroEnLaPosicion(int posicion) {
		return libros[posicion - 1].getTitulo();	
	}
	
	public Libro libroConMasPaginas() {
		return libros[posicionDelLibroConMasPaginas];
	}
	
	public int cuantosLibrosDelAutor(String autor) {
		int contar = 0;
		for(int i = 0; i < this.cantLibros; i++)
			contar++;
		return contar;
	}
	
	public int tiempoEnLeerTodosLosLibros() {
		int minutos = 0;
		for(int i = 0; i < cantLibros; i++) {
			minutos += libros[i].getTiempoEnLeer();
		}
		return minutos;
	}

	public void librosPorGeneroLiterario() {
		int contador = 0;
		for(int i = 0; i < libros.length; i++) {
			if(i > contador) {
				System.out.println(Genero.aventura);
			}
			
			else if(i > contador) {
				System.out.println(Genero.cienciaficcion);
			}
			
			else if(i > contador) {
				System.out.println(Genero.historia);
			}
			
			else if(i > contador) {
				System.out.println(Genero.infantiles);
			}
			
			else if(i > contador) {
				System.out.println(Genero.novela);
			}
			
			else if(i > contador) {
				System.out.println(Genero.poesia);
			}
		}
	}
	
	private void setPosicionDelLibroConMasPaginas() {
		if (libros[cantLibros].getCantPaginas() > libros[posicionDelLibroConMasPaginas].getCantPaginas()) {
			this.posicionDelLibroConMasPaginas = this.cantLibros;
		}

	}
	
	private int getMaximaCantidadDeLibros() {
		return this.libros.length;
	}

}

