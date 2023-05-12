package uno.edu.ar;

public abstract class Profesional implements Comparable<Profesional> {
	private String nombre;
	private String apellido;
	private static double MENSUAL_BASICO = 100000;

	public Profesional(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public double getSalario() {
		return MENSUAL_BASICO;
	}

	@Override
	public int compareTo(Profesional o) {
		// TODO Auto-generated method stub
		return (-1) * Double.compare(this.getSalario(), o.getSalario());
	}

}
