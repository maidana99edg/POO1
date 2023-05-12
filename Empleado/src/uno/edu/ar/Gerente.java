package uno.edu.ar;

public class Gerente extends Empleado{

	public Gerente(String nombre, double sueldo) {
		super(nombre,  sueldo);
		
	}
	public Gerente() {
		
	}
	
	@Override
public double getSueldo() {
	return super.getSueldo() *2;
}
}
