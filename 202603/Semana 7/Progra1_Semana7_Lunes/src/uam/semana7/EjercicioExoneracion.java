
package uam.semana7;

import java.util.Scanner;

public class EjercicioExoneracion {

    // 1. SUBPROGRAMA VOID SIN PARÁMETROS
    // Imprime el encabezado del sistema de exoneraciones
    public static void mostrarBannerExoneracion() {
        System.out.println("***********************************************");
        System.out.println("*** OFICINA DE BIENESTAR ESTUDIANTIL UAM ******");
        System.out.println("*** SISTEMA DE ASIGNACIÓN DE EXONERACIONES ****");
        System.out.println("*** EVALUACIÓN SOCIOECONÓMICA ****************");
        System.out.println("***********************************************");
    }

    // 2. SUBPROGRAMA CON RETORNO (int) Y CON PARÁMETROS
    // Recibe la cantidad de dependientes y calcula el puntaje
    public static int calcularPuntajeVulnerabilidad(int dependientes) {

        // Factor fijo de 15 puntos por cada persona dependiente
        final int FACTOR_PUNTAJE = 15;

        // Calcular el puntaje total obtenido
        int puntajeTotal = dependientes * FACTOR_PUNTAJE;

        // Devolver el resultado al método que invocó este subprograma
        return puntajeTotal;
    }

    // 3. SUBPROGRAMA VOID CON PARÁMETROS
    // Recibe el apellido del estudiante y el puntaje obtenido
    public static void evaluarAprobacion(String apellido, int puntaje) {

        System.out.println("\n***********************************************");
        System.out.println("========== INFORME TÉCNICO DE EXONERACIÓN =====");
        System.out.println("***********************************************");

        System.out.println("-> Familia Postulante: Familia " + apellido);
        System.out.println("-> Puntaje de Vulnerabilidad Obtenido: "
                + puntaje + " puntos.");

        // Evaluar si el puntaje alcanza el mínimo de 45 puntos
        if (puntaje >= 45) {
            System.out.println("-> ESTADO: EXONERACIÓN APROBADA");
        } else {
            System.out.println("-> ESTADO: EXONERACIÓN RECHAZADA");
        }

        System.out.println("***********************************************");
    }

    // MÉTODO PRINCIPAL
    // Coordina la ejecución de los tres subprogramas
    public static void main(String[] args) {

        // Crear el Scanner para leer datos desde la consola
        Scanner entrada = new Scanner(System.in);

        // Declarar las variables operativas
        String apellidoEstudiante;
        int cantidadDependientes;
        int puntajeObtenido;

        // Invocar el subprograma void sin parámetros
        mostrarBannerExoneracion();

        // Solicitar el apellido del estudiante
        System.out.print("Ingrese el primer apellido del estudiante: ");
        apellidoEstudiante = entrada.nextLine();

        // Solicitar la cantidad de personas dependientes del hogar
        System.out.print("Ingrese la cantidad de personas dependientes en el hogar: ");
        cantidadDependientes = entrada.nextInt();

        // Invocar el método con retorno y guardar el puntaje calculado
        puntajeObtenido = calcularPuntajeVulnerabilidad(cantidadDependientes);

        // Invocar el método void con los dos argumentos necesarios
        evaluarAprobacion(apellidoEstudiante, puntajeObtenido);

        // Cerrar el Scanner
        entrada.close();
    }
}
