package uam.semana4;

// Importar las librerías necesarias
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class EjercicioContadorTablas {
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
        
        // Declaración de variables e impresiones
        Scanner sc = new Scanner(System.in, "UTF-8");
        System.out.print("Por favor ingrese el número entero que desea estudiar: ");
        int numeroMultiplicar = sc.nextInt();
        System.out.println("TABLAS DEL " + numeroMultiplicar);
        System.out.println("==== ==== ==== ==== ====");
        
        // Se repite el ciclo mientras que i sea menor que 13
        for (int i = 1; i < 13; i++) {
            System.out.println(numeroMultiplicar + " x " + i + " = " + (numeroMultiplicar * i));
        }
        System.out.println("==== ==== ==== ==== ====");
        System.out.println("Gracias por usar el sistems");
        
    }
    
}
