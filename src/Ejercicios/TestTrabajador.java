package Ejercicios;

public class TestTrabajador {
	public static void main(String[] args) {
		Trabajador t1 = new Oficial("Alvaro", "Jimenez", "1");
		Trabajador t2 = new Tecnico("Joaquin", "Reyes", false);
		
		System.out.printf("%s: %.2f%n", t1.nombreApellidos(), t1.sueldoMensual(20));
		System.out.printf("%s: %.2f\n", t2.nombreApellidos(), t2.sueldoMensual(20));
	}
	
}
