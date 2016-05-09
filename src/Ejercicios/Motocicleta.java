package Ejercicios;

public class Motocicleta implements Vehiculo{
	
	int velocidad = 0;
	
	@Override
	public String acelerar(int valor) {
		velocidad += valor;
		String mensaje = "moto a "+velocidad+" km/h";
		if (velocidad>=VELOCIDAD_MAXIMA) mensaje += ". Has excedido la velocidad maxima.";
		return mensaje;
	}

	@Override
	public String frenar(int valor) {
		velocidad -= valor;
		if (velocidad<=0) velocidad = 0;
		String cadena = "moto a "+velocidad+" km/h";
		return cadena;
	}
	
	public int numeroPlazas(){
		return 2;
	}

}
