package uam.semana11;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class EjercicioIntegradorClinica {

    public static void main(String[] args) {
        try {
            System.setOut(new PrintStream(System.out, true, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            try {
                System.setOut(new PrintStream(System.out, true, "Windows-1252"));
            } catch (UnsupportedEncodingException ex) {
                ex.printStackTrace();
            }
        }

        int[][] pacientes = {
            {5, 8, 4, 6},
            {10, 7, 9, 11},
            {3, 6, 5, 8}
        };

        System.out.println("=== 1. REGISTRO INICIAL DE PACIENTES (LECTURA) ===");
        desplegarPacientes(pacientes);

        System.out.println("\n=== 2. PRUEBA DE ELEMENTO INDIVIDUAL Y ESCRITURA ===");
        System.out.println("Pacientes originales en Consultorio 1, Día 2: " + pacientes[1][2]);
        ajustarPacientesPuntual(pacientes[1][2]);
        System.out.println("Pacientes en main tras el método: " + pacientes[1][2] + " (Sin cambio)");
        pacientes[1][2] = 15;
        System.out.println("Escritura manual realizada. Nuevo registro en [1][2]: " + pacientes[1][2]);

        System.out.println("\n=== 3. MANIPULACIÓN GLOBAL (+2 PACIENTES POR EMERGENCIA) ===");
        sumarEmergencias(pacientes, 2);
        desplegarPacientes(pacientes);

        System.out.println("\n=== 4. COPIA PROFUNDA DE REGISTROS ===");
        int[][] copiaPacientes = duplicarRegistro(pacientes);

        System.out.println("=== 5. MATRIZ DUPLICADA RESULTANTE ===");
        desplegarPacientes(copiaPacientes);
    }

    public static void desplegarPacientes(int[][] datos) {
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.print(datos[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void ajustarPacientesPuntual(int cantidad) {
        cantidad = 0;
        System.out.println("  [Dentro de ajustarPacientesPuntual] Valor alterado localmente a: " + cantidad);
    }

    public static void sumarEmergencias(int[][] datos, int emergencias) {
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                datos[i][j] += emergencias;
            }
        }
    }

    public static int[][] duplicarRegistro(int[][] origen) {
        int[][] copia = new int[3][4];
        for (int i = 0; i < origen.length; i++) {
            for (int j = 0; j < origen[i].length; j++) {
                copia[i][j] = origen[i][j];
            }
        }
        return copia;
    }
}