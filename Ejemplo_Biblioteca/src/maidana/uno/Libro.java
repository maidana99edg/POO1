package maidana.uno;

public class Libro {
	private String autor;
	private String titulo;
	private int cantPaginas;
	
	public Libro(String autor, String titulo, int cantPaginas) {
		this.autor = autor;
		this.titulo = titulo;
		this.cantPaginas = cantPaginas;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public int getCantPaginas() {
		return cantPaginas;
	}

	public int getTiempoEnLeer() {
		return this.getCantPaginas();
	}

}

