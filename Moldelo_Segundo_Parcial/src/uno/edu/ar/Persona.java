package uno.edu.ar;

import java.util.Objects;

public class Persona implements Comparable<Persona> {

	private int dni;
	private String apellido;
	private int edad;

	public Persona(int dni, String apellido, int edad) {
		super();
		this.dni = dni;
		this.apellido = apellido;
		this.edad = edad;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public int compareTo(Persona o) {
		return this.apellido.compareTo(o.apellido);
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido, dni, edad);
	}
	// equals de Object para determinar que dos objetos personas son iguales si sus
	// dni´s son iguales.

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(apellido, other.apellido) && dni == other.dni && edad == other.edad;
	}

	@Override
	public String toString() {
		return dni + ", " + apellido + ", " + edad;
	}
}
