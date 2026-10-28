
package uam.semana8;

import java.util.Scanner;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class EspejoCaja {

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

        // Declarar e instanciar un vector para exactamente 4 cajas registradoras
        double[] cajas = new double[4];

        // Declarar e inicializar la variable totalRecaudado
        double totalRecaudado = 0.0;

        System.out.println("=== PUNTO DE VENTA SODA UAM - CIERRE DE VENTAS ===");
        System.out.println("Inicializando auditoría para 4 cajas registradoras...\n");

        // Bucle for de llenado del arreglo unidimensional (Escritura)
        // RT: el ciclo recorre los índices 0, 1, 2 y 3
        for (int i = 0; i < cajas.length; i++) {

            System.out.print("Ingrese el monto de apertura/cierre de la Caja #"
                    + (i + 1) + ": ₡");

            // Guardar el monto ingresado en la posición actual del vector
            cajas[i] = lector.nextDouble();
        }

        System.out.println("\n=== INFORME CONSOLIDADO DE ARQUEO ===");

        // Segundo bucle for para el procesamiento y visualización (Lectura)
        // RT: recorre las 4 posiciones del arreglo
        for (int i = 0; i < cajas.length; i++) {

            // Mostrar el monto almacenado en la posición actual
            System.out.println("-> Celda [" + i + "] | Registro Caja #"
                    + (i + 1) + " = ₡" + cajas[i]);

            // Sumar el dinero guardado en la posición actual
            totalRecaudado = totalRecaudado + cajas[i];
        }

        System.out.println("-----------------------------------------------------");
        System.out.println("=> Gran total de ingresos diarios del campus: ₡"
                + totalRecaudado);
        System.out.println("============================================");

        lector.close();
    }
}
