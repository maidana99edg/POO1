package arreglospruebas;

public class Punto {
private double x;
private double y;
public Punto(double x, double y) {
	this.x = x;
	this.y = y;
}

@Override
public String toString() {
	return "Punto [x=" + x + ", y=" + y + "]";
}

public Punto[] createArray(int tam) {
	Punto[] p = new Punto[tam];
	for(int i = 0; i < tam; i++) {
		p[i] = new Punto(i, i + 1);
		System.out.println(p[i].toString());
	}
	return p;
}
}
