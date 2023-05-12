package io;

public class Demo {
public static void main(String[] args) {
	Punto posicion = new Punto(5.7, 5.8);
	Circulo circulito = new Circulo(posicion, 4);
	System.out.println(circulito.getPosicion());
	System.out.println(circulito.getArea());
}
}
