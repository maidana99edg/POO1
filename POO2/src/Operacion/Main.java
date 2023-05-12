package Operacion;

import javax.swing.JOptionPane;

public class Main {
public static void main(String[] args) {
	int n1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
	int n2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
	/*
	 Operaciones op = new Operaciones();
	op.sumar(n1, n2);
	op.restar(n1, n2);
	op.multiplicar(n1, n2);
	op.mostrar();*/
	Retorno re = new Retorno();
	System.out.println("La suma es:"+ re.sumar(n1, n2));
	System.out.println("la resta es:"+ re.restar(n1, n2));
	System.out.println("la multiplicacion es:"+ re.multiplicacion(n1, n2));
	
}
}
