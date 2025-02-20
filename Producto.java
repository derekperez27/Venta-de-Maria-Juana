package tienda_hierbas;

public class Producto {
	
	    public String nombre;
	    public String origen;
	    public double precio;

	    public Producto(String nombreParametro, String origenParametro, double precioParametro) {
	        nombre = nombreParametro;
	        origen = origenParametro;
	        precio = precioParametro;
	    }

	    public String mostrarProducto() {
	        return nombre + " (" + origen + ") - $" + precio;
	    }
	}

