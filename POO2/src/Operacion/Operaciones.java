package Operacion;

public class Operaciones {
	int suma;
	int resta;
	int multi;
public void sumar(int num1, int num2) {
	
	suma = num1 + num2;
}
public void restar(int num1, int num2) {
	resta = num1 - num2;
}
public void multiplicar(int num1, int num2) {
	multi = num1 * num2;
}

public void mostrar() {
	System.out.println("la suma es:"+ suma);
	System.out.println("la resta es:"+ resta);
	System.out.println("la multiplicacion es:"+ multi);
}
}
