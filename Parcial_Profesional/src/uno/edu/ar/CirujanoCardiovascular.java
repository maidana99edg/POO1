package uno.edu.ar;

public class CirujanoCardiovascular extends Cirujano {

	public CirujanoCardiovascular(String nombre, String apellido) {
		super(nombre, apellido);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getSalario() {
		
		return super.getSalario() * 1.25;
	}

}
