package Ejercicios;

final class Math3 implements Extremos{

	@Override
	public int min(int[] a) {
		int valor = a[0];
		for (int i : a) {
			if (valor>i) valor=i;
		}
		return valor;
	}

	@Override
	public int max(int[] a) {
		int valor = a[0];
		for (int i : a) {
			if (valor<i) valor=i;
		}
		return valor;
	}

	@Override
	public double min(double[] a) {
		double valor = a[0];
		for (double d : a) {
			if(valor>d) valor=d;
		}
		return valor;
	}

	@Override
	public double max(double[] a) {
		double valor = a[0];
		for (double d : a) {
			if (valor<d) valor=d;
		}
		return valor;
	}

	

}
