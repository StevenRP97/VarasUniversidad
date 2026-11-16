package uam.semana11;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class EjercicioNotasIndividuales {

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

        // 1. Inicializar una matriz notas de 3x3 con valores entre 0 y 100
        int[][] notas = {
            {85, 62, 90},
            {55, 78, 88},
            {92, 40, 71}
        };

        // 2. Recorrer la matriz y evaluar cada calificación individualmente
        System.out.println("=== EVALUACIÓN INDIVIDUAL DE NOTAS ===");
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Grupo " + i + ", Estudiante " + j + " (Nota: " + notas[i][j] + ") -> ");
                evaluarAprobacion(notas[i][j]);
            }
        }

        // 3. Demostración de paso por valor con una celda reprobada: notas[1][0]
        System.out.println("\n--- DEMOSTRACIÓN DE PASO POR VALOR EN ENTEROS ---");
        System.out.println("Nota original en posición [1][0]: " + notas[1][0]);
        
        intentarAlterarNota(notas[1][0]);
        
        System.out.println("Nota en matriz tras la llamada al método: " + notas[1][0] + " (INTACTA)");
    }

    /**
     * Recibe una calificación numérica e imprime si está aprobado o reprobado.
     * @param nota Valor entero correspondiente a la calificación del estudiante.
     */
    public static void evaluarAprobacion(int nota) {
        if (nota >= 70) {
            System.out.println("Status: APROBADO");
        } else {
            System.out.println("Status: REPROBADO");
        }
    }

    /**
     * Intenta modificar el valor recibido asignándole 100 de forma local.
     * @param nota Copia por valor del entero enviado desde la matriz.
     */
    public static void intentarAlterarNota(int nota) {
        nota = 100;
        System.out.println("   [Dentro de intentarAlterarNota] Nota modificada localmente a: " + nota);
    }
}