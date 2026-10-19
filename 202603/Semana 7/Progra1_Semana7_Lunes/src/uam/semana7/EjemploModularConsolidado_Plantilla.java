
package uam.semana7;

// Importación de la herramienta nativa para lecturas por consola
import java.util.Scanner;

public class EjemploModularConsolidado_Plantilla {

    // 1. SUBPROGRAMA SIN RETORNO Y SIN PARÁMETROS
    public static void mostrarBienvenida() {
        System.out.println("=========================================================");
        System.out.println("=== DEPARTAMENTO DE SERVICIOS ESTUDIANTILES - UAM =======");
        System.out.println("=== MÓDULO DE AUDITORÍA Y CONTROL DE GRADUACIÓN =========");
        System.out.println("=========================================================");
    }

    // 2. SUBPROGRAMA CON RETORNO (double) Y CON PARÁMETROS
    // Recibe las materias aprobadas y calcula el avance del plan de 40 cursos
    public static double calcularPorcentaje(int materiasAprobadas) {

        // Declarar la constante con el total de materias del plan
        final int TOTAL_MATERIAS = 40;

        // Calcular el porcentaje utilizando casting explícito a double
        double porcentaje = ((double) materiasAprobadas / TOTAL_MATERIAS) * 100;

        // Devolver el porcentaje calculado
        return porcentaje;
    }

    // 3. SUBPROGRAMA SIN RETORNO Y CON PARÁMETROS
    // Recibe los datos procesados para generar el dictamen académico
    public static void imprimirDictamen(String nombreEstudiante, double porcentajeAvance) {
        System.out.println("\n=========================================================");
        System.out.println("=========== DICTAMEN DE AUDITORÍA ACADÉMICA =============");
        System.out.println("=========================================================");
        System.out.println("-> Estudiante Evaluado: " + nombreEstudiante);
        System.out.println("-> Porcentaje de Carrera Completado: " + porcentajeAvance + "%");

        // Si completó el 100 % del plan, puede iniciar el trámite
        if (porcentajeAvance >= 100) {
            System.out.println("-> CONDICIÓN FINAL: [APTO PARA INICIAR TRÁMITE DE GRADUACIÓN]");
        } else {
            System.out.println("-> CONDICIÓN FINAL: [EN CURSO - PENDIENTE DE COMPLETAR PLAN]");
        }

        System.out.println("=========================================================");
    }

    // Método principal: encargado de orquestar los llamados
    public static void main(String[] args) {

        // Inicialización del lector de entradas
        Scanner entrada = new Scanner(System.in);

        // Variables locales del flujo principal
        String nombreEstudiante;
        int materiasGanadas;
        double porcentajeFinal;

        // LLAMADO A UN SUBPROGRAMA void sin parámetros
        mostrarBienvenida();

        // Bloque operativo de captura de datos
        System.out.print("Ingrese el nombre completo del estudiante: ");
        nombreEstudiante = entrada.nextLine();

        System.out.print("Ingrese la cantidad de materias aprobadas a la fecha: ");
        materiasGanadas = entrada.nextInt();

        // LLAMADO A UN SUBPROGRAMA CON RETORNO Y ASIGNACIÓN
        porcentajeFinal = calcularPorcentaje(materiasGanadas);

        // LLAMADO A UN SUBPROGRAMA PASANDO MÚLTIPLES ARGUMENTOS
        imprimirDictamen(nombreEstudiante, porcentajeFinal);

        // Cierre formal del recurso de consola
        entrada.close();
    }
}
