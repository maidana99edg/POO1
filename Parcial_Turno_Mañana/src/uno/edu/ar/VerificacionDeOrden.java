package uno.edu.ar;

public class VerificacionDeOrden {

	public boolean estaOrdenadoAscendentemente(int[] vector) {
		boolean ordenadoAscendente = false;
		for (int i = 0; i < vector.length - 1; i++) {
			if (vector[i] <= vector[i + 1]) 
				ordenadoAscendente = true;
			 

			
		}
		return ordenadoAscendente;
	}

}
