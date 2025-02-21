package tienda_hierbas;

public class Tienda {
    public Producto[] productos;

    public Tienda() {
        productos = new Producto[4];
        productos[0] = new Producto("Maria Juana", "Mexico", 1.70);
        productos[1] = new Producto("Hierba de los bosques", "Andorra", 4.20);
        productos[2] = new Producto("La seta feliz", "Marruecos", 2.47);
        productos[3] = new Producto("El oro verde", "Palestina", 1.33);
    }

    public Producto[] buscarPorNombre(String nombreParametro) {
        Producto[] resultado = new Producto[productos.length];
        int contador = 0;
        for (int i = 0; i < productos.length; i++) {
            if (productos[i].nombre.contains(nombreParametro)) {
                resultado[contador] = productos[i];
                contador++;
            }
        }
        return resultado;
    }

    public Producto[] buscarPorOrigen(String origenParametro) {
        Producto[] resultado = new Producto[productos.length];
        int contador = 0;
        for (int i = 0; i < productos.length; i++) {
            if (productos[i].origen.equals(origenParametro)) {
                resultado[contador] = productos[i];
                contador++;
            }
        }
        return resultado;
    }

    public Producto[] ordenarPorPrecioAscendente() {
        Producto[] ordenado = productos.clone(); // Se copia el array original
        for (int i = 0; i < ordenado.length - 1; i++) {
            for (int j = 0; j < ordenado.length - 1 - i; j++) {
                if (ordenado[j].precio > ordenado[j + 1].precio) {
                    Producto temp = ordenado[j];
                    ordenado[j] = ordenado[j + 1];
                    ordenado[j + 1] = temp;
                }
            }
        }
        return ordenado;
    }

    public Producto[] ordenarPorPrecioDescendente() {
        Producto[] ordenado = productos.clone(); // Se copia el array original
        for (int i = 0; i < ordenado.length - 1; i++) {
            for (int j = 0; j < ordenado.length - 1 - i; j++) {
                if (ordenado[j].precio < ordenado[j + 1].precio) {
                    Producto temp = ordenado[j];
                    ordenado[j] = ordenado[j + 1];
                    ordenado[j + 1] = temp;
                }
            }
        }
        return ordenado;
    }
}




