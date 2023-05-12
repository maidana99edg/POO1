package uno.com.ar;

public class Nota {
	/**
	 * pre : valorInicial está comprendido entre 0 y 10. post: inicializa la Nota
	 * con el valor indicado.
	 */
	private int nota;

	public Nota(int valorInicial) {
		if (EvaluarNota(valorInicial))
			this.nota = valorInicial;
	}

	/**
	 * post: devuelve el valor numérico de la Nota, comprendido entre 0 y 10.
	 */
	public int obtenerValor() {
		return this.nota;
	}

	/**
	 * post: indica si la Nota permite o no la aprobación.
	 */
	public boolean aprobado() {
		return obtenerValor() >= 4;
	}

	/**
	 * post: indica si la Nota implica desaprobación.
	 */
	public boolean desaprobado() {
		return obtenerValor() <= 4;
	}

	/**
	 * pre : nuevoValor está comprendido entre 0 y 10. post: modifica el valor
	 * numérico de la Nota, cambiándolo por nuevoValor, siempre y cuando nuevoValor
	 * sea superior al valor numérico actual de la Nota.
	 */

	public void recuperar(int nuevoValor) {
		if (!EvaluarNota(nuevoValor)) {
			if (nuevoValor > obtenerValor()) {
				this.nota = nuevoValor;
			}
		}

	}

	public boolean EvaluarNota(int nota) {
		return (nota >= 0 && nota <= 10);

	}
}
