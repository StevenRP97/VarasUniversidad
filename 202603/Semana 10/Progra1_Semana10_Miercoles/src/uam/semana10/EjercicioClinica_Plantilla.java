package uam.semana10;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class EjercicioClinica_Plantilla {

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

        // DECLARACIÓN E INICIALIZACIÓN: Matriz de 3 consultorios x 4 días
        int[][] pacientes = {
            {10, 12, 8, 15},
            {9, 11, 13, 7},
            {14, 10, 12, 16}
        };

        // LECTURA: Despliegue de la matriz en pantalla
        System.out.println("=== MATRIZ INICIAL DE PACIENTES ===");

        // Ciclo para recorrer las filas
        for (int i = 0; i < pacientes.length; i++) {

            // Ciclo para recorrer las columnas
            for (int j = 0; j < pacientes[i].length; j++) {

                // Lectura de cada valor individual
                System.out.print(pacientes[i][j] + "\t");
            }

            System.out.println();
        }

        // ESCRITURA PUNTUAL: Actualizar Consultorio 1, Día 2 (índices [1][2])
        System.out.println("\n--- Modificando pacientes en Consultorio 1, Día 2 ---");

        pacientes[1][2] = 15;

        // MANIPULACIÓN: Sumar 2 pacientes de emergencia a cada registro
        System.out.println("--- Sumando 2 pacientes de emergencia a todas las celdas ---");

        for (int i = 0; i < pacientes.length; i++) {

            for (int j = 0; j < pacientes[i].length; j++) {

                // Operación de reasignación
                pacientes[i][j] = pacientes[i][j] + 2;
            }
        }

        // COPIA: Instanciación de matriz destino
        int[][] copiaPacientes = new int[3][4];

        // Copia profunda elemento a elemento
        for (int i = 0; i < pacientes.length; i++) {

            for (int j = 0; j < pacientes[i].length; j++) {

                copiaPacientes[i][j] = pacientes[i][j];
            }
        }

        // LECTURA DE LA COPIA: Salida final
        System.out.println("\n=== MATRIZ COPIADA Y ACTUALIZADA DE PACIENTES ===");

        for (int i = 0; i < copiaPacientes.length; i++) {

            for (int j = 0; j < copiaPacientes[i].length; j++) {

                System.out.print(copiaPacientes[i][j] + "\t");
            }

            System.out.println();
        }
    }
}