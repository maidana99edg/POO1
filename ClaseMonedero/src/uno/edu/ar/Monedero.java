package uno.edu.ar;

public class Monedero {
	private double dinero;

	public Monedero(double dineroInicial) {
		this.setDinero(dineroInicial);
	}
	public void setDinero(double dinero) {
		if (dinero <= 0)
			throw new Error("Radio Inválido");
		this.dinero = dinero;
	}

	public double sacarDinero(double cantidadAsacar) {
		if ( this.dinero >= cantidadAsacar) {
			dinero -= cantidadAsacar;
			return cantidadAsacar;
		} else {
			return 0;
		}

	}
public void agregarDinero(double ingresarDinero) {
	
		this.dinero += ingresarDinero;
}
public double verCuantoDineroQueda() {
	return this.dinero;
}
	
public static void main(String[] args) {
	Monedero monederoRosa = new Monedero(200);
	monederoRosa.agregarDinero(100);
	System.out.println(monederoRosa.verCuantoDineroQueda());
	System.out.println(monederoRosa.sacarDinero(-50));
}
}
