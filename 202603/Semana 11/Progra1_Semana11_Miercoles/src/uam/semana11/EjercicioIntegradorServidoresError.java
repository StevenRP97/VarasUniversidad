package uam.semana11;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class EjercicioIntegradorServidoresError {

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

        int[][] servidores = {
            {15, 20, 18, 22},
            {30, 25, 28, 35},
            {10, 12, 14, 16}
        };

        System.out.println("=== 1. CARGA INICIAL DE SERVIDORES (LECTURA) ===");
        desplegarRendimiento(servidores);

        System.out.println("\n=== 2. PRUEBA DE ELEMENTO INDIVIDUAL Y ESCRITURA ===");
        System.out.println("Carga original en Servidor 1, Bloque 2: " + servidores[1][2]);
        ajustarCargaPuntual(servidores[1][2]);
        System.out.println("Carga en main tras el método: " + servidores[1][2] + " (Sin cambio)");
        servidores[1][2] = 50;
        System.out.println("Escritura manual realizada. Nuevo registro en [1][2]: " + servidores[1][2]);

        System.out.println("\n=== 3. MANIPULACIÓN GLOBAL (+5 UNIDADES DE CARGA) ===");
        incrementarCarga(servidores, 5);
        desplegarRendimiento(servidores);

        System.out.println("\n=== 4. COPIA PROFUNDA DE REGISTROS ===");
        int[][] copiaServidores = duplicarRegistro(servidores);

        System.out.println("=== 5. MATRIZ DUPLICADA RESULTANTE ===");
        desplegarRendimiento(copiaServidores);
    }

    public static void desplegarRendimiento(int[][] datos) {
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.print(datos[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void ajustarCargaPuntual(int cantidad) {
        cantidad = 0;
        System.out.println("  [Dentro de ajustarCargaPuntual] Valor alterado localmente a: " + cantidad);
    }

    public static void incrementarCarga(int[][] datos, int extra) {
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                datos[i][j] = datos[i][j] + extra;
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