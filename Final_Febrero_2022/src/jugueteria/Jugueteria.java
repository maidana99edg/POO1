package jugueteria;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Jugueteria {
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	private Set<String> nombres = new TreeSet<String>();
	private Queue<Empleado> ListaDeEspera = new ArrayDeque<Empleado>();

	public void agregarEmpleado(Empleado e) {
		empleados.add(e);
		agregarNombre(e);

	}

	private void agregarNombre(Empleado e) {
		nombres.add(e.getNombre());
	}

	public Empleado elegirEmpleadoAlAzar() {
		double aleatorio = Math.random();
		int posicion;
		posicion = (int) (aleatorio * empleados.size()) + 1;

		return empleados.get(posicion);

	}

	public List<String> nombresDeNuevosJuguetes() {
		ArrayList<String> nombresDeJuguetes = new ArrayList<String>();
		Collections.sort(nombresDeJuguetes);
		return nombresDeJuguetes;
	}

	public void ponerEnListaDeEspera(Empleado e) {
		ListaDeEspera.add(e);
	}

	public void entregarEntradas() {
		for (Empleado entregarEntradas : ListaDeEspera) {
			entregarEntradas = new Empleado(true);
		}
	}

	public void listarNombres(List<String> nombres) throws FileNotFoundException {
		PrintWriter pr = new PrintWriter(new File("Juguetes.out"));
		for (String nombreEmpleado : nombres) {
			pr.println(nombreEmpleado);

		}
		pr.close();
	}
	
	public static void main(String[] args) throws IOException {
		Jugueteria jet = new Jugueteria();
		Empleado juan = new Empleado("Juan", "Perez");
		Empleado ana = new Empleado("Ana", "Flyn");
		Empleado jorge = new Empleado("Jorge", "Tais");
		Empleado juan_1 = new Empleado("Juan", "Lab");
		
		jet.agregarEmpleado(juan);
		jet.agregarEmpleado(ana);
		jet.agregarEmpleado(jorge);
		jet.agregarEmpleado(juan_1);
		System.out.println(jet.elegirEmpleadoAlAzar());
		jet.ponerEnListaDeEspera(ana);
		jet.ponerEnListaDeEspera(jorge);
		jet.ponerEnListaDeEspera(juan_1);
		jet.ponerEnListaDeEspera(juan);
		jet.entregarEntradas();
		//jet.listarNombres(jet.nombresDeNuevosJuguetes());
	}
}
