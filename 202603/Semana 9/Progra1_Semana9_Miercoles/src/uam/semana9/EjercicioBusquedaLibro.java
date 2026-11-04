package uam.semana9;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class EjercicioBusquedaLibro{

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

        // DECLARACIÓN E INICIALIZACIÓN DEL INVENTARIO
        int[] inventarioLibros = {2211, 4433, 6655, 8877, 9900, 1100};

        int target;
        boolean encontrado = false;
        int indice = -1;

        System.out.println("======================================================");
        System.out.println("=== BIBLIOTECA ACADÉMICA UAM - VENTANILLA DE PRÉSTAMOS ===");
        System.out.println("======================================================");

        // SOLICITAR CÓDIGO DEL LIBRO
        System.out.print("Digite el código de barras de 4 dígitos del libro: ");
        target = lector.nextInt();

        // BÚSQUEDA SECUENCIAL
        for (int i = 0; i < inventarioLibros.length; i++) {

            if (inventarioLibros[i] == target) {

                encontrado = true;
                indice = i;
                break;
            }
        }

        // MOSTRAR RESULTADO DE LA BÚSQUEDA
        System.out.println("\n------------------------------------------------------");

        if (encontrado) {

            System.out.println(">>> EJEMPLAR DISPONIBLE EN SALA DE LECTURA <<<");
            System.out.println("-> Código del libro: " + target);
            System.out.println("-> Ubicación Física: Archivador (Estante #"
                    + (indice + 1) + ")");

        } else {

            System.out.println(">>> ERROR: EL EJEMPLAR " + target
                    + " SE ENCUENTRA PRESTADO <<<");
            System.out.println("-> Estado: Comuníquese con la recepción de la biblioteca.");
        }

        System.out.println("======================================================");

        lector.close();
    }
}