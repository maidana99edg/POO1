package uno.edu.ar;

public class UsoGenerico {
public static void main(String[] args) {
	Generica<Integer> generico = new Generica<Integer>();
	Generica<String> generico2 = new Generica<String>("hola", "mundo");
	System.out.println(generico.getPrimero());
	System.out.println(generico2.getPrimero());
	String[] vocales = {"a", "e", "i", "o", "u"};
	String mitad = Generica.<String>getMitad(vocales);
	System.out.println(mitad);
	
}
}
