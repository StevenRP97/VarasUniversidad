
package uam.semana8;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class EjercicioBurbujaSoda {

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

        Scanner lector = new Scanner(System.in);

        // Declaración e instanciación del vector de ventas de caja
        double[] ventasCajas = new double[5];

        System.out.println("=== ARQUEO SODA UAM - REORGANIZACIÓN DE CAJA ===");
        System.out.println("Inicializando registros de 5 cajas registradoras...\n");

        // Fase de llenado del arreglo (Escritura)
        for (int i = 0; i < ventasCajas.length; i++) {
            System.out.print("Ingrese las ventas de la Caja Registradora #"
                    + (i + 1) + ": ₡");

            ventasCajas[i] = lector.nextDouble();
        }

        // Impresión del estado original de ventas
        System.out.print("\n-> Ventas originales en cajas: [ ");
        for (int i = 0; i < ventasCajas.length; i++) {
            System.out.print("₡" + ventasCajas[i] + " ");
        }
        System.out.println("]");

        // Implementación del ordenamiento de la Burbuja
        // Bucle externo para controlar las pasadas
        for (int i = 0; i < ventasCajas.length - 1; i++) {

            // Bucle interno para comparar celdas adyacentes
            for (int j = 0; j < ventasCajas.length - 1 - i; j++) {

                // Si el elemento actual es mayor que el siguiente, intercambiarlos
                if (ventasCajas[j] > ventasCajas[j + 1]) {

                    // Variable temporal para realizar el intercambio (Swap)
                    double temporal = ventasCajas[j];
                    ventasCajas[j] = ventasCajas[j + 1];
                    ventasCajas[j + 1] = temporal;
                }
            }
        }

        // Impresión del estado final de ventas ordenadas
        System.out.print("\n-> Ventas ordenadas de menor a mayor: [ ");
        for (int i = 0; i < ventasCajas.length; i++) {
            System.out.print("₡" + ventasCajas[i] + " ");
        }
        System.out.println("]");

        System.out.println("\nOrdenamiento completado correctamente.");
        System.out.println("==============================================");

        lector.close();
    }
}
