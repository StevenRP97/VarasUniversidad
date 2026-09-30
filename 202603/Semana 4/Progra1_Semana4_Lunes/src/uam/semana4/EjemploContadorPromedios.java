package uam.semana4;

// Importaciones para manejo de flujos de datos y estandarización regional 
import java.util.Locale;
import java.util.Scanner;

public class EjemploContadorPromedios {

    public static void main(String[] args) {
        // Inicialización del lector adaptado para puntos decimales 
        Scanner entrada = new Scanner(System.in);

        entrada.useLocale(Locale.US);

        // Variables de control y métricas 
        double notaEstudiante;
        System.out.println("=== GESTOR DE CALIFICACIONES DE LABORATORIO UAM ===");

        // SUBTEMA: CICLO CONTROLADO POR CONTADOR (Bucle for) 
        // Inicializamos 'i' en 1; el ciclo se repite mientras 'i' sea menor o igual al total; incrementamos 'i' de 1 en 1 
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese la nota del estudiante #" + i + " (0 a 100): ");
            notaEstudiante = entrada.nextDouble();
        }

        // Solicita dinámicamente la nota usando la variable contadora 'i' en el mensaje 
        // Operación de acumulación: suma la nota actual a lo que ya existía en memoria 
        //?? 
        // Expresión matemática para obtener la media aritmética 
        //?? 
        // Despliegue del reporte estadístico final 
        System.out.println("\n=== REPORTE DE RENDIMIENTO ===");

        System.out.println("Total de registros procesados: " + "");

        System.out.println("Promedio general del grupo: " + "");

        System.out.println("===============================");

        entrada.close(); // Cierre del flujo 
    } // Fin del bucle for. El flujo solo sale de aquí cuando la condición da falso 

}
