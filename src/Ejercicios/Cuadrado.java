package Ejercicios;

public class Cuadrado extends PoligonoRegular {

	public Cuadrado(double longitud) {
		super("Cuadrado", 4, longitud);
	}

	@Override
	public double getArea() {
		return 2*this.getLongitud();
	}
	

}
