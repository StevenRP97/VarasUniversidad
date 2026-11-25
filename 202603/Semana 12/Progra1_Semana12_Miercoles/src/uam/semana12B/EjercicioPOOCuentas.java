package uam.semana12B;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Locale;

public class EjercicioPOOCuentas {

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

        System.out.println("=== SISTEMA DE GESTIÓN BANCARIA (POO) ===");

        CuentaAhorro cuenta1 = new CuentaAhorro("CR-001", "María Vargas", 200000.0, 5.0);
        CuentaCorriente cuenta2 = new CuentaCorriente("CR-002", "Juan Pérez", 500000.0, 150000.0);

        System.out.println("\n--- Corrigiendo titular mediante Setter ---");
        System.out.println("Titular previo: " + cuenta2.getTitular());
        cuenta2.setTitular("Juan Pérez Mora");
        System.out.println("Titular actualizado: " + cuenta2.getTitular());

        CuentaBancaria[] cuentas = new CuentaBancaria[2];
        cuentas[0] = cuenta1;
        cuentas[1] = cuenta2;

        System.out.println("\n=== RECORRIDO Y EVALUACIÓN POLIMÓRFICA DE CUENTAS ===");

        for (int i = 0; i < cuentas.length; i++) {
            System.out.println("\nCuenta #" + (i + 1));
            System.out.println("Número: " + cuentas[i].getNumeroCuenta());
            System.out.println("Titular: " + cuentas[i].getTitular());
            System.out.println("Saldo Base: ₡" + cuentas[i].getSaldoBase());
            System.out.printf(new Locale("es", "CR"), "Saldo Total Disponible (Polimórfico): ₡%.2f%n", cuentas[i].calcularSaldoTotal());
        }
    }
}