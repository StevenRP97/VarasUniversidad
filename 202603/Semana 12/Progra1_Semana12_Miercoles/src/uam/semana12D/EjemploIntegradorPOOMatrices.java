package uam.semana12D;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Locale;

public class EjemploIntegradorPOOMatrices {

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

        System.out.println("=== 1. GESTIÓN DE OBJETOS POO Y POLIMORFISMO ===");

        Proyecto[] portafolio = new Proyecto[2];
        portafolio[0] = new ProyectoVivienda("PRJ-01", "Torres del Este", 15000000.0, 10);
        portafolio[1] = new ProyectoInfraestructura("PRJ-02", "Ruta San José", 40000000.0, 11.0);

        for (int i = 0; i < portafolio.length; i++) {
            System.out.println("Código: " + portafolio[i].getCodigo() + " | Nombre: " + portafolio[i].getNombre());
            System.out.println("Presupuesto Base: ₡" + portafolio[i].getPresupuestoBase());
            System.out.printf(new Locale("es", "CR"), "Costo Total Calculado (Polimórfico): ₡%.2f%n%n", portafolio[i].calcularCostoTotal());
        }

        System.out.println("=== 2. OPERACIONES SOBRE MATRICES DE AVANCE ===");

        double[][] avances = {
            {25.0, 50.0, 75.0},
            {10.0, 30.0, 60.0}
        };

        System.out.println("--- Matriz Original de Avances ---");
        imprimirMatrizAvances(avances);

        System.out.println("\n--- Prueba de Paso por Valor (Celda Individual) ---");
        System.out.println("Valor original avances[0][0]: " + avances[0][0] + "%");
        auditarAvanceCelda(avances[0][0]);
        System.out.println("Valor en main tras auditoría: " + avances[0][0] + "% (Intacto)");

        System.out.println("\n--- Ajuste Global de Avance por Referencia (+5.0%) ---");
        aplicarAjusteGlobal(avances, 5.0);
        imprimirMatrizAvances(avances);

        System.out.println("\n--- Copia Profunda (Matriz Clonada) ---");
        double[][] copiaAvances = clonarMatriz(avances);
        System.out.println("Impresión de la matriz independiente:");
        imprimirMatrizAvances(copiaAvances);
    }

    public static void imprimirMatrizAvances(double[][] matriz) {
        Locale localeCR = new Locale("es", "CR");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf(localeCR, "%.1f%%\t", matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static void auditarAvanceCelda(double avance) {
        avance = 99.9;
        System.out.println("  [Dentro de auditarAvanceCelda] Valor cambiado a: " + avance + "%");
    }

    public static void aplicarAjusteGlobal(double[][] matriz, double incremento) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] += incremento;
            }
        }
    }

    public static double[][] clonarMatriz(double[][] origen) {
        double[][] copia = new double[origen.length][origen[0].length];
        for (int i = 0; i < origen.length; i++) {
            for (int j = 0; j < origen[i].length; j++) {
                copia[i][j] = origen[i][j];
            }
        }
        return copia;
    }
}