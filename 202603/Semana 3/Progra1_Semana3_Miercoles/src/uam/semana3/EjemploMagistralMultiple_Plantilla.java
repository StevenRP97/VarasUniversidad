package uam.semana3;
// Importamos la herramienta necesaria para interactuar con el teclado 

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class EjemploMagistralMultiple_Plantilla {

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
        // Inicialización del lector de consola 
        Scanner entrada = new Scanner(System.in, "UTF-8");

        // Variables operativas del algoritmo financiero 
        int codigoModalidad;
        double costoMensualidad = 0;

        System.out.println("=== CONSULTA DE TARIFAS UAM ===");
        System.out.print("Ingrese el código de modalidad (1=Presencial, 2=Semipresencial, 3=Virtual): ");
        codigoModalidad = entrada.nextInt();
        // SUBTEMA: SENTENCIA DE DECISIÓN MÚLTIPLE 
        // Evaluamos la variable numérica entera dada por el estudiante 
        switch (codigoModalidad) {
            case 1:
                costoMensualidad = 95000.0;
                System.out.println("Modalidad seleccionada: Presencial");
                break;
            case 2:
                costoMensualidad = 85000.0;
                System.out.println("Modalidad seleccionada: Semipresencial");
                break;
            case 3:
                costoMensualidad = 75000.0;
                System.out.println("Modalidad seleccionada: Virtual");
                break;
            default:
                System.out.println("Código de modalidad no reconocido en el sistema");
        }
        // CONTROL LOGICO: Solo imprimimos el resumen si el costo varió del original (código válido) 
        System.out.println("===MONTO EN FACTURA===");
        System.out.println("El monto de la mensualidad es: c" + costoMensualidad);
        
        System.out.println("=========================================");
        // Liberación formal de los recursos de lectura 
        entrada.close();
    }

}
