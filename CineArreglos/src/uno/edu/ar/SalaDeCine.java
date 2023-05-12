package uno.edu.ar;

public class SalaDeCine {
	private boolean[][] sala;

	public SalaDeCine(int butacas, int filas) {
		if (butacas == 0 || filas == 0 || butacas / filas != 0)
			throw new Error("Valores Incorreptos");
		this.sala = new boolean[filas][butacas / filas];
	}

	public boolean estaOcupada(int fila, int asiento) {
		if (!SonValidos(fila, asiento))
			throw new Error("No Existe ese Asiento");
		return sala[fila - 1][asiento - 1];

	}

	public boolean SonValidos(int fila, int asiento) {
		return fila > 0 && fila <= sala.length && asiento > 0 && asiento <= sala[fila].length;
	}

	public void OcuparButaca(int fila, int asiento) {
		if (!SonValidos(fila, asiento))
			throw new Error("No Existe ese Asiento");
		if (!sala[fila - 1][asiento - 1])
			sala[fila - 1][asiento - 1] = true;
	}

	public int cantidadDeButacasOcupadas() {
		int cantidadDeButacasOcupadas = 0;
		for (int i = 0; i < sala.length; i++) {
			for (int j = 0; j < sala[i].length; j++) {
				if (!estaOcupada(i, j))
					cantidadDeButacasOcupadas++;
			}
		}
		return cantidadDeButacasOcupadas;
	}

	boolean hayEspacioPara(int cantidadDePersonas) {
		boolean haylugar = false;
		int i = 0;
		while (i < sala.length && !haylugar) {
			int contadorDeContiguos = 0;
			int j = 0;
			while (j < sala[i].length && !haylugar) {
				if (!estaOcupada(i + 1, j + 1)) {
					contadorDeContiguos++;
					if (contadorDeContiguos >= cantidadDePersonas)
						haylugar = true;
				} else
					contadorDeContiguos = 0;
				j++;
			}
			i++;
		}
		return haylugar;
	}

	public static void main(String[] args) {
		SalaDeCine sala1 = new SalaDeCine(30, 5);
		sala1.OcuparButaca(1, 3);
		sala1.OcuparButaca(2, 2);
		System.out.println(sala1.estaOcupada(1, 3));
	}
}