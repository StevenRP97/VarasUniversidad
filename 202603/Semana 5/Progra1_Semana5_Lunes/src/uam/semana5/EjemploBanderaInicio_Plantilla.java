package uam.semana5;

import java.io.PrintStream;
import java.util.Scanner;

public class EjemploBanderaInicio_Plantilla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Forzar salida en consola para caracteres especiales
        try {System.setOut(new PrintStream(System.out, true, "UTF-8"));} catch (Exception ex) {}
        System.out.println("=== CENSO DE BIENESTAR ESTUDIANTIL UAM");
        
        double ingresoMensual = 0;
        int cantidadAlumnosTotal = 0, cantidadAlumnosParcial = 0;
        int continuar;
        boolean bandera = true;
        
        while (bandera == true) {
            System.out.print("Ingrese el ingreso económico mensual del alumno: ");
            ingresoMensual = sc.nextDouble();
            if (ingresoMensual < 350000) {
                System.out.println("-> PERFIL: Aplica para subsidio total");
                cantidadAlumnosTotal+=1;
            } else{
                System.out.println("-> PERFIL: Aplica para subsidio parcial");
                cantidadAlumnosParcial+=1;
            }
            
            System.out.print("¿Hay más alumnos en la fila? [1- Sí, 2-No]: ");
            continuar = sc.nextInt();
            if (continuar == 2) {bandera = false;}
        }
        System.out.println("=== RESUMEN DE ASIGNACIONES EMITIDAS ===");
        System.out.println("Cantidad de alumnos con beca total: " + cantidadAlumnosTotal);
        System.out.println("Cantidad de alumnos con beca parcial: " + cantidadAlumnosParcial);
        
    }
}
