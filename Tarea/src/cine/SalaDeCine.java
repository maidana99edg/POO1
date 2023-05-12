package cine;

public class SalaDeCine {
	private int filas;
	private int butacas;
	private boolean[][] sala;

	public SalaDeCine(int filas, int butacas) {
		this.filas = filas;
		this.butacas = butacas;
		this.sala = new boolean[this.filas][this.butacas];

	}

	public boolean EstaOcupada(int fila, int asiento) {
		boolean EstaOcupado = false;
		if (this.sala[fila][asiento] == true) {
			EstaOcupado = true;
		}
		return EstaOcupado;
	}

	public void ocuparButaca(int fila, int asiento) {

		if (this.sala[fila][asiento] == false)
			this.sala[fila][asiento] = true;

	}

	public int cantidadDeButacasOcupadas() {
		int cantidadButacas = 0;
		for (int i = 0; i < this.filas; i++) {
			for (int j = 0; j < this.butacas; j++) {
				if (this.sala[i][j] == true)
					cantidadButacas += 1;
			}
		}

		return cantidadButacas;
	}

	public boolean hayEspacioPara(int cantidadDePersonas) {
		int personas = cantidadDePersonas;
		int cantidad = cantidadDeButacasOcupadas();

		return ((personas + cantidad) < (this.filas * this.butacas));
	}

}
