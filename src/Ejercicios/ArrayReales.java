package Ejercicios;

public class ArrayReales implements Estadisticas{
	
	private double[] valores;

	public ArrayReales(double[] valores) {
		this.valores = valores;
	}

	@Override
	public double minimo() {
		double valor = valores[0];
		for (double d : valores) {
			if (valor>d) valor = d;
		}
		return valor;
	}

	@Override
	public double maximo() {
		double valor = valores[0];
		for (double d : valores) {
			if (valor<d) valor = d;
		}
		return valor;
	}

	@Override
	public double sumatorio() {
		double resultado = 0;
		for (double d : valores) {
			resultado += d;
		}
		return resultado;
	}

}
