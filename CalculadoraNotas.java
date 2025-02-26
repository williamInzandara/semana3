import java.util.Scanner;

public class CalculadoraNotas {
    public static void main(String[] args) {
        // Entrada del usuario
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de estudiantes: ");
        int numeroEstudiantes = scanner.nextInt(); 

        // variables de estudiantes aprovados y reprobados  
        double sumaNotas = 0;
        int estudiantesAprobados = 0;
        int estudiantesReprobados = 0;

        //calificaciones de los estudiantes
        for (int i = 1; i <= numeroEstudiantes; i++) {
            double nota;
            while (true) {
                System.out.print("Ingrese la calificación del estudiante " + i + " (0.0 - 5.0): ");
                nota = scanner.nextDouble(); // Leer la calificación

                // Verificar que la nota esté en el rango permitido
                if (nota >= 0.0 && nota <= 5.0) {
                    break; // Salir del bucle si la nota es válida
                } else {
                    System.out.println("Calificación incorrecta. Por favor, ingrese un valor entre 0.0 y 5.0.");
                }
            }
          
            sumaNotas += nota;

            // Contar aprobados y reprobados
            if (nota >= 3.0) {
                estudiantesAprobados++;
            } else {
                estudiantesReprobados++;
            }
        }

        // Calcular el promedio de las notas
        double promedio = sumaNotas / numeroEstudiantes;

        // Mostrar los resultados
        System.out.println("\nResultados finales:");
        System.out.println("Promedio de las calificaciones: " + promedio);
        System.out.println("Estudiantes aprobados: " + estudiantesAprobados);
        System.out.println("Estudiantes reprobados: " + estudiantesReprobados);

        scanner.close(); 
    }
}
