package JavaBean;

import Neodatis.Pedido;
import Neodatis.Producto;

//import javaBean.Pedido;
//import javaBean.Producto;
public class Prueba {
    public static void main(String[] args) {
        Producto producto = new Producto(1,"MiProductoEstrella",10,3,16);
        Pedido pedido =new Pedido();
        pedido.setProducto(producto);
        
        producto.addPropertyChangeListener (pedido);
        producto.setStockactual(2);
    }
}


