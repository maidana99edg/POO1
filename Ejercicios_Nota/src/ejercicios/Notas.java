package ejercicios;

public class Notas {
private int valor;
Notas (int valor){
	this.valor = valor;
}
boolean aprobado() {
	return (valor >= 4 && valor <= 10);
}
boolean desaprobado() {
	return ! aprobado();
}
int obtenervalor() {
	return valor;
}
void recuperar(int recuvalor) {
	if (recuvalor > valor)
		valor = recuvalor;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Notas parcial1 = new Notas(3);
		Notas juana = new Notas (10);
System.out.println(parcial1.aprobado());
System.out.println(parcial1.desaprobado());
System.out.println(juana.obtenervalor());
parcial1.recuperar(6);
System.out.println(parcial1.aprobado());
System.out.println(parcial1.obtenervalor());
	}

}
