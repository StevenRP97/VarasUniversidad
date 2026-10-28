
package uam.semana8;

import java.util.Scanner;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class EspejoAsistencia_Plantilla{

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

        Scanner entrada = new Scanner(System.in);

        // Declaración del vector de tamaño 6 (Lunes a Sábado)
        int[] asistenciaDias = new int[6];

        int sumaTotalAsistencia = 0;
        int conteoDiasAltaAsistencia = 0;

        System.out.println("=== CONTROL DE TRÁFICO - LABORATORIOS DE INGENIERÍA ===");
        System.out.println("Cargando matriz semanal de asistencia estudiantil...\n");

        // Ciclo for para llenar el vector de enteros
        for (int i = 0; i < asistenciaDias.length; i++) {

            System.out.print("Digite la cantidad de usuarios del Día #"
                    + (i + 1) + ": ");

            asistenciaDias[i] = entrada.nextInt();
        }

        System.out.println("\n=== DESPLIEGUE Y EVALUACIÓN SENSÓRICA ===");

        // Ciclo for para recorrer y evaluar cada posición del vector
        for (int i = 0; i < asistenciaDias.length; i++) {

            System.out.println("-> Registro Día #" + (i + 1)
                    + " (Índice [" + i + "]) = "
                    + asistenciaDias[i] + " alumnos.");

            // Acumular la asistencia del día actual
            sumaTotalAsistencia = sumaTotalAsistencia + asistenciaDias[i];

            // Evaluar si el día tuvo más de 30 alumnos
            if (asistenciaDias[i] > 30) {

                // Incrementar el contador de días con alta asistencia
                conteoDiasAltaAsistencia++;
            }
        }

        // Impresión final del reporte analítico
        System.out.println("-----------------------------------------------------");
        System.out.println("-> Tránsito total acumulado en la semana: "
                + sumaTotalAsistencia + " estudiantes.");

        System.out.println("-> Cantidad de días con sobrecarga (> 30 alumnos): "
                + conteoDiasAltaAsistencia + " días.");

        System.out.println("=====================================================");

        entrada.close();
    }
}
