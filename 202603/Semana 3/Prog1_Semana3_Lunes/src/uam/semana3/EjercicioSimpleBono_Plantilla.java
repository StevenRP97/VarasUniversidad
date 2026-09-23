package uam.semana3;
// Importación de la herramienta para leer flujos de texto del teclado 
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/* 
 * Fecha: 1/5/26 
 * Semana: 3 
 * Ejercicio: 1 
 * Autor: Rutbelt Rodriguez
 */
public class EjercicioSimpleBono_Plantilla {

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
        // Creación del objeto Scanner para capturar datos 
        Scanner sc = new Scanner(System.in, "UTF-8");
        // Declaración de variables necesarias para el proceso 

        //?? 
        System.out.println("=== SUBSIDIO DE CONECTIVIDAD INGENIERÍA ===");
        // Captura del costo de la mensualidad ordinaria 
        //?? 
        // Captura de la cantidad de materias matriculadas 
        //?? 
        // Establecemos que la mensualidad final por defecto es igual a la base 
        //?? 
        // EVALUACIÓN SELECTIVA SIMPLE 
        // Si el estudiante matriculó 4 o más materias, se hace acreedor del beneficio 
        //?? 
        // Se resta el subsidio al monto que el estudiante debe pagar 
        //?? 
    }
    // Salida de datos para conocimiento del estudiante 
            
    //System.out.println("\n=== TOTAL DE MENSUALIDAD ==="); 

    //System.out.println("Monto final a cancelar: ₡ " + //??); 
    // Cerrando memoria del Scanner 
    //?? 
}
