package uno.edu.ar;

public class Demo {

	public static void main(String[] args) {
		ListaDeReproduccion laPrevia = new ListaDeReproduccion(3);
		laPrevia.agregarCancion("DON OMAR", "BANDOLERO", 4);
		laPrevia.agregarCancion("DADDY YANKY", "CON CALMA", 5);
		System.out.println(laPrevia.cantidadDeCanciones());

	}

}
