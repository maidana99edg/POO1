package edu.ar;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;

import org.junit.Test;

public class SonMenoresTest {

	@Test
	public void sonTodosMenoresTest() {
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(5);

		LinkedList<Integer> l2 = new LinkedList<Integer>();
		l2.add(2);
		l2.add(4);
		l2.add(6);
		l2.add(7);
		PuntoDos puntoDos = new PuntoDos();
		assertTrue(puntoDos.sonTodosMenores(l1, l2));

	}

//	public void NoSonTodosMenoresTest() {
//		LinkedList<Integer> l1 = new LinkedList<Integer>();
//		l1.add(1);
//		l1.add(2);
//		l1.add(8);
//		l1.add(5);
//
//		LinkedList<Integer> l2 = new LinkedList<Integer>();
//		l2.add(2);
//		l2.add(4);
//		l2.add(6);
//		l2.add(7);
//		PuntoDos puntoDos = new PuntoDos();
//		assertFalse(puntoDos.sonTodosMenores(l1, l2));
//
//	}
	public void sonTodosMenoresConStringTest() {
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("1");
		l1.add("2");
		l1.add("3");
		l1.add("5");

		LinkedList<String> l2 = new LinkedList<String>();
		l2.add("2");
		l2.add("4");
		l2.add("6");
		l2.add("7");
		PuntoDos puntoDos = new PuntoDos();
		assertTrue(puntoDos.sonTodosMenores(l1, l2));

	}
}
