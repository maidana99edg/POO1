package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CuentaCompartidaMapeada {
	private Map<Integer, List<Consumo>> cuenta;
	private double cubierto;
	private int cantComensales;

	public CuentaCompartidaMapeada(int n, double cubierto) {
		this.cuenta = new HashMap<Integer, List<Consumo>>();
		this.cubierto = cubierto;
		this.cantComensales = n;
	}

	public void agregarConsumoAlComensal(int comensal, String detalle, double precio) throws ComensalInvalidoException {
		if (comensal < 1 || comensal > this.cantComensales)
			throw new ComensalInvalidoException("Comensal invalido");

		List<Consumo> l;
		if (!cuenta.containsKey(comensal)) {
			l = new ArrayList<Consumo>();
			cuenta.put(comensal, l);
		} else
			l = cuenta.get(comensal);
		l.add(new Consumo(detalle, precio));
	}

	public String consultarConsumosDelComensal(int comensal) {
		String s = "Consumo del comensal:" + comensal + "\n";
		List<Consumo> laux = cuenta.get(comensal);

		for (Consumo cadaConsumo : laux) {
			s += cadaConsumo.getDescripcion() + "     " + cadaConsumo.getPrecio() + "\n";
		}
		return s;
	}

}
