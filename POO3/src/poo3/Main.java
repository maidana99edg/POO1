package poo3;

public class Main {
String apellido;
double altura;
public Main(String apellido, double altura ) {
	this.apellido = apellido;
	this.altura = altura;
}
public void mostrarapellido() {
	System.out.println("mi apellido es: " + apellido);
	System.out.println("mi altura es : " + altura);
}
	public static void main(String[] args) {
		Persona p1 = new Persona("Edgar", 23);
		p1.mostrar();
Main a1 = new Main("Maidana", 1.80);
a1.mostrarapellido();
	}

}
