package edg.uno.ar;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmpleadoTest {

	@Test
	public void aTest() {
		PlantaTemporaria pepe = new PlantaTemporaria(80, 0, true);
		double esperado = 161000;
		double obtenido = pepe.getSalario();
		assertEquals(esperado, obtenido, 0.001);
	}
	public void bTest() {
		Empleado pedro = new PlantaPermanente(80, 2, true, 6);
		double esperado = 251000;
		double obtenido = pedro.getSalario();
		assertEquals(esperado, obtenido, 0.001);
	}
@Test
public void liquidarTest() {
	Empleado pepe = new PlantaTemporaria(80, 0, true);
	Empleado pedro = new PlantaPermanente(80, 2, true, 6);
	Empleado ana = new PlantaPermanente(160, 0, false, 4);
	Empleado raul = new Gerente(160, 1, true, 10);
	
	Empresa acme = new Empresa(10);
	acme.agregarEmpleado(raul);
	acme.agregarEmpleado(pepe);
	acme.agregarEmpleado(pedro);
	acme.agregarEmpleado(ana);
	
	double esperado = 1554000;
	double obtenido = acme.montoTotal();
	assertEquals(esperado, obtenido, 0.00001);
}
}
