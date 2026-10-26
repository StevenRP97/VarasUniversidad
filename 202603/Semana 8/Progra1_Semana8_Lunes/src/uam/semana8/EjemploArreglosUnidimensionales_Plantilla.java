package uam.semana8;

// Importamos la librería Scanner para interactuar con la terminal
import java.util.Scanner;

public class EjemploArreglosUnidimensionales_Plantilla {

    public static void main(String[] args) {

        // Instanciación del objeto Scanner para capturar datos
        Scanner entrada = new Scanner(System.in);

        // SUBTEMA: DECLARACIÓN E INSTANCIACIÓN DE UN ARREGLO UNIDIMENSIONAL
        // Se crea un arreglo de 5 posiciones para almacenar las notas
        double[] notasGrupo = new double[5];

        // Variables operativas para el procesamiento estadístico
        double sumaNotas = 0;
        double promedioGrupo;

        System.out.println("=========================================================");
        System.out.println("=== SISTEMA DE ADMISIONES UAM - REGISTRO DE NOTAS =======");
        System.out.println("=========================================================");
        System.out.println("Cargando vector en memoria para 5 estudiantes...\n");

        // SUBTEMA: MANIPULACIÓN (ESCRITURA / LLENADO DEL ARREGLO)
        // RT: el ciclo recorre las 5 posiciones, desde el índice 0 hasta el 4
        for (int i = 0; i < notasGrupo.length; i++) {

            // Solicitar la nota del estudiante actual
            System.out.print("Digite la nota final del estudiante #"
                    + (i + 1) + ": ");

            // RT: guardar la nota en la posición actual del arreglo
            notasGrupo[i] = entrada.nextDouble();
        }

        System.out.println("\n=========================================================");
        System.out.println("=========== RECORRIDO Y ANÁLISIS DE DATOS ===============");
        System.out.println("=========================================================");

        // SUBTEMA: MANIPULACIÓN (LECTURA / RECORRIDO DEL ARREGLO)
        // RT: recorrer cada posición para mostrar la nota y acumular la suma
        for (int i = 0; i < notasGrupo.length; i++) {

            // Leer el valor almacenado en la posición actual
            System.out.println("-> Registro en Índice [" + i
                    + "] | Estudiante #" + (i + 1)
                    + " = " + notasGrupo[i]);

            // RT: acumular la nota actual en la suma total
            sumaNotas = sumaNotas + notasGrupo[i];
        }

        // Calcular el promedio usando el tamaño del arreglo
        promedioGrupo = sumaNotas / notasGrupo.length;

        // Despliegue de los resultados del reporte consolidado
        System.out.println("---------------------------------------------------------");
        System.out.println("-> Promedio general de la sección: " + promedioGrupo);
        System.out.println("=========================================================");

        // Cierre del flujo de entrada
        entrada.close();
    }
}
