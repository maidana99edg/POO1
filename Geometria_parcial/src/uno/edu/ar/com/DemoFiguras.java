package uno.edu.ar.com;

import java.util.Arrays;

public class DemoFiguras {

	public static void main(String[] args) {
		Elipse elipse = new Elipse(8, 4);
		Rectangulo rectangulo = new Rectangulo(4, 2);
		Triangulo triangulo = new Triangulo(8, 2);
		Circulo circulo = new Circulo(6);
		Cuadrado cuadrado = new  Cuadrado(4);
		Figura []figuras = {elipse, rectangulo, triangulo, circulo, cuadrado};
		for (Figura figura : figuras) {
			System.out.println(figura.getArea());
		}
		double areatotal = 0;
		for (Figura figura : figuras) {
			areatotal += figura.getArea();
			
		}
		System.out.println(areatotal);
		Arrays.sort(figuras);
		System.out.println();
		for (Figura figura : figuras) {
			System.out.println(figura.getArea());
		}
	}

}
