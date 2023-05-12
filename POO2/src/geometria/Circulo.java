package geometria;

public class Circulo {
private double radio;
public Circulo(double radio) {
	this.radio = radio;
}
public double diametro() {
	return 2 * radio;
}
public double perimetro() {
	return 2 * Math.PI * radio;
}
public double area() {
	return Math.PI * Math.pow(radio, 2);
}
}
