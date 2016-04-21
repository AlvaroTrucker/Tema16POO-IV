package teoria;

public class Bebida extends Producto{
	private boolean bebidaAlcoholica;

	/**
	 * @param nombre
	 * @param precio
	 * @param bebidaAlcoholica
	 */
	public Bebida(String nombre, double precio, boolean bebidaAlcoholica) {
		super(nombre, precio);
		this.bebidaAlcoholica = bebidaAlcoholica;
	}

	@Override
	public double getPrecioConIva() {
		// TODO Auto-generated method stub
		return this.getPrecioSinIva()*1.21;
	}
	
	
}
