package uno.edu.ar.com;

public class Punto {
	private double x;
	private double y;

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	public boolean estaSobreEjeX() {
		return this.getY() == 0;
	}
	public boolean estaSobreEjeY() {
		return this.getX() == 0;
	}
	public boolean esElOrigen() {
	return 	estaSobreEjeX() && estaSobreEjeY();
	}
	public double getDistanciaAlOrigen() {
		return this.distanciaAotroPunto(new Punto(0,0));
	}
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}

	public void mover(double deltaX, double deltaY) {
		this.x += deltaX;
		this.y += deltaY;
	}

	public double distanciaAotroPunto(Punto ob) {
		return Math.hypot(this.getX() - ob.getX(), this.getY() - ob.getY());
	}

	public static void main(String[] args) {
		Punto punto1 = new Punto(100.0, 200.0);
		Punto punto2 = new Punto(400.0, 800.0);
		System.out.println(punto1.distanciaAotroPunto(punto2));
		System.out.println();
	}
}
