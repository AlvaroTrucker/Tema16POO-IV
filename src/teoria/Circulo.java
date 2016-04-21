package teoria;

public class Circulo extends FiguraGeometricaCircular{
	private double radio;
	
	/**
	 * @param radio1
	 * @param radio2
	 * @param radio
	 */
	public Circulo(double radio) {
		super(radio, radio);
		this.radio = radio;
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return NUMERO_PI*2*this.radio;
	}

	/* (non-Javadoc)
	 * @see teoria.FiguraGeometrica#imprimir()
	 */
	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		System.out.printf("CÍRCULO: área: %.2f, perímetro: %.2f%n",
				getArea(),getPerimetro());
	}
	
}
