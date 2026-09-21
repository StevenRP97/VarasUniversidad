package uam.semana3;

// Importación de la herramienta para leer flujos de texto del teclado 
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/* 
 * Fecha: 1/5/26 
 * Semana: 3 
 * Ejercicio: 2 
 * Autor: Rutbelt Rodriguez
 */
public class EjercicioDobleNotas_Plantilla {

    public static void main(String[] args) {
        // FORZAR SALIDA EN CONSOLA (Para las tildes y el colón) 
        // Intentamos usar UTF-8 nativo en el flujo de impresión, si falla usamos Windows-1252 

        try {
            System.setOut(new PrintStream(System.out, true, "UTF-8"));

        } catch (UnsupportedEncodingException e) {
            try {
                System.setOut(new PrintStream(System.out, true, "Windows-1252"));

            } catch (UnsupportedEncodingException ex) {
                // Si ambos fallan, el sistema continúa por defecto 
            }
        }
        // Inicialización del objeto para capturar datos de consola 
        Scanner sc = new Scanner(System.in, "UTF-8");

        // Variable para almacenar la calificación del estudiante 
        double nota = 0.0;
        System.out.println("=== SISTEMA DE ACTAS ACADÉMICAS UAM ===");

        // Captura de la calificación obtenida por el alumno 
        System.out.println("Ingrese la nota obtenida en el curso: ");
        nota = sc.nextDouble();

        // EVALUACIÓN SELECTIVA DOBLE (Caminos mutuamente excluyentes) 
        // Primer camino: Comprobamos si cumple el criterio de aprobación 
        if (nota < 70) {
            System.out.println("Usted NO ha aprobado el curso. Debe matricularlo nuevamente.");

            // Este bloque se ejecuta únicamente si la nota es igual o mayor a 70 
            // El bloque else se ejecuta obligatoriamente si la condición del 'if' da falso (nota menor a 70) 
        } else {
            System.out.println("Felicitaciones! Usted ha aprobado el curso. Puede matricular el siguiente. ");
        }
        System.out.println("=======================================");
        sc.close();
    }
}
    // Finalización del flujo de entrada 
