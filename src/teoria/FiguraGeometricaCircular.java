package teoria;

public abstract class FiguraGeometricaCircular implements FiguraGeometrica{
	private double radio1;
	private double radio2;
	
	/**
	 * @param radio1
	 * @param radio2
	 */
	public FiguraGeometricaCircular(double radio1, double radio2) {
		this.radio1 = radio1;
		this.radio2 = radio2;
	}

	/**
	 * @return the radio1
	 */
	public double getRadio1() {
		return radio1;
	}

	/**
	 * @return the radio2
	 */
	public double getRadio2() {
		return radio2;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return NUMERO_PI*this.radio1*this.radio2;
	}

	@Override
	public abstract double getPerimetro();

}
