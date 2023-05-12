package uno.edu.ar;

public class ListaDeReproduccion {
	private Cancion[] canciones;
	private int cantMaxDeCanciones;
	private int cantCanciones = 0;

	public ListaDeReproduccion(int cantMaxDeCanciones) {
		this.canciones = new Cancion[cantMaxDeCanciones];
		this.cantMaxDeCanciones = cantMaxDeCanciones;
	}

	public int cantidadDeCanciones() {
		return cantCanciones;
	}

	public void agregarCancion(String interprete, String titulo, int duracion) {
		
		if (this.cantMaxDeCanciones > cantCanciones ) {
			this.canciones[cantCanciones] = new Cancion(interprete, titulo, duracion);
		    cantCanciones++;
		}
	}

	public int tiempoParaEscucharTodaLaCancion() {
		int tiempo = 0;
		for (int i = 0; i < this.canciones.length; i++) {
			tiempo += canciones[i].getDuracion();
		}
		return tiempo;
	}

	public Cancion cancionMasLarga() {
		int cancionMasLarga = 0;
		for (int i = 0; i < canciones.length; i++) {
			if (this.canciones[i].getDuracion() > this.canciones[cancionMasLarga].getDuracion()) {
				cancionMasLarga = i;

			}

		}
		return canciones[cancionMasLarga];
	}
}
