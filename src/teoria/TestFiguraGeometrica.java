package teoria;

public class TestFiguraGeometrica {

	public static void main(String[] args) {
		Circulo c1 = new Circulo(2.2);
		FiguraGeometricaCircular c2 = new Circulo(2.2);
		FiguraGeometrica c3 = new Circulo(2.2);
		System.out.println("Área: "+c1.getArea()+", perímetro: "+
								c1.getPerimetro());
		System.out.println("Área: "+c2.getArea()+", perímetro: "+
				c2.getPerimetro());
		System.out.println("Área: "+c3.getArea()+", perímetro: "+
				c3.getPerimetro());
		System.out.println(c1+"-"+c2+"-"+c3);
		c1.imprimir();
		c2.imprimir();
		c3.imprimir();
		FiguraGeometricaCircular e = new Elipse(2, 5);
		e.imprimir();

	}

}
