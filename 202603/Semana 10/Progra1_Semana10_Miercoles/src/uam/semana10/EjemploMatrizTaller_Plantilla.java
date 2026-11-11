package uam.semana10;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class EjemploMatrizTaller_Plantilla {

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

        // DECLARACIÓN E INICIALIZACIÓN: Matriz de 3 filas (bahías) y 4 columnas (turnos)
        double[][] matrizRecaudación = {
            {15000, 20000, 18000, 22000},
            {25000, 30000, 28000, 35000},
            {12000, 17000, 19000, 21000}
        };

        // LECTURA: Mostrar estado inicial de la matriz en formato tabular
        System.out.println("=== ESTADO INICIAL DE LA RECAUDACIÓN (3x4) ===");

        // Bucle externo: recorre cada fila de la matriz
        for (int i = 0; i < matrizRecaudación.length; i++) {

            // Bucle interno: recorre cada columna de la fila actual
            for (int j = 0; j < matrizRecaudación[i].length; j++) {

                // Acceso y lectura del elemento en la posición [i][j]
                System.out.print("₡" + matrizRecaudación[i][j] + "\t");
            }

            // Salto de línea al finalizar cada fila
            System.out.println();
        }

        // ACCESO Y ESCRITURA: Actualización puntual del Turno 2 (col 1) de la Bahía 1 (fila 0)
        System.out.println("\n--- Aplicando corrección puntual en Bahía 0, Turno 1 ---");

        // Modificación directa asignando un nuevo valor a la celda específica
        matrizRecaudación[0][1] = 27000;

        // MANIPULACIÓN: Incrementar ₡5000 a todas las celdas de la matriz
        System.out.println("--- Sumando ₡5000 de ajuste a todas las celdas ---");

        for (int i = 0; i < matrizRecaudación.length; i++) {

            for (int j = 0; j < matrizRecaudación[i].length; j++) {

                // Lectura, cálculo y escritura (reestructuración del valor almacenado)
                matrizRecaudación[i][j] = matrizRecaudación[i][j] + 5000;
            }
        }

        // COPIA: Creación de una nueva matriz de dimensiones 3x4 (copia independiente)
        double[][] copiaRecaudacion = new double[3][4];

        // Recorrido para realizar la transferencia valor por valor (Copia Profunda)
        for (int i = 0; i < matrizRecaudación.length; i++) {

            for (int j = 0; j < matrizRecaudación[i].length; j++) {

                // Asignación del valor de la matriz origen a la matriz destino
                copiaRecaudacion[i][j] = matrizRecaudación[i][j];
            }
        }

        // LECTURA DE LA COPIA: Verificación de la matriz independiente resultante
        System.out.println("\n=== MATRIZ COPIADA Y PROCESADA FINAL ===");

        for (int i = 0; i < copiaRecaudacion.length; i++) {

            for (int j = 0; j < copiaRecaudacion[i].length; j++) {

                // Lectura e impresión de los valores contenidos en la matriz copia
                System.out.print("₡" + copiaRecaudacion[i][j] + "\t");
            }

            System.out.println();
        }
    }
}