package referencias;

import java.util.Objects;

public class Circulo {
private double radio;
public Circulo (double radio) {
	this.setRadio(radio);
}
public Circulo() {
	this(1.0);
}
public void setRadio(double radio) {
	if(radio <= 0)
		throw new Error ("Valor Inválido");
	this.radio = radio;
}
public double getRadio() {
	return this.radio;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Circulo other = (Circulo) obj;
	return Double.doubleToLongBits(radio) == Double.doubleToLongBits(other.radio);
}


}
