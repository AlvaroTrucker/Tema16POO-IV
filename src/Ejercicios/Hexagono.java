package Ejercicios;

public class Hexagono extends PoligonoRegular {

	public Hexagono(double longitud) {
		super("Hexagono", 6, longitud);
	}

	@Override
	public double getArea() {
		return (this.getPerimetro()*(Math.pow(this.getLongitud(), 2)-Math.pow(this.getLongitud()/2, 2))/2);
	}

}
