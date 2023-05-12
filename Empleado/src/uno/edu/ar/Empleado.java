package uno.edu.ar;

public class Empleado {
	private String nombre = " ";

	private double sueldo = 0;

	public Empleado(String nombre, double sueldo) {

		this.nombre = nombre;
		this.sueldo = sueldo;
	}

	public Empleado() {

	}

	public String getNombre() {
		return nombre;
	}

	public double getSueldo() {
		return this.sueldo;
	}

}
