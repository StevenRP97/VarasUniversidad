package uam.semana7;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class EjercicioRetorno {

    // Método con retorno que calcula el total de la factura
    public static double calcularFactura(int cantidadCombos, double impuestoIva) {

        final double PRECIO_ALMUERZO = 3500.0;

        // Calcular el subtotal según la cantidad de almuerzos
        double subtotal = cantidadCombos * PRECIO_ALMUERZO;

        // Calcular el monto correspondiente al IVA
        double montoIva = subtotal * (impuestoIva / 100);

        // Retornar el total incluyendo el IVA
        return subtotal + montoIva;
    }

    public static void main(String[] args) {

        // Crear el Scanner para leer los datos ingresados
        Scanner lector = new Scanner(System.in);
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

        // Variables operativas
        int cantidadCombos;
        double impuestoIva;
        double facturaFinal;

        System.out.println("=== PUNTO DE FACTURACIÓN - SODA CAMPUS UAM ===");

        System.out.print("Ingrese la cantidad de almuerzos solicitados: ");
        cantidadCombos = lector.nextInt();

        System.out.print("Ingrese el porcentaje de IVA a aplicar (ej. 13): ");
        impuestoIva = lector.nextDouble();

        // Invocar el método y asignar el valor retornado a facturaFinal
        facturaFinal = calcularFactura(cantidadCombos, impuestoIva);

        System.out.println("\n=============================================");
        System.out.println("=== FACTURA DE CONSUMO EMITIDA =============");
        System.out.println("=============================================");
        System.out.printf("-> Total neto a pagar en caja: ₡%.2f%n",
                facturaFinal);
        System.out.println("=============================================");

        lector.close();
    }
}
