package uno.edu.ar;

import java.util.ArrayList;
import java.util.List;

public class EjercicioDos {
	//MAIDANA EDGAR
	//DNI 94606181
	public <T> List<T> DiferenciaSinetricaEntreObjetos(List<T> l1, List<T> l2) {
		List<T> aux = new ArrayList<T>();

		for (T recorrido1 : l1) {
			if (!l2.contains(recorrido1)) {
				aux.add(recorrido1);
			}

		}
		
		for (T recorrido2 : l2) {
			if (!l1.contains(recorrido2)) {
				aux.add(recorrido2);
			}
		}
		
		return aux;
	}
	
}
