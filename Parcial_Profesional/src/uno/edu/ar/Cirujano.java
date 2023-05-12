package uno.edu.ar;

public class Cirujano extends Medico {

	public Cirujano(String nombre, String apellido) {
		super(nombre, apellido);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getSalario() {
	
		return super.getSalario() * 1.25;
	}
}
