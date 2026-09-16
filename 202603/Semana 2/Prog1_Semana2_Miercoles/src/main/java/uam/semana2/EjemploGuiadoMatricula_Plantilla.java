package uam.semana2;
import java.io.PrintStream;
import java.util.Scanner;

public class EjemploGuiadoMatricula_Plantilla {
    public static void main(String[] args) {
        // Inicialización de lector
        Scanner sc = new Scanner(System.in);
        
        // Forzar salida en consola para caracteres especiales
        try {
            System.setOut(new PrintStream(System.out, true, "UTF-8"));
        } catch (Exception ex) {
        }
        double montoMatricula;
        double recargo = 10000.0;
        double montoFinal;
        boolean esPagoTardio = true;
        
        System.out.println("=== CONTROL DE PAGOS UAM ===");
        
        //Requerimiento: solicitar el monto base de la matrícula
        System.out.print("Ingrese el monto base de la matrícula: c");
        montoMatricula = sc.nextDouble();
        
        // Asignamos por defecto el monto de matrícula
        montoFinal = montoMatricula;
        
        // Se pregunta si es tardío y se suma en caso de sí serlo 
        System.out.println("¿El pago es tardío? (escriba true o false según sea el caso)");
        esPagoTardio = sc.nextBoolean();
        
        if(esPagoTardio == true){
            montoFinal += recargo;
            System.out.println("Se ha detectado pago tardío, por lo que se aplicará el recargo de c" + recargo);
        }
        
        // Salida de datos
        System.out.println("=== RESUMEN DE FACTURACIÓN ===");
        System.out.println("Monto inicial: c" + montoMatricula);
        System.out.println("Monto final (si aplica recargo): c" + montoFinal);
        
        // Se cierra lector
        sc.close();
    }
    
}
