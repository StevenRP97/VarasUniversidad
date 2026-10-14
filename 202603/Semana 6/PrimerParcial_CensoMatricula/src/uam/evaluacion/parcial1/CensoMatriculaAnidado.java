package uam.evaluacion.parcial1;

import java.util.Scanner;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class CensoMatriculaAnidado {

    public static void main(String[] args) {

        // RT-03: Codificación de consola para tener caracteres especiales
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        // RT-02: Captura de flujos para ingreso de datos
        Scanner sc = new Scanner(System.in);

        // RT-04: El acumulador maestro iniciado en 0 para sumarle en cada iteración del ciclo
        int totalEstudiantesMatriculados = 0;
        
        System.out.println("=====================================================");
        System.out.println("=== AUDITORÍA DE MATRÍCULA INSTITUCIONAL - UAM ======");
        System.out.println("=====================================================");
        
        // RT-01 (1/2): Ciclo for para reiterar los turnos
        for (int turno = 1; turno <= 3; turno++) {

            // Muestra una etiqueta divisoria al iniciar cada turno.
            System.out.println("\n>>> AUDITANTO REGISTRO DEL TURNO ACADÉMICO #" + turno);

            // RT-01 (2/2): Ciclo for para reiterar la cantidad de alumnos por materia
            for (int materia = 1; materia <= 2; materia++) {

                // RT-02: Solicitud y captura de la cantidad de estudiantes.
                System.out.print("Turno " + turno + " -> Digite alumnos en materia #" + materia + ": ");

                int estudiantesMateria = sc.nextInt();

                // RT-04 funcionando
                totalEstudiantesMatriculados += estudiantesMateria;
            } // Fin del ciclo interno
        } // Fin del ciclo externo
        
        // Informe final para mostrar los datos obtenidos
        System.out.println("\n=====================================================");
        System.out.println("=== RESUMEN CONSOLIDADO DEL CENSO DE LA MATRÍCULA ===");
        System.out.println("=====================================================");
        System.out.println("Gran total de estudiantes matriculados: " + totalEstudiantesMatriculados + " alumnos.");
        System.out.println("=====================================================");

        // Cierre del Scanner
        sc.close();
    }
}
