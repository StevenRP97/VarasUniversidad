package uam.semana3;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class EjercicioCondicionSoda {

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

        Scanner sc = new Scanner(System.in);
        double costoProducto, montoFinal = 0;

        System.out.println("=== SISTEMA DE CONVALIDACIÓN UAM ===");
        System.out.println("Instrucciones: ingrese el precio de cada producto");
        System.out.println("Para finalizar, digite -1 en el precio");
        System.out.println("Ingrese el valor del primer producto: ");
        costoProducto = sc.nextDouble();

        while (costoProducto != -1) {
            montoFinal += costoProducto;
            System.out.println("Ingrese el valor de la siguiente materia (o -1 para cerrar): ");
            costoProducto = sc.nextDouble();
        }
        System.out.println("=== === TICKET DE COMPRA=== ===");
        System.out.println("Precio final: " + montoFinal);
        System.out.println("=== === === === === === === ===");
    }
}
