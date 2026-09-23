package uam.semana3;
// Importación de la clase utilitaria para lectura por consola 

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class EjercicioMultipleSedes_Plantilla {

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
        // Inicialización del lector de teclado 
        Scanner lector = new Scanner(System.in);
        // Variable para almacenar caracteres individuales 
        char inicialProvincia;

        System.out.println("=== CONSULTA DE UBICACIÓN DE EXAMEN UAM ===");
        System.out.print("Ingrese la inicial de su provincia (S=San José, H=Heredia, A=Alajuela): ");
        inicialProvincia = lector.next().charAt(0);

        // Capturamos el texto y extraemos exclusivamente el primer carácter en la posición cero (0) 
        switch (inicialProvincia) {
            case 'S':
                System.out.println("Dirección de la sede San José: Campus Central, Paseo Colón ");
                break;

            case 'H':
                System.out.println("Dirección de la sede Heredia: Centro Comercial Paseo de las Flores");
                break;

            case 'A':
                System.out.println("Dirección de la sede Alajuela: 200m norte del Parque Central");
                break;
            default:
                System.out.println("Inicial no reconocida por el sistema");
        }
        // ESTRUCTURA SELECTIVA MÚLTIPLE CON TIPOS CHAR 
        //?? 
        System.out.println("=========================================================");

        // Cierre preventivo del lector 
        lector.close();
    }
}
