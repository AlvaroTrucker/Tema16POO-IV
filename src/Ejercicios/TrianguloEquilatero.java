package Ejercicios;

public class TrianguloEquilatero extends PoligonoRegular {

	public TrianguloEquilatero(double longitud) {
		super("Triangulo Equilatero", 3, longitud);
	}

	@Override
	public double getArea() {
		return (Math.sqrt(3)/4)*Math.pow(this.getLongitud(),2);
	}	

}
