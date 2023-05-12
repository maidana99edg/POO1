package www.edg.ar;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEjemplo {
	public static void main(String[] args) {
		//Elimina elementos Duplicados
		Set<String> set = new HashSet<String>();
		set.add("one");
		set.add("second");
		set.add("3rd");
		set.add("4");
		set.add("5.OF");
		set.add("second");
		set.add("4");
		System.out.println(set);
		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("one");
		treeSet.add("second");
		treeSet.add("3rd");
		treeSet.add("4");
		treeSet.add("5.OF");
		treeSet.add("second");
		treeSet.add("4");
		System.out.println(treeSet);
		treeSet.remove("4");//borra un elemento
		System.out.println(treeSet);
		treeSet.contains("3rd"); //Pregunta si contiene 3rd, devuelve true si se encuentra el elemento
		
		

	}
}
