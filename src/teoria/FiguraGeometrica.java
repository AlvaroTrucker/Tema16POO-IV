package teoria;

public interface FiguraGeometrica {
	double NUMERO_PI = Math.PI;
	double getArea();
	double getPerimetro();
	default void imprimir(){
		System.out.printf("ÁREA: %.2f, PERÍMETRO: %.2f%n",
				getArea(),getPerimetro());
	}
}
