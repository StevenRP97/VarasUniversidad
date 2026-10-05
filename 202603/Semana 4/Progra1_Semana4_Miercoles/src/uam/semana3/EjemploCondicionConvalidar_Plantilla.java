package uam.semana3;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class EjemploCondicionConvalidar_Plantilla {

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
        int creditosMateria, acumuladorCreditos = 0;

        System.out.println("=== SISTEMA DE CONVALIDACIÓN UAM ===");
        System.out.println("Instrucciones: ingrese los créditos de cada materia");
        System.out.println("Para finalizar, digite 0 en los créditos");
        System.out.println("Ingrese el valor de la primera materia: ");
        creditosMateria = sc.nextInt();

        while (creditosMateria != 0) {
            acumuladorCreditos += creditosMateria;
            System.out.println("Ingrese el valor de la siguiente materia: ");
            creditosMateria = sc.nextInt();
        }
        System.out.println("=== === === ===");
        System.out.println("Cantidad de créditos a convalidar: " + acumuladorCreditos);
        System.out.println("=== === === ===");
    }
}
