package uam.semana2;
// Importar librería de lectura de datos
import java.util.Scanner;

public class SolucionMatricula {
    public static void main(String[] args) {
        // 1. Inicialización de variables
        double precioMateria = 85000.0;
        boolean esPrimerIngreso = true;
        int cantidadMaterias;
        
        // 2. Declaración de lector
        Scanner sc = new Scanner(System.in);
        
        // 3. Entrada de datos, lectura e impresión
        System.out.println("***SISTEMA DE MATRÍCULA UAM***");
        System.out.print("Ingrese la cantidad de materias a matricular: ");
        cantidadMaterias = sc.nextInt();
        System.out.println("Usted va a matricular " + cantidadMaterias + " materias");
        
        // 4. Procesamiento
        double totalPagar = precioMateria * cantidadMaterias;
        
        // 5. Bloque condicional con llave
        if(esPrimerIngreso == true){
            totalPagar -= 15000.0;
        }
        
        // 6. Salida de datos 
        System.out.println("Usted va a pagar c" + totalPagar + " colones");
        
        // 7. Cierre de recurso
        sc.close();
    }
}
