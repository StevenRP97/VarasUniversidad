package uam.semana12C;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

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

        Scanner scanner = new Scanner(System.in);

        System.out.println("============================================================");
        System.out.println("=== TIENDA DEPARTAMENTAL HEREDIA - CATÁLOGO DE CUENTAS ===");
        System.out.println("============================================================");

        System.out.println("\n[1] Registro de Cuenta de Ahorro");
        System.out.print("Ingrese el número de cuenta: ");
        String numAhorro = scanner.nextLine();
        System.out.print("Ingrese el nombre del titular: ");
        String titularAhorro = scanner.nextLine();
        System.out.print("Ingrese el saldo base: ");
        double saldoAhorro = scanner.nextDouble();
        System.out.print("Ingrese la tasa de interés anual (%): ");
        double tasaAhorro = scanner.nextDouble();
        scanner.nextLine();

        CuentaAhorro cuentaAhorro = new CuentaAhorro(numAhorro, titularAhorro, saldoAhorro, tasaAhorro);

        System.out.println("\n[2] Registro de Cuenta Corriente");
        System.out.print("Ingrese el número de cuenta: ");
        String numCorriente = scanner.nextLine();
        System.out.print("Ingrese el nombre del titular: ");
        String titularCorriente = scanner.nextLine();
        System.out.print("Ingrese el saldo base: ");
        double saldoCorriente = scanner.nextDouble();
        System.out.print("Ingrese el límite de sobregiro: ");
        double sobregiroCorriente = scanner.nextDouble();
        scanner.nextLine();

        CuentaCorriente cuentaCorriente = new CuentaCorriente(numCorriente, titularCorriente, saldoCorriente, sobregiroCorriente);

        System.out.println("\n[3] Actualización de Titular");
        System.out.print("¿Desea actualizar el titular de la Cuenta de Ahorro (1) o Cuenta Corriente (2)? ");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el nuevo nombre del titular: ");
        String nuevoTitular = scanner.nextLine();

        if (opcion == 1) {
            cuentaAhorro.setTitular(nuevoTitular);
            System.out.println("-> Titular de la Cuenta de Ahorro actualizado correctamente.");
        } else if (opcion == 2) {
            cuentaCorriente.setTitular(nuevoTitular);
            System.out.println("-> Titular de la Cuenta Corriente actualizado correctamente.");
        }

        CuentaBancaria[] cuentas = new CuentaBancaria[2];
        cuentas[0] = cuentaAhorro;
        cuentas[1] = cuentaCorriente;

        System.out.println("\n============================================================");
        System.out.println("=== REPORTE GENERAL DE CUENTAS (POLIMORFISMO) ==============");
        System.out.println("============================================================");

        for (int i = 0; i < cuentas.length; i++) {
            System.out.println("Cuenta #" + (i + 1) + " [" + cuentas[i].getNumeroCuenta() + "]");
            System.out.println("  Tipo de cuenta : " + cuentas[i].getClass().getSimpleName());
            System.out.println("  Titular        : " + cuentas[i].getTitular());
            System.out.println("  Saldo base     : " + cuentas[i].getSaldoBase());
            System.out.println("  Saldo total    : " + cuentas[i].calcularSaldoTotal());
            System.out.println("------------------------------------------------------------");
        }

        scanner.close();
    }
}