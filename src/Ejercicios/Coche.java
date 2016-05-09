package Ejercicios;

public class Coche implements Vehiculo{
	private int velocidad = 0;
	
	@Override
	public String acelerar(int valor) {
		velocidad += valor;
		String mensaje = "coche a "+velocidad+" km/h";
		if (velocidad>=VELOCIDAD_MAXIMA)
			mensaje += ". Has excedido la velocidad maxima";
		return mensaje;
	}

	@Override
	public String frenar(int valor) {
		velocidad -= valor;
		if (velocidad<=0)
			velocidad = 0;
		String cadena = "coche a "+velocidad+" km/h";
		return cadena;
	}
	
	public int numeroPlazas(){
		return 5;
	}

}
