package uno.edu.ar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

public class Ventas {
	//MAIDANA EDGAR 
	// DNI: 94606181
	private Map<String, Integer> ventasPorProducto;
	private String codigoDeProducto;
	private int cantidadVendida;

	public Ventas() {
		this.codigoDeProducto = " ";
		this.cantidadVendida = 0;

	}

	public void leerVentas(String entrada) {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(new File("ventas.in"));
			br = new BufferedReader(fr);
			String linea = br.readLine();

			while (linea != null) {
				String[] datos = linea.split(" ");
				this.codigoDeProducto = datos[0];
				this.cantidadVendida = Integer.parseInt(datos[1]);
				int cantidad = 1;
				if (ventasPorProducto.containsKey(this.codigoDeProducto))
					cantidad = ventasPorProducto.get(this.codigoDeProducto) + 1;
				ventasPorProducto.put(this.codigoDeProducto, cantidad);
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

	public void escribirVentasPorProducto(String salida) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(new File(salida));
			bw = new BufferedWriter(fw);

			for (Entry<String, Integer> cv : ventasPorProducto.entrySet()) {
				String unaLinea = cv.getKey() + " " + (cv.getValue() * cantidadVendida);
				bw.write(unaLinea);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (bw != null)
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

	public static void main(String[] args) throws IOException {
		Ventas ventas = new Ventas();
		ventas.leerVentas("ventas.in");
		ventas.escribirVentasPorProducto("ventasPorProducto.out");
		
	}
}
