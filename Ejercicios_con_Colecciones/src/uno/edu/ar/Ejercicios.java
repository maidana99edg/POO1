package uno.edu.ar;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Ejercicios {

	public static boolean EsPalindrono(String cadena) {
		String invertida = new StringBuilder(cadena).reverse().toString();
		
		
	
		return invertida.equals(cadena);
	}
	public static void main(String[] args) {
		// 1. Escribir un programa que lee una secuencia de caracteres y los imprime en
		// orden
		// inverso.
		List<Integer> secuencia = new LinkedList<Integer>();
		secuencia.add(1);
		secuencia.add(2);
		secuencia.add(33);
		secuencia.add(12);
		secuencia.add(9);
		secuencia.add(80);
		secuencia.add(6);
		secuencia.add(5);
		Collections.sort(secuencia);
		System.out.println(secuencia);
		Collections.sort(secuencia, Collections.reverseOrder());
		System.out.println(secuencia);
		/*
		 * Escribir un programa que verifique si una palabra es palíndromo (es decir que
		 * una cadena es igual a su inversa. Por ejemplo: las cadenas "1456541" y
		 * "145541" son palíndromos).
		 */
System.out.println(EsPalindrono("1456541"));
	}
}
