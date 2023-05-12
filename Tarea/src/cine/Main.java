package cine;

public class Main {

	public static void main(String[] args) {
	SalaDeCine sala = new SalaDeCine(5, 8);
	System.out.println(sala.EstaOcupada(1, 3));
	sala.ocuparButaca(1, 3);
	sala.ocuparButaca(2, 3);
	sala.ocuparButaca(2, 4);
	sala.ocuparButaca(4, 5);
	System.out.println(sala.EstaOcupada(1, 3));
	System.out.println(sala.EstaOcupada(4, 5));
	System.out.println("--------------------");
	System.out.println(sala.cantidadDeButacasOcupadas());
	System.out.println(sala.hayEspacioPara(15));
	
	
	}

}
