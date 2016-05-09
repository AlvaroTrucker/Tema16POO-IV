package Ejercicios;

public class TestVehiculo {
	public static void main(String[] args) {
		Vehiculo coche = new Coche();
		Vehiculo moto = new Motocicleta();
		
		for (int i = 0; i < 40; i++) {
			
			System.out.println(coche.acelerar((int) (Math.random()*100)));
			System.out.println(moto.acelerar((int) (Math.random()*100)));
			System.out.println(coche.frenar((int) (Math.random()*100)));
			System.out.println(moto.frenar((int) (Math.random()*100)));
		}
	}
	
}
