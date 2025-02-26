import java.util.Scanner;
import java.util.Random;

public class VideojuegosAdivinanza {
    public static void main(String[] args) {
        // Generar un número aleatorio entre 1 y 100
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        int intentos = 0; // Contador de intentos del usuario
        int numeroIngresado;

        System.out.println("<-¡Bienvenido al juego de adivinanza de numeros!->");
        System.out.println("El sistema ha generado un numero entre 1 y 100. Intenta adivinarlo.");

        while (true) {
            System.out.print("Ingresa tu número: ");
            numeroIngresado = scanner.nextInt();
            intentos++;

            // Verificar si el número ingresado es correcto
            if (numeroIngresado == numeroSecreto) {
                System.out.println("[>Felicidades<] (<Adivinaste el número secreto:>) " + numeroSecreto);
                System.out.println("Número de intentos realizados: " + intentos);
                break; // Salir del bucle
            } else if (numeroIngresado < numeroSecreto) {
                System.out.println("El número es mayor.");
            } else {
                System.out.println("El número es menor.");
            }
        }

        scanner.close(); // Cerrar el scanner
    }
}