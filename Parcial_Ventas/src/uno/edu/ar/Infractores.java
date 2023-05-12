package uno.edu.ar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Infractores {
	private Map<String, Integer> infractores = new HashMap<String, Integer>();
	private static final int MULTA = 50000;
	private static final int MAXVELOCIDAD = 80;

	public Infractores() {

	}

	public void LeerInfractores(String entrada) {
		try {
			FileReader fr = new FileReader(new File(entrada));
			BufferedReader br = new BufferedReader(fr);
			String linea = br.readLine();
			String datos[];
			String patente;
			Integer velocidad;
			while (linea != null) {
				datos = linea.split(" ");
				patente = datos[0];
				velocidad = Integer.parseInt(datos[1]);
				if (velocidad >= MAXVELOCIDAD) {
					int cantidad = 1;
					if (infractores.containsKey(patente))
						cantidad = infractores.get(patente) + 1;
					infractores.put(patente, cantidad);
				}
				linea = br.readLine();
			}
			fr.close();
		} catch (FileNotFoundException fnfe) {
			System.err.print("archivo no encontrado");
		} catch (IOException e) {
			System.err.print("Error IO");
		}
	}

	public void escribirMultados(String archivoSalida) throws FileNotFoundException {
		PrintWriter pr = new PrintWriter(new File(archivoSalida));
		for (Entry<String, Integer> cu : infractores.entrySet()) {
			String linea = cu.getKey() + " " + (cu.getValue() * MULTA);
			pr.println(linea);
		}
		pr.close();
	}

	public static void main(String[] args) throws IOException {
		Infractores infractores = new Infractores();
		infractores.LeerInfractores("infractores.in");
		infractores.escribirMultados("infractores.out");
	}
}
