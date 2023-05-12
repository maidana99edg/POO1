package www.uno.edu.ar;

public class Corona {
	private Circulo circuloChico;
	private Circulo circuloGrande;

	public Corona(double radioInferior, double radioExterior) {
		if (radioInferior >= radioExterior)
			throw new Error("Radio Exterior debe ser mayor que RadioInterior");
		this.circuloChico = new Circulo(radioInferior);
		this.circuloGrande = new Circulo(radioExterior);
	}

	public Circulo getCirculoChico() {
		return circuloChico;
	}

	public Circulo getCirculoGrande() {
		return circuloGrande;
	}

	public double getRadioInterior() {
		return this.circuloChico.getRadio();
	}

	public double getRadioExterior() {
		return this.circuloGrande.getRadio();
	}

	public double getPerimetro() {
		return this.circuloChico.getPerimetro() 
		+ this.circuloGrande.getPerimetro();
	}
public double getSuperficie() {
	return this.circuloGrande.getArea() - this.circuloChico.getArea();
}

}
