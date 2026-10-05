package uam.semana5;

import java.io.PrintStream;
import java.util.Scanner;

public class EjemploDoWhileFinal_Plantilla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Forzar salida en consola para caracteres especiales
        try {System.setOut(new PrintStream(System.out, true, "UTF-8"));} catch (Exception ex) {}
        
        String nombreLibro;
        int diasRetraso;
        double montoMulta;
        char respuestaControl = 's';
        
        System.out.println("=== TERMINAL DE COBROS - BIBLIOTECA UAM ===");
        
        do {            
            System.out.println("Ingrese el nombre del libro devuelto: ");
            nombreLibro = sc.nextLine();
            
            System.out.println("Ingrese los días de retraso: ");
            diasRetraso = sc.nextInt();
            
            montoMulta = diasRetraso * 1500;
            System.out.println("El libro " + nombreLibro + " registra una multa de c" + montoMulta);
            
            System.out.println("¿Desea procesar la entrega de otro módulo? (s/n): ");
            respuestaControl = sc.next().charAt(0);
        } while (respuestaControl == 'S' || respuestaControl == 's');
        
        System.out.println("=== Módulo de cálculo de multa cerrado exitosamente ===");
    }
}
