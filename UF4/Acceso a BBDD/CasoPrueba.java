package Neodatis;

public class CasoPrueba {
	
	public static void main(String[] args) {
		VerProductos verProd = new VerProductos();

		System.out.println("Productos:");
		verProd.showProductsData();

		System.out.println("Ventas:");
		verProd.showSalesData();

		System.out.println("Pedidos:");
		verProd.showOrdersData();

		venderPrimerProducto();
		venderSegundoProducto();

		System.out.println("Productos:");
		verProd.showProductsData();
		
		System.out.println("Ventas:");
		verProd.showSalesData();

		System.out.println("Pedidos:");
		verProd.showOrdersData();
	}


	public static void venderPrimerProducto() {
		BBDD db = new BBDD();
		Producto product = db.getProduct(6);
		db.closeDatabase();

		if (product != null) {
			Pedido order = new Pedido();
			Venta sale = new Venta();

			order.setProducto(product);
			product.addPropertyChangeListener(order);
			product.addPropertyChangeListener(sale);
			product.setVenta(sale);
			product.realizarVenta(4);

			db = new BBDD();
			db.updateProduct(product);
			db.closeDatabase();
		} 
	}


	public static void venderSegundoProducto() {
		BBDD db = new BBDD();
		Producto product = db.getProduct(1);
		db.closeDatabase();

		if (product != null) {
			Pedido order = new Pedido();
			Venta sale = new Venta();

			order.setProducto(product);
			product.addPropertyChangeListener(order);
			product.addPropertyChangeListener(sale);
			product.setVenta(sale);
			product.realizarVenta(8);

			db = new BBDD();
			db.updateProduct(product);
			db.closeDatabase();
		} 
}
}
