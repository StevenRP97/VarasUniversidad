package uam.semana10;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class EjemploRegistroUAM_Plantilla{

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

        // Instanciación del Scanner para entrada de datos por consola
        Scanner lector = new Scanner(System.in);

        // REQUERIMIENTO 1: Declaración e instanciación del vector de tamaño fijo (6 celdas)
        double[] notasOriginal = new double[6];

        // Declaración del segundo vector para la manipulación y ordenación
        double[] notasCopia = new double[6];

        System.out.println("======================================================");
        System.out.println("=== DEPARTAMENTO DE REGISTRO UAM - PROCESO SEMANA 9 ===");
        System.out.println("======================================================");

        // Fase de Escritura: Llenado del vector original
        System.out.println("\n1. FASE DE CAPTURA DE DATOS:");

        for (int i = 0; i < notasOriginal.length; i++) {

            System.out.print("Ingrese la calificación #" + (i + 1) + ": ");
            notasOriginal[i] = lector.nextDouble();
        }

        // REQUERIMIENTO 2: Proceso físico de copia del vector
        // Copiamos elemento por elemento en la misma posición de índice
        for (int i = 0; i < notasOriginal.length; i++) {

            notasCopia[i] = notasOriginal[i];
        }

        System.out.println("\n[SISTEMA]: Copia de seguridad del vector creada con éxito.");

        // REQUERIMIENTO 3: Ordenamiento interno mediante Método de la Burbuja (Ascendente)
        // El ciclo externo 'i' controla cuántas pasadas completas haremos sobre el arreglo
        for (int i = 0; i < notasCopia.length - 1; i++) {

            // El ciclo interno 'j' realiza las comparaciones de parejas adyacentes
            for (int j = 0; j < notasCopia.length - 1 - i; j++) {

                // Condicional de comparación: si el de la izquierda es mayor que el de la derecha
                if (notasCopia[j] > notasCopia[j + 1]) {

                    // Variable temporal para no perder el valor original de la posición 'j'
                    double temporal = notasCopia[j];

                    // Realizamos el intercambio físico en las celdas de memoria
                    notasCopia[j] = notasCopia[j + 1];
                    notasCopia[j + 1] = temporal;
                }
            }
        }

        System.out.println("[SISTEMA]: Vector de calificaciones ordenado de forma ascendente.");

        // Despliegue de los vectores en pantalla para verificación del usuario
        System.out.println("\n2. COMPARATIVA DE VECTORES EN MEMORIA:");
        System.out.println("ÍNDICE\t|\tVECTOR ORIGINAL\t|\tVECTOR ORDENADO");
        System.out.println("---------------------------------------------------------");

        for (int i = 0; i < notasOriginal.length; i++) {

            System.out.println("[" + i + "]\t|\t" + notasOriginal[i]
                    + "\t\t|\t" + notasCopia[i]);
        }

        System.out.println("---------------------------------------------------------");

        // REQUERIMIENTO 4: Algoritmo de Búsqueda Lineal o Secuencial
        System.out.println("\n3. FASE DE CONSULTA Y BÚSQUEDA:");
        System.out.print("Ingrese la calificación exacta que desea buscar en el registro: ");

        double notaBuscada = lector.nextDouble();

        // Variable bandera (interruptor) para rastrear si se localizó el dato buscado
        boolean encontrado = false;

        // Variable entera para almacenar el índice de coincidencia
        int indiceEncontrado = -1;

        // Ciclo secuencial para verificar celda por celda
        for (int i = 0; i < notasCopia.length; i++) {

            // Comparamos el contenido de la posición actual con el valor buscado
            if (notasCopia[i] == notaBuscada) {

                encontrado = true;       // Encendemos la bandera
                indiceEncontrado = i;    // Guardamos la ubicación
                break;                   // Rompemos el ciclo inmediatamente al hallar el primero
            }
        }

        // Despliegue de resultados basados en el estado final del interruptor
        if (encontrado) {

            System.out.println("\n>>> ÉXITO: La nota " + notaBuscada
                    + " fue localizada en el Índice [" + indiceEncontrado
                    + "] del vector ordenado.");

        } else {

            System.out.println("\n>>> ERROR: La nota " + notaBuscada
                    + " no se encuentra registrada en el sistema.");
        }

        System.out.println("\n======================================================");
        System.out.println("========= FIN DEL PROCESAMIENTO ACADÉMICO =============");
        System.out.println("======================================================");

        // Cierre del flujo de entrada por seguridad de memoria
        lector.close();
    }
}