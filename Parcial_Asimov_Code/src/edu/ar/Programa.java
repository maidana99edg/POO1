package edu.ar;

public class Programa implements Comparable<Programa> {

	private Integer numCanal;
	private String Programa;
	private double rating;

	public Programa(Integer numCanal, String programa, double rating) {
		this.numCanal = numCanal;
		this.Programa = programa;
		this.rating = rating;
	}

	public Integer getNumCanal() {
		return numCanal;
	}

	public String getPrograma() {
		return Programa;
	}

	public double getRating() {
		return rating;
	}

	

	@Override
	public String toString() {
		return  Programa + " " + numCanal + " " + rating;
	}

	@Override
	public int compareTo(Programa p) {

		return (-1) * Double.compare(this.getRating(), p.getRating());
		 
	}

}
