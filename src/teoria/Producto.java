package teoria;

public abstract class Producto {
	private String  nombre;
	private double precio;
	/**
	 * @param nombre
	 * @param precio
	 */
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	public double getPrecioSinIva(){
		return this.precio;
	}
	//no se puede implementar, pues si es comida
	//se le aplica IVA 10%
	//si es bebida IVA 21%
	public abstract double getPrecioConIva();
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return  nombre  +", " + getPrecioConIva() + "€";
	}
	
	

}
