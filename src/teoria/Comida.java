package teoria;

public class Comida extends Producto {

	public Comida(String nombre, double precio) {
		super(nombre, precio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrecioConIva() {
		// TODO Auto-generated method stub
		return this.getPrecioSinIva()*1.1;
	}
}
