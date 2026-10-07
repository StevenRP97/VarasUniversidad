package uam.semana5;

import java.io.PrintStream;
import java.util.Scanner;

public class EjemploCiclosAnidados_Plantilla {

    public static void main(String[] args) {
        // Forzar salida en consola para caracteres especiales
        try {System.setOut(new PrintStream(System.out, true, "UTF-8"));} catch (Exception ex) {}

        // Variables operativas para el inventario nacional 
        Scanner entrada = new Scanner(System.in);
        int computadorasLaboratorio, granTotalComputadoras = 0;

        System.out.println("=== CENSO DE INFRAESTRUCTURA TECNOLÓGICA UAM ===");

        System.out.println("Estructura de Red: 2 Sedes Académicas y 3 Laboratorios por Sede.\n");

        // BUCLE EXTERNO: Controla de forma fija el recorrido de las SEDES (1 al 2) 
        for (int sede = 1; sede <= 2; sede++) {
            System.out.println("--------------------------------------------------");
            System.out.println(">>> INICIANDO REVISIÓN EN SEDE CAMPUS #" + sede + " <<<");
            System.out.println("--------------------------------------------------");
            // BUCLE INTERNO: Se ejecuta por completo por CADA vuelta que dé el bucle externo 

            // Recorre los LABORATORIOS del 1 al 3 
            for (int laboratorio = 1; laboratorio <= 3; laboratorio++) {
                // Solicita de forma cruzada usando las dos variables de control ('sede' y 'laboratorio') 
                System.out.print("Sede " + sede + " -> Ingrese PCs operativas en Laboratorio #" + laboratorio + ": ");
                computadorasLaboratorio = entrada.nextInt();

                // Acumulamos el valor en nuestra métrica global fuera de los dos bucles 
                granTotalComputadoras += computadorasLaboratorio;

            }
            // Fin del bucle interno (Laboratorios). El flujo regresa al bucle externo 

            System.out.println(">>> Fin del inventario para la Sede #" + sede + " <<<\n");

        } // Fin del bucle externo (Sedes). Cuando pasa de 2, el flujo general continúa abajo 

        // Salida final del reporte nacional consolidado 
        System.out.println("==================================================");

        System.out.println("=== INFORME CONSOLIDADO DE ACTIVOS UAM ===");

        System.out.println("==================================================");

        System.out.println("-> Gran Total de computadoras operativas del país: " + granTotalComputadoras);
        System.out.println("==================================================");

        entrada.close();

    }

}
