package uam.semana8;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class EjercicioOrdenamientoLatencia_Plantilla{

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

        int[] tiemposLatencia = new int[5];

        System.out.println("======================================================");
        System.out.println("=== CONTROL DE LATENCIA DE SERVIDORES - UAM ===");
        System.out.println("======================================================");

        // CAPTURA DE DATOS
        System.out.println("\n--- INGRESO DE DATOS DE LATENCIA ---");

        for (int i = 0; i < tiemposLatencia.length; i++) {
            System.out.print("Ingrese el tiempo de latencia en ms para el Servidor #"
                    + (i + 1) + ": ");

            tiemposLatencia[i] = lector.nextInt();
        }

        // ORDENAMIENTO POR EL MÉTODO DE LA BURBUJA
        for (int i = 0; i < tiemposLatencia.length - 1; i++) {

            for (int j = 0; j < tiemposLatencia.length - 1 - i; j++) {

                if (tiemposLatencia[j] > tiemposLatencia[j + 1]) {

                    int temporal = tiemposLatencia[j];

                    tiemposLatencia[j] = tiemposLatencia[j + 1];

                    tiemposLatencia[j + 1] = temporal;
                }
            }
        }

        // MOSTRAR RESULTADOS ORDENADOS
        System.out.println("\n======================================================");
        System.out.println("=== LISTADO DE LATENCIAS ORDENADO (ASCENDENTE) ===");
        System.out.println("======================================================");

        for (int i = 0; i < tiemposLatencia.length; i++) {

            System.out.println("Servidor en posición " + (i + 1)
                    + " -> Latencia: " + tiemposLatencia[i] + " ms");
        }

        System.out.println("======================================================");

        lector.close();
    }
}