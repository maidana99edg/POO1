package io;

public class Circulo {
	private double radio;
	private double posicion;

	public Circulo(Punto p, double radio) {
		this.posicion = p.distanciaAotroPunto(p);
		this.radio = radio;
	}

	public double getArea() {
		return Math.PI * Math.pow(radio, 2);
	}

	public double getPosicion() {
		return this.posicion;
	}
}
