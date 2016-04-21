package teoria;

import java.util.ArrayList;
import java.util.List;

public class Consumicion {
	private List<Producto> listaConsumicion =
			new ArrayList<Producto>();
	public boolean addProducto(Producto p){
		return listaConsumicion.add(p);
	}
	public void imprimirFactura(){
		double precioSinIva=0;
		double precioConIva=0;
		for (Producto producto : listaConsumicion) {
			precioConIva+=producto.getPrecioConIva();
			precioSinIva+=producto.getPrecioSinIva();
			System.out.printf("%-20s: %.2f€%n",
					producto.getNombre(),
					producto.getPrecioSinIva());
		}
		System.out.printf("%n%-20s: %.2f€%n",
				"TOTAL SIN IVA",
				precioSinIva);
		System.out.printf("%-20s: %.2f€%n",
				"IVA",
				precioConIva-precioSinIva);
		System.out.printf("%-20s: %.2f€%n",
				"TOTAL CON IVA",
				precioConIva);
	}
}
