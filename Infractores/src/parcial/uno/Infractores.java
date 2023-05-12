package parcial.uno;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Infractores {
	
	private Map<String, Integer> infractores = new HashMap<String, Integer>();
	private static final int VELOCIDAD_MAX = 80;
	private static final int MULTA = 50000;
	
	public void leerInfractores(String entrada) {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(new File(entrada));
			br = new BufferedReader(fr);
			String linea = null;
			while ((linea = br.readLine()) != null) {
				String [] lineaSpliteada = linea.split(" ");
				String patente = lineaSpliteada[0];
				int velocidad = Integer.parseInt(lineaSpliteada[1]);
				if (velocidad >= VELOCIDAD_MAX) {
					int cantidad = 1;
					if (infractores.containsKey(patente))
						cantidad = infractores.get(patente) + 1;
					infractores.put(patente, cantidad);
				}	
			}			
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (fr != null)
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}	
	}
	
	public void escribirMultados(String salida) {

		try {
			FileWriter fw = new FileWriter(new File(salida));
			
			BufferedWriter bw = new BufferedWriter(fw);
			for(Entry<String, Integer> cu : infractores.entrySet()) {
				String linea = cu.getKey() + " " + (cu.getValue() * MULTA);
				bw.write(linea);
				bw.newLine();
				
			}
			bw.close();
			}catch(FileNotFoundException fnff) {
				System.err.print("archivo no encontrado");
			}catch(IOException e) {
				e.printStackTrace();
			}
		
	}
	
	

	@Override
	public String toString() {
		return "Infractores [infractores=" + infractores + "]";
	}

	public static void main(String[] args) {
		Infractores infractores = new Infractores();
		infractores.leerInfractores("infractores.in");
		infractores.escribirMultados("infractor.out");
		System.out.println(infractores);

	}

}
