package www.uno.edu.ar;

public class Circulo {
private double radio;

public Circulo(double radio) {
	setRadio(radio);
	
	this.radio = radio;
}

public double getRadio() {
	return radio;
}

public void setRadio(double radio) {
	if (radio <= 0)
		throw new Error ("Valor inválido");
	this.radio = radio;
}
public double getArea() {
	return Math.PI * this.radio * this.radio;
}
public double getPerimetro() {
	return 2 * Math.PI * this.radio;
}
public double getDiametro() {
	return this.radio * 2;
}

}
