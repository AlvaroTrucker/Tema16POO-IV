package teoria;

public class Elipse extends FiguraGeometricaCircular {

	public Elipse(double radio1, double radio2) {
		super(radio1, radio2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return NUMERO_PI*(3*(getRadio1()+getRadio2())-
				Math.sqrt((3*getRadio1()+getRadio2()))*
				(getRadio1()+3*getRadio2()));
	}

}
