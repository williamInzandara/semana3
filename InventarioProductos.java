import java.util.Scanner;

public class InventarioProductos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el número de productos a registrar
        System.out.print("Ingrese el número de productos: ");
        int numeroProductos = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        // Arrays para almacenar los nombres de productos y sus cantidades
        String[] nombres = new String[numeroProductos];
        int[] cantidades = new int[numeroProductos];

        // Registro de productos
        for (int i = 0; i < numeroProductos; i++) {
            System.out.print("Ingrese el nombre del producto " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine(); // Guardar el nombre del producto

            System.out.print("Ingrese la cantidad disponible de " + nombres[i] + ": ");
            cantidades[i] = scanner.nextInt(); // Guardar la cantidad del producto
            scanner.nextLine(); // Limpiar el buffer
        }

        System.out.println("\nRegistro completado.\n");

        // Búsqueda de productos
        while (true) {
            System.out.print("Ingrese el nombre del producto a buscar o escriba 'salir' para terminar: ");
            String productoBuscado = scanner.nextLine();

            if (productoBuscado.equalsIgnoreCase("salir")) {
                System.out.println("Saliendo del sistema...");
                break;
            }

            boolean encontrado = false;

            // Buscar el producto en el inventario
            for (int i = 0; i < numeroProductos; i++) {
                if (nombres[i].equalsIgnoreCase(productoBuscado)) {
                    System.out.println("Cantidad disponible de " + nombres[i] + ": " + cantidades[i]);
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("El producto \"" + productoBuscado + "\" no se encuentra en el inventario.");
            }
        }

        scanner.close(); // Cerrar el scanner
    }
}

