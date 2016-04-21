package teoria;

import java.util.Arrays;

import java.util.List;

public class TestPersona {

	public static void main(String[] args) {
		Persona[] lista = {new Persona("juan", 22, Persona.Sexo.HOMBRE),
				new Persona("luis", 12, Persona.Sexo.HOMBRE),
				new Persona("luisa", 25, Persona.Sexo.MUJER),
				new Persona("felisa", 11, Persona.Sexo.MUJER)};
		List<Persona> listaPersona =  Arrays.asList(lista);
		System.out.println("Imprimimos todos los datos:");
		for (Persona persona : listaPersona) {
			System.out.println(persona);
		}
		System.out.println("Imprimimos mayores de edad");
		for (Persona persona : listaPersona) {
			if (Persona.esMayorDeEdad(persona))
				System.out.println(persona);
		}
		System.out.println("Imprimir mujeres menores de edad");
		Persona.getMujerMenorEdad(listaPersona, new CriterioMujerMenorEdad());
		System.out.println("Imprimir mujeres u hombres mayores de edad");
		Persona.getPersonaSegunCriterio(listaPersona, new CriterioBusqueda() {
			
			@Override
			public boolean buscarConCriterio(Persona p) {
				// TODO Auto-generated method stub
				return p.getSexo()==Persona.Sexo.MUJER ||
						(p.getSexo()==Persona.Sexo.HOMBRE &&
						p.getEdad() > 17);
			}
		});
		System.out.println("Imprimir hombre o mujeres menores de edad");
		Persona.getPersonaSegunCriterio(listaPersona,
				(Persona p) -> p.getSexo() == Persona.Sexo.HOMBRE ||
					(p.getSexo()==Persona.Sexo.MUJER && 
						p.getEdad() < 18 ));
		
	}

}
class Persona{
	static enum Sexo{
		HOMBRE, MUJER
	}
	private final String nombre;
	private final int edad;
	private final Sexo sexo;
	/**
	 * @param nombre
	 * @param edad
	 * @param sexo
	 */
	public Persona(String nombre, int edad, Sexo sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @return the sexo
	 */
	public Sexo getSexo() {
		return sexo;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + "]";
	}
	public static boolean esMayorDeEdad(Persona p){
		return p.getEdad() > 17;
	}
	public static void getMujerMenorEdad
	  (List<Persona> lista,
			  CriterioMujerMenorEdad c){
		for (Persona persona : lista) {
			if (c.buscarConCriterio(persona))
				System.out.println(persona);
		}
	}
	public static void getPersonaSegunCriterio
	  (List<Persona> lista,
			  CriterioBusqueda c){
		for (Persona persona : lista) {
			if (c.buscarConCriterio(persona))
				System.out.println(persona);
		}
	}
}
@FunctionalInterface
interface CriterioBusqueda{
	boolean buscarConCriterio(Persona p);
}
class CriterioMujerMenorEdad implements CriterioBusqueda{

	@Override
	public boolean buscarConCriterio(Persona p) {
		// TODO Auto-generated method stub
		return p.getSexo() == Persona.Sexo.MUJER &&
				p.getEdad() <18;
	}
	
}








