import java.util.Scanner;

public class ControlSistema {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Constantes para la combinación correcta
        final String USUARIO_CORRECTO = "Admin";
        final String CONTRASEÑA_CORRECTA = "1234";

        // Bucle que continuará hasta que se ingrese la combinación correcta
        while (true) {
            System.out.print("Ingrese su nombre: ");
            String nombre = scanner.nextLine(); // Leer el nombre

            System.out.print("Ingrese su contraseña: ");
            String contraseña = scanner.nextLine(); // Leer la contraseña

            // Verificar si la combinación es correcta
            if (nombre.equals(USUARIO_CORRECTO) && contraseña.equals(CONTRASEÑA_CORRECTA)) {
                System.out.println("Acceso concedido"); // Mensaje de acceso exitoso
                break; // Salir del bucle
            } else {
                System.out.println("Acceso denegado. Intente nuevamente."); // Mensaje de error
            }
        }

        scanner.close(); // Cerrar el objeto Scanner
    }
}
