package uam.semana3;

// Importaciones necesarias para la lectura de datos y la región métrica 
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class EjemploMagistralAnidada_Plantilla {

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
        // Inicialización del lector de teclado configurado para estandarizar entradas 
        Scanner sc = new Scanner(System.in, "UTF-8");

        // Variable para capturar la métrica del problema 
        int creditosAprobados;

        System.out.println("=== CLASIFICADOR DE BLOQUE ACADÉMICO UAM ===");

        System.out.print("Ingrese la cantidad de créditos aprobados: ");

        creditosAprobados = sc.nextInt();

        // SENTENCIA DE DECISIÓN ANIDADA (Estructura en cascada) 
        // Primer filtro: Evaluamos el rango inferior 
        // Se ejecuta si los créditos están entre 0 y 29 
        if (creditosAprobados < 30) {
            System.out.println("Usted es un estudiante de ingreso reciente");

        // Si no fue menor a 30, el programa se anida en el siguiente 'else if' 
        // Se ejecuta si se encuentra en el rango intermedio inclusive 
        } else if (creditosAprobados < 90) {
            System.out.println("Usted es un estudiante de bachillerato avanzado");
        // Si no se cumplió ninguna de las condiciones anteriores, cae en el recolector por defecto 
        // Se ejecuta de forma automática para cualquier valor igual o superior a 90 
        } else {
            System.out.println("Usted es un estudiante avanzado en la carrera");
        }
        System.out.println("=============================================");
        // Cierre formal del flujo de entrada 
        sc.close();
    }
}
