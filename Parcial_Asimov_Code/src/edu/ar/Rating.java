package edu.ar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;
import java.util.TreeSet;

public class Rating {



		
		private Set<Programa> programas = new TreeSet<Programa>();
		
		public void leerRatings(String archivo) {
			try {
			FileReader fr = new FileReader(new File(archivo));
			BufferedReader br = new BufferedReader(fr);
			String linea = br.readLine();
			String datos[];
			
			while(linea != null) {
				datos = linea.split(",");
				
					Programa p;
					Integer numCanal = Integer.parseInt(datos[0]);
					String programa = datos[1];
					Double rating = Double.parseDouble(datos[2]);										
					p = new Programa(numCanal, programa, rating);
					programas.add(p);
				
				
				linea = br.readLine();
				}
			fr.close();
			}catch(FileNotFoundException fnfe) {
				System.err.print("Archivo no encontrado");
			}catch(IOException e) {
				System.err.print("Error IO");
			}
			
			
		}
		
		public void escribirMasVistos(String salida) throws IOException {
			PrintWriter pr = new PrintWriter(new FileWriter(salida));
			
			for(Programa programa : programas) {
				if(programa.getRating() >= 5) {
					pr.println(programa);
				}
				
			}
			
			pr.close();
			
		} 
		
		public static void main(String[] args)throws IOException {
			Rating rating = new Rating();
			rating.leerRatings("ratings.in");
			rating.escribirMasVistos("masVistos.out");
		}

	}

