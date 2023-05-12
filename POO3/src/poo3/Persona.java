package poo3;

public class Persona {
String nombre;
int edad;
//constructor
public Persona(String nom, int e) {
	nombre = nom;
	edad = e;
}
public void mostrar() {
	System.out.println("mi nombre es " + nombre);
	System.out.println("tengo " + edad + " años");
	
}
}
