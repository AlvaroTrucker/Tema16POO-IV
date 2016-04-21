package teoria;

public class TestProductos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumicion c = new Consumicion();
		Producto b1 = new Bebida("Coca-Cola", 2, false);
		Producto b2 = new Bebida("Cerveza", 1.5, true);
		Producto c1 = new Comida("Bocata", 3);
		Producto c2 = new Comida("Postre", 2);
		c.addProducto(b1);
		c.addProducto(b2);
		c.addProducto(c1);
		c.addProducto(c2);
		/*System.out.println(b1);
		System.out.println(b2);
		System.out.println(c1);
		System.out.println(c2);*/
		c.imprimirFactura();
	}

}
