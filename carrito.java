package tienda_hierbas;

public class carrito {
	
	    public Producto[] productosCarrito;
	    public int cantidadProductos;

	    public carrito() {
	        productosCarrito = new Producto[10]; 
	        cantidadProductos = 0;
	        // array i tamaño
	    }

	    public void agregarProducto(Producto productoParametro) {
	        if (cantidadProductos < 10) {
	            productosCarrito[cantidadProductos] = productoParametro;
	            cantidadProductos++;
	        }
	    }
	    //agregar productos

	    public void eliminarProducto(int posicionParametro) {
	        if (posicionParametro >= 0 && posicionParametro < cantidadProductos) {
	            for (int i = posicionParametro; i < cantidadProductos - 1; i++) {
	                productosCarrito[i] = productosCarrito[i + 1];
	            }
	            cantidadProductos--;
	        }
	    }
	    
	    //quitar productos

	    public double calcularTotal() {
	        double total = 0;
	        for (int i = 0; i < cantidadProductos; i++) {
	            total += productosCarrito[i].precio;
	        }
	        return total;
	        
	        
	        // calcular total de compra
	    }
	}


