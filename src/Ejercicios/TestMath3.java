package Ejercicios;

public class TestMath3 {
	public static void main(String[] args) {
		
		int[] valoresInt = {1, 17, 12, 4, 12};
		double[] valoresDouble = {11, 20, 14, 12, 2};
		
		Math3 math = new Math3();
		
		System.out.println(math.max(valoresDouble));
		System.out.println(math.max(valoresInt));
		System.out.println(math.min(valoresDouble));
		System.out.println(math.min(valoresInt));
	}
}
