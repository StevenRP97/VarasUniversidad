package uam.semana4;

// Importación de la librería nativa para la captura de flujos desde el teclado 
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class EjemploContadorAuditoria {

    public static void main(String[] args) {
        // Inicialización del lector de consola 
        Scanner entrada = new Scanner(System.in);

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

        // Declaración de variables operativas e inicialización de métricas 
        int aula = 1;
        System.out.println("=== SISTEMA DE AUDITORÍA DE INFRAESTRUCTURA UAM ===");
        System.out.println("Iniciando censo para las 4 aulas de Ingeniería...\n");

        // SUBTEMA: CICLO CONTROLADO POR CONTADOR (Límite fijo conocido de antemano = 4) 
        // La variable 'aula' arranca en 1 y se incrementa de uno en uno hasta llegar a 4 
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese la cantidad de asientos para el Aula #" + aula + ": ");

            int asientosAula = entrada.nextInt();

            // REQUERIMIENTO 1: Acumular el total general de asientos en memoria 
            //?? 
            // REQUERIMIENTO 2: Evaluar si el aula actual clasifica como "Alta Capacidad" 
            //?? 
            // Despliegue del reporte consolidado de la auditoría 
            System.out.println("\n==================================================");

            System.out.println("=== REPORTES DE INFRAESTRUCTURA CONSOLIDADO ===");

            System.out.println("==================================================");

            System.out.println("-> Total de asientos disponibles en el edificio: " + "");

            System.out.println("-> Cantidad de aulas de Alta Capacidad (>= 30): " + "");

            System.out.println("==================================================");

        } // Fin del ciclo for. Al terminar la vuelta 4, el programa rompe el bucle y continúa hacia abajo 
        // Solicita el dato al usuario usando el valor actual de la iteración 
        // Cierre preventivo del recurso de lectura para liberar memoria del sistema 
        entrada.close();
    } 
}
