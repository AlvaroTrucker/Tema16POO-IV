package Ejercicios;

public abstract class PoligonoRegular implements Comparable<PoligonoRegular> {
	
	private String nombre;
	private int lados;
	private double longitud;
	
	public PoligonoRegular(String nombre, int lados, double longitud) {
		this.nombre = nombre;
		this.lados = lados;
		this.longitud = longitud;
	}
	
	public double getPerimetro(){
		return this.lados*this.longitud;
	}
	
	public abstract double getArea();

	@Override
	public String toString() {
		return "PoligonoRegular [nombre=" + nombre + ", longitud=" + longitud + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + lados;
		long temp;
		temp = Double.doubleToLongBits(longitud);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PoligonoRegular other = (PoligonoRegular) obj;
		if (lados != other.lados)
			return false;
		if (Double.doubleToLongBits(longitud) != Double.doubleToLongBits(other.longitud))
			return false;
		return true;
	}
	
	

	public int getLados() {
		return lados;
	}

	public double getLongitud() {
		return longitud;
	}

	@Override
	public int compareTo(PoligonoRegular o) {
		return this.getLados()-o.getLados();
	}
	
	
	
}
