package Ejercicios;

import java.util.Arrays;

public class ArraysReales implements Estadistica{
	private double[] valores;
	
	public ArraysReales(int tamano, double maximo){
		valores = new double[tamano];
		for (int i = 0; i < tamano; i++) {
			valores[i] = Math.random()*maximo;
			
		}
		Arrays.sort(this.valores);
	}

	@Override
	public String toString() {
		return "ArraysReales [valores=" + Arrays.toString(valores) + "]";
	}

	@Override
	public double minimo() {
		return valores[0];
	}

	@Override
	public double maximo() {
		// TODO Auto-generated method stub
		return valores[valores.length-1];
	}

	@Override
	public double sumatorio() {
		// TODO Auto-generated method stub
		double suma = 0;
		for (double d : valores) {
			suma += d;
		}
		return suma;
	}
	
}
