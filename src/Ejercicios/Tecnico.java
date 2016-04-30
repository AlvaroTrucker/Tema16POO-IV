package Ejercicios;

public class Tecnico extends Trabajador{
	
	private final static double PAGA_DIARIA = 200;
	private boolean titulacionSuperior;

	public Tecnico(String nombre, String apellidos, boolean titulacionSuperior) {
		super(nombre, apellidos);
		this.titulacionSuperior = titulacionSuperior;
	}

	@Override
	public double sueldoMensual(int diasTrabajados) {
		return Tecnico.PAGA_DIARIA*diasTrabajados;
	}

	
}
