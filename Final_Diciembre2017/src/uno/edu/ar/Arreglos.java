package uno.edu.ar;

public class Arreglos {
	boolean estaOrdenado(int v[]) {

		for (int i = 0; i < v.length - 1; i++) {
			if (v[i] < v[i + 1]) {
				return false;
			}
		}

		return true;

	}

	public static void venderProducto(double precio)throws PrecioMenorException {
		if(precio < 0)
		throw new PrecioMenorException("El precio es mejor a cero");
	}

}
