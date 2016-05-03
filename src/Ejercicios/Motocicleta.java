package Ejercicios;

public class Motocicleta implements Vehiculo{
	
	int velocidad = 0;
	
	@Override
	public String acelerar(int valor) {
		velocidad += valor;
		String cadena = "moto "+velocidad+" km/h";
		if (velocidad>=VELOCIDAD_MAXIMA) cadena += ". Has excedido la velocidad maxima.";
		return cadena;
	}

	@Override
	public String frenar(int valor) {
		velocidad -= valor;
		if (velocidad<=0) velocidad = 0;
		String cadena = "moto "+velocidad+" km/h";
		return cadena;
	}
	
	int numeroPlazas(){
		return 2;
	}

}
