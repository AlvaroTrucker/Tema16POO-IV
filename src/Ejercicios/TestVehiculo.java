package Ejercicios;

public class TestVehiculo {
	public static void main(String[] args) {
		Vehiculo vC = new Coche();
		
		System.out.println(vC.acelerar(50));
		System.out.println(vC.acelerar(50));
		System.out.println(vC.acelerar(50));
		System.out.println(vC.frenar(40));
		
		Vehiculo vM = new Motocicleta();
		
		System.out.println(vM.acelerar(140));
		System.out.println(vM.frenar(40));
		System.out.println(vM.frenar(70));
		System.out.println(vM.frenar(170));
	}
	
}
