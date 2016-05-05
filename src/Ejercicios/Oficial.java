package Ejercicios;

public class Oficial extends Trabajador{
	
	private static final double PAGA_DIARIA = 100;
	private String clase;
	
	public Oficial(String nombre, String apellidos, String tipo) {
		super(nombre, apellidos);
		this.clase = tipo;
	}
	
	public String getClase() {
		return this.clase;
	}

	@Override
	public double sueldoMensual(int diasTrabajados) {
		return PAGA_DIARIA*diasTrabajados;
	}	
	
	
}
