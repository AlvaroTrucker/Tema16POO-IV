package Ejercicios;

import java.util.Arrays;

public class TestMath3 {

	public static void main(String[] args) {
		final int tamano = 25;
		Math3 math3 = new Math3();
		int[] arraysEnteros = new int[tamano];
		for (int i = 0; i < tamano; i++) {
			arraysEnteros[i] = (int) (Math.random()*100);
		}
		System.out.println("Valor mas pequeño: "+math3.min(arraysEnteros));
		System.out.println(Arrays.toString(arraysEnteros));
		System.out.println("Valor mas grande: "+math3.max(arraysEnteros));

	}

}
