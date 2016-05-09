package Ejercicios;

public class TestArray {

	public static void main(String[] args) {
		ArraysReales array = new ArraysReales(12,100);
		System.out.println(array);
		System.out.printf("Valor maximo: %.2f%n",array.maximo());
		System.out.printf("Valor minimo: %.2f%n",array.minimo());
		System.out.printf("Suma de valores: %.2f%n",array.sumatorio());
	}

}
