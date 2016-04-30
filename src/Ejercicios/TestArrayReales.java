package Ejercicios;

public class TestArrayReales {
	public static void main(String[] args) {
		
		double[] array = {17, 8, 14, 9, 15};
		ArrayReales aR = new ArrayReales(array);
		
		System.out.println(aR.minimo());
		System.out.println(aR.maximo());
		System.out.println(aR.sumatorio());

	}	
}
