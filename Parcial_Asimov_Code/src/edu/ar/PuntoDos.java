package edu.ar;

import java.util.List;

public class PuntoDos {

	public <T> boolean sonTodosMenores(List<T> l1, List<T> l2) {
		boolean sonTodosMenores = false;
		for (T primeraLista : l1) {
			if (!l2.contains(primeraLista))
				sonTodosMenores = true;

		}
		return sonTodosMenores;
	}

}
