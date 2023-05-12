package edg.uno.ar;

public class PlantaPermanente extends Empleado {
	private int aniosDeAntiguedad;
	private static double VALOR_HORA = 3000;
	private static double VALOR_ANIOS_ANTIGUEDAD = 1000;

	public PlantaPermanente(int horasTrabajadas, int cantHijos, boolean casado, int aniosAntiguedad) {
		super(horasTrabajadas, cantHijos, casado);
		this.aniosDeAntiguedad = aniosAntiguedad;
	}

	@Override
	public double getSalario() {

		return this.aniosDeAntiguedad * PlantaPermanente.VALOR_ANIOS_ANTIGUEDAD
				+ super.getHorasTrabajadas() * PlantaPermanente.VALOR_HORA + super.getSalarioFamiliar();

	}

	protected int getAniosDeAntiguedad() {
		return aniosDeAntiguedad;
	}

}
