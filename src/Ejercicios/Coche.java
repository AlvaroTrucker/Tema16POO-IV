package Ejercicios;

public class Coche implements Vehiculo{
	
	int velocidad = 0;
	

	@Override
	public String acelerar(int valor) {
		velocidad += valor;
		String cadena = "coche "+velocidad+" km/h";
		if (velocidad>=VELOCIDAD_MAXIMA) cadena += ". Has excedido la velocidad máxima.";
		return cadena;
	}

	@Override
	public String frenar(int valor) {
		velocidad -= valor;
		if (velocidad<=0) velocidad = 0;
		String cadena = "coche "+velocidad+" km/h";
		return cadena;
	}
	
	int numeroPlazas(){
		return 5;
	}

}
