package uno.edu.ar;

import java.util.List;

public class Generica<T> {
	private T primero;
	private T segundo;

	public Generica(T primero, T segundo) {
		this.primero = primero;
		this.segundo = segundo;
	}

	public Generica() {
		this(null, null);
	}

	public T getPrimero() {
		return this.primero;
	}

	public T getSegundo() {
		return this.segundo;
	}

	public static <T> T getMitad(T[] arreglo) {
		if (arreglo == null)
			return null;
		if (arreglo.length == 0)
			return null;
		return arreglo[(int) (arreglo.length / 2)];
	}
	public List<T> diferencia(List<T> l1, List<T> l2){
		return l1;
	}

	
	
}
