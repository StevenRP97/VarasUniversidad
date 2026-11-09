package uam.semana10;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class FinalMundial2026_Plantilla {

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

        // Instanciación del Scanner
        Scanner lector = new Scanner(System.in);

        // REQUERIMIENTO 1: Arreglo guía de selecciones
        String[] selecciones = {
            "Noruega",
            "Inglaterra",
            "Suiza",
            "Argentina",
            "Francia",
            "España"
        };

        // Declaración e instanciación de los vectores de goles
        int[] golesOriginal = new int[6];
        int[] golesOrdenados = new int[6];

        System.out.println("======================================================");
        System.out.println("=== FIFA WORLD CUP 2026 - SISTEMA ESTADÍSTICO UAM ===");
        System.out.println("======================================================");

        // REQUERIMIENTO 2: Fase de captura interactiva
        System.out.println("\n1. FASE DE CAPTURA DE DATOS:");

        for (int i = 0; i < selecciones.length; i++) {

            System.out.print("Digite los goles de " + selecciones[i] + ": ");

            golesOriginal[i] = lector.nextInt();
        }

        // REQUERIMIENTO 3: Copia de seguridad
        // Copiamos elemento por elemento al segundo vector
        for (int i = 0; i < golesOriginal.length; i++) {

            golesOrdenados[i] = golesOriginal[i];
        }

        System.out.println("\n[SISTEMA]: Copia de resguardo para ordenamiento procesada.");

        // REQUERIMIENTO 4: Ordenamiento por el método de la Burbuja
        // El ciclo externo controla las pasadas del algoritmo
        for (int i = 0; i < golesOrdenados.length - 1; i++) {

            // El ciclo interno compara elementos adyacentes
            for (int j = 0; j < golesOrdenados.length - 1 - i; j++) {

                // Si el valor de la izquierda es mayor, se intercambian
                if (golesOrdenados[j] > golesOrdenados[j + 1]) {

                    // Variable temporal para guardar el valor original
                    int temporal = golesOrdenados[j];

                    // Intercambio físico de los valores
                    golesOrdenados[j] = golesOrdenados[j + 1];
                    golesOrdenados[j + 1] = temporal;
                }
            }
        }

        System.out.println("[SISTEMA]: Algoritmo de la Burbuja finalizado de forma correcta.");

        // Despliegue comparativo de los vectores
        System.out.println("\n2. BITÁCORA CONSOLIDADA DE LA FIFA:");
        System.out.println("ÍNDICE\t|\tSELECCIÓN\t|\tGOLES ORIGINALES\t|\tGOLES ORDENADOS");
        System.out.println("--------------------------------------------------------------------------");

        for (int i = 0; i < golesOriginal.length; i++) {

            System.out.println("[" + i + "]\t|\t" + selecciones[i]
                    + "\t\t|\t" + golesOriginal[i] + " goles"
                    + "\t\t|\t" + golesOrdenados[i] + " goles");
        }

        System.out.println("--------------------------------------------------------------------------");

        // REQUERIMIENTO 5: Búsqueda lineal
        System.out.println("\n3. MÓDULO INTERACTIVO DE CONSULTA DE GOLES:");
        System.out.print("Ingrese la cantidad exacta de goles que desea rastrear: ");

        int golesBuscados = lector.nextInt();

        // Bandera lógica para determinar si se encontró el valor
        boolean encontrado = false;

        // Variable para almacenar el índice donde se encuentra
        int indiceEncontrado = -1;

        // Ciclo secuencial para recorrer el vector ordenado
        for (int i = 0; i < golesOrdenados.length; i++) {

            // Comparamos el valor actual con el solicitado
            if (golesOrdenados[i] == golesBuscados) {

                encontrado = true;
                indiceEncontrado = i;
                break;
            }
        }

        // Despliegue del resultado de la búsqueda
        if (encontrado) {

            System.out.println("\n>>> RESULTADO: La cifra de " + golesBuscados
                    + " goles fue hallada en el índice [" + indiceEncontrado
                    + "] del vector ordenado.");

        } else {

            System.out.println("\n>>> RESULTADO: La cifra de " + golesBuscados
                    + " goles no fue encontrada en el vector.");
        }

        System.out.println("\n======================================================");
        System.out.println("======= AUDITORÍA DE MUNDIAL CONCLUIDA CON ÉXITO ======");
        System.out.println("======================================================");

        // Cierre del flujo de entrada
        lector.close();
    }
}