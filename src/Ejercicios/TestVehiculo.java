package Ejercicios;

public class TestVehiculo {
	public static void main(String[] args) {
		Vehiculo v1 = new Coche();
		
		System.out.println(v1.acelerar(40));
		System.out.println(v1.acelerar(50));
		System.out.println(v1.acelerar(50));
		System.out.println(v1.frenar(20));
		
		Vehiculo v2 = new Motocicleta();
		
		System.out.println(v2.acelerar(140));
		System.out.println(v2.frenar(10));
		System.out.println(v2.frenar(70));
	}
	
}
