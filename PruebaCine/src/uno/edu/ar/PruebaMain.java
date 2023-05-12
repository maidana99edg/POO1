package uno.edu.ar;

public class PruebaMain {

	public static void main(String[] args) {
	Prueba sala = new Prueba(5, 8);
	System.out.println(sala.estaOcupada(1, 4));
	sala.ocuparButaca(1, 4);
	sala.ocuparButaca(4, 7);
	sala.ocuparButaca(4, 2);
	sala.ocuparButaca(3, 5);
	sala.ocuparButaca(2, 4);
	System.out.println(sala.estaOcupada(1, 4));
	System.out.println(sala.cantidadDeButacasOcupadas());
	System.out.println("--------------------");
	System.out.println(sala.hayEspacioPara(16));
	

	}

}
