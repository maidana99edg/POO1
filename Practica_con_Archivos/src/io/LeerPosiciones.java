package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerPosiciones {
public static void main(String[] args) {
	
	FileReader fr = null;
	BufferedReader br = null;
	try
	{
		fr = new FileReader("posiciones.txt");
		br = new BufferedReader(fr);
		String linea;
		while((linea = br.readLine()) != null) {
			try {
				 String [] coordenadas = linea.split(",");
				 double x = Double.parseDouble(coordenadas[0]);
				 double y = Double.parseDouble(coordenadas[1]);
				 Punto posicion = new Punto(x, y);
				 System.out.println(posicion);
				 
			}catch(NumberFormatException e){
				System.err.println("Uno de los datos leídos no es un double");	
			}
		}
	}catch(IOException e) {
		e.printStackTrace();
	}
}
}
