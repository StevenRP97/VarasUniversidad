package uam.semana11;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class EjemploMatrizParametro_Plantilla {

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

        // DECLARACIÓN E INICIALIZACIÓN DE LA MATRIZ BASE (3 proyectos x 4 trimestres)
        double[][] avancesProyectos = {
            {15.5, 30.0, 45.5, 60.0},
            {20.0, 40.5, 65.0, 80.5},
            {10.0, 25.0, 50.0, 75.0}
        };

        System.out.println("=== ESTADO INICIAL DE LOS PROYECTOS ===");
        // LLAMADA AL MÉTODO DE IMPRESIÓN: Se pasa la matriz completa como parámetro
        imprimirMatriz(avancesProyectos);

        System.out.println("\n--- Aplicando bono de avance (+5.0%) mediante método modular ---");
        // LLAMADA AL MÉTODO DE MODIFICACIÓN: Modifica la matriz en memoria Heap (por referencia)
        aplicarBonificacion(avancesProyectos, 5.0);

        System.out.println("\n=== ESTADO FINAL DE LOS PROYECTOS (MODIFICADOS EN MAIN) ===");
        // SE VERIFICA QUE LOS CAMBIOS PERSISTEN EN LA MATRIZ ORIGINAL
        imprimirMatriz(avancesProyectos);
    }

    /**
     * Método que recibe una matriz bidimensional completa como parámetro y la imprime.
     * @param datos Matriz de tipo double[][] que contiene la información a desplegar.
     */
    public static void imprimirMatriz(double[][] datos) {
        for (int i = 0; i < datos.length; i++) {
            System.out.print("Proyecto " + (i + 1) + ":\t");
            for (int j = 0; j < datos[i].length; j++) {
                System.out.print(datos[i][j] + "%\t");
            }
            System.out.println();
        }
    }

    /**
     * Método que recibe la referencia de la matriz y altera directamente sus valores.
     * @param datos Matriz original a modificar.
     * @param incremento Valor double que se sumará a cada celda.
     */
    public static void aplicarBonificacion(double[][] datos, double incremento) {
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                datos[i][j] += incremento;
            }
        }
    }
}