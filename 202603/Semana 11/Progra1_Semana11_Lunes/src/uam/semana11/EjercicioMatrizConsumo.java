package uam.semana11;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Locale;

public class EjercicioMatrizConsumo {

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

        // 1. Declarar e inicializar la matriz de 3x4 de tipo double
        double[][] consumoEnergia = {
            {120.5, 115.0, 130.2, 140.0},
            {95.0, 100.8, 105.0, 110.4},
            {210.0, 205.5, 215.0, 220.0}
        };

        // 2. Mostrar el reporte inicial de consumo
        System.out.println("=== REPORTE INICIAL DE CONSUMO (kWh) ===");
        mostrarConsumo(consumoEnergia);

        // 3. Aplicar el recargo ecológico de 12.5 kWh por paso por referencia
        System.out.println("\n--- Aplicando recargo ecológico (+12.5 kWh) ---\n");
        aplicarRecargoEco(consumoEnergia, 12.5);

        // 4. Mostrar el consumo actualizado desde el main
        System.out.println("=== REPORTE FINAL CON RECARGO APLICADO ===");
        mostrarConsumo(consumoEnergia);
    }

    /**
     * Imprime los valores de consumo energético de la matriz en formato tabular.
     * @param matriz Matriz bidimensional double[][] con los consumos en kWh.
     */
    public static void mostrarConsumo(double[][] matriz) {
        // Se usa Locale.GERMAN (o español) en String.format para mostrar coma decimal (120,5)
        Locale formatoComa = Locale.forLanguageTag("es-CR");
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(String.format(formatoComa, "%.1f kWh\t", matriz[i][j]));
            }
            System.out.println();
        }
    }

    /**
     * Modifica directamente en memoria cada celda sumando el recargo indicado.
     * @param matriz Matriz original a modificar por referencia.
     * @param recargo Valor double que se sumará a cada celda.
     */
    public static void aplicarRecargoEco(double[][] matriz, double recargo) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] += recargo;
            }
        }
    }
}