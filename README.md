package tienda_hierbas; import java.util.Scanner; public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tienda tienda = new Tienda();
        carrito carrito = new carrito();
        int opcion = 0; // Se inicializa en 0 para entrar al bucle

        while (opcion != 8) {
            
            System.out.println("1. Buscar producto por nombre");
            System.out.println("2. Buscar producto por origen");
            System.out.println("3. Ordenar productos por precio (ascendente)");
            System.out.println("4. Ordenar productos por precio (descendente)");
            System.out.println("5. Agregar producto al carrito");
            System.out.println("6. Eliminar producto del carrito");
            System.out.println("7. Ver total del carrito");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();  // Limpiar el buffer

            if (opcion == 1) {
                System.out.print("Ingrese parte del nombre: ");
                String nombre = sc.nextLine();
                Producto[] resultados = tienda.buscarPorNombre(nombre);
                System.out.println("Resultados:");
                for (int i = 0; i < resultados.length; i++) {
                    System.out.println(resultados[i].mostrarProducto());
                }
            } else if (opcion == 2) {
                System.out.print("Ingrese el origen: ");
                String origen = sc.nextLine();
                Producto[] resultados = tienda.buscarPorOrigen(origen);
                System.out.println("Resultados:");
                for (int i = 0; i < resultados.length; i++) {
                    System.out.println(resultados[i].mostrarProducto());
                }
            } else if (opcion == 3) {
                Producto[] ordenados = tienda.ordenarPorPrecioAscendente();
                System.out.println("Productos ordenados de menor a mayor:");
                for (int i = 0; i < ordenados.length; i++) {
                    System.out.println(ordenados[i].mostrarProducto());
                }
            } else if (opcion == 4) {
                Producto[] ordenados = tienda.ordenarPorPrecioDescendente();
                System.out.println("Productos ordenados de mayor a menor:");
                for (int i = 0; i < ordenados.length; i++) {
                    System.out.println(ordenados[i].mostrarProducto());
                }
            } else if (opcion == 5) {
                System.out.println("Productos disponibles:");
                for (int i = 0; i < tienda.productos.length; i++) {
                    System.out.println(i + ". " + tienda.productos[i].mostrarProducto());
                }
                System.out.print("Seleccione el número del producto: ");
                int indice = sc.nextInt();
                carrito.agregarProducto(tienda.productos[indice]);
                System.out.println("Producto añadido al carrito.");
            } else if (opcion == 6) {
                System.out.println("Productos en el carrito:");
                for (int i = 0; i < carrito.cantidadProductos; i++) {
                    System.out.println(i + ". " + carrito.productosCarrito[i].mostrarProducto());
                }
                System.out.print("Seleccione el número del producto a eliminar: ");
                int indice = sc.nextInt();
                carrito.eliminarProducto(indice);
                System.out.println("Producto eliminado del carrito.");
            } else if (opcion == 7) {
                System.out.println("Total de la compra: $" + carrito.calcularTotal());
            }
        }
    }
}

