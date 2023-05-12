package uno.edu.ar;

import java.util.Objects;

public class Cancion {
private String interprete;
private String titulo;
private int duracion;
public Cancion(String interprete, String titulo, int duracion) {
	super();
	this.interprete = interprete;
	this.titulo = titulo;
	this.duracion = duracion;
}
public int getDuracion() {
	return duracion;
}
public void setDuracion(int duracion) {
	this.duracion = duracion;
}
@Override
public int hashCode() {
	return Objects.hash(duracion, interprete, titulo);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Cancion other = (Cancion) obj;
	return duracion == other.duracion && Objects.equals(interprete, other.interprete)
			&& Objects.equals(titulo, other.titulo);
}

}
