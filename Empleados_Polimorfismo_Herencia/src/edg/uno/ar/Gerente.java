package edg.uno.ar;

public class Gerente extends PlantaPermanente {
	private static double VALOR_HORA = 4000;
	private static double VALOR_ANIOS_ANTIGUEDAD = 1500;

	public Gerente(int horasTrabajadas, int cantHijos, boolean casado, int aniosAntiguedad) {
		super(horasTrabajadas, cantHijos, casado, aniosAntiguedad);
		// TODO Auto-generated constructor stub
	}
	@Override
  public double getSalario() {
		return this.getAniosDeAntiguedad() * Gerente.VALOR_ANIOS_ANTIGUEDAD
				+ super.getHorasTrabajadas() * Gerente.VALOR_HORA + super.getSalarioFamiliar();

  }
}
