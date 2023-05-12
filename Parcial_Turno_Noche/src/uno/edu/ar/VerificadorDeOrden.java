package uno.edu.ar;

public class VerificadorDeOrden {

	public boolean estaOrdenadoDescendentemente(int[] vector) {
boolean ordenadoDescendentemente = false;
for (int i = 0; i < vector.length -1; i++ ) {
	if(vector[i] >= vector[i+1])
		ordenadoDescendentemente = true;
}
return ordenadoDescendentemente;
	}
}
	
	
	
	

