package Ejercicios;

public class TestTrabajador {
	public static void main(String[] args) {
		Trabajador tO1 = new Oficial("Edward S.", "Lewis", "Primera");
		Trabajador tT1 = new Tecnico("Virginia J.", "Simmons", false);
		
		System.out.format("%s, %s: %.2f\n", tO1.nombreApellidos(), ((Oficial)tO1).getClase() ,tO1.sueldoMensual(20));
		System.out.format("%s: %.2f\n", tT1.nombreApellidos() ,tT1.sueldoMensual(20));
	}
	
}
