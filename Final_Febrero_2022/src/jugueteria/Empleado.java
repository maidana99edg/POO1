package jugueteria;

public class Empleado {
	private String nombre;
	private String apellido;
	private boolean entradaEntregada = false;

	public Empleado(String nombre, String apellido) {

		this.nombre = nombre;
		this.apellido = apellido;
		
	}

	public Empleado(boolean entradaEntregada) {
		this.entradaEntregada = entradaEntregada;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public boolean isEntradaEntregada() {
		return entradaEntregada;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", entradaEntregada=" + entradaEntregada + "]";
	}

}
