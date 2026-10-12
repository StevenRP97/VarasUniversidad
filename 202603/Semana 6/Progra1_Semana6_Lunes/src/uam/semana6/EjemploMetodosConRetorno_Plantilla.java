
package uam.semana6;

import java.util.Scanner;

public class EjemploMetodosConRetorno_Plantilla {

    // SUBTEMA: DEVOLUCIÓN DE VALORES - TIPO CON RETORNO (double) Y CON PARAMETROS
    // Reemplazamos 'void' por el tipo de dato específico que el método promete devolver
    public static double calcularMatricula(int creditos, double porcentajeBeca) {

        // Constante local del precio de la educación en Ingeniería
        final double PRECIO_POR_CREDITO = 45000.0;

        // Operaciones aritméticas internas
        double costoTotal = creditos * PRECIO_POR_CREDITO;
        double descuento = costoTotal * (porcentajeBeca / 100.0);
        double totalAPagar = costoTotal - descuento;

        // RETORNO DE VALOR: Envía el resultado numérico de vuelta a quien invocó el método
        return totalAPagar;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int creditos;
        double porcentajeBeca;
        double totalAPagar;

        System.out.println("=== CALCULADORA FINANCIERA DE MATRÍCULA UAM ===");

        System.out.print("Ingrese la cantidad de créditos a matricular: ");
        creditos = entrada.nextInt();

        System.out.print("Ingrese el porcentaje de beca del alumno (0 a 100): ");
        porcentajeBeca = entrada.nextDouble();

        // SUBTEMA: LLAMADO A UN SUBPROGRAMA CON RETORNO
        // El método ejecuta su matemática y el valor devuelto se asigna directamente a 'totalAPagar'
        totalAPagar = calcularMatricula(creditos, porcentajeBeca);

        // Despliegue del resultado obtenido desde el subprograma externo
        System.out.println("\n=============================================");
        System.out.println("=== LIQUIDACIÓN DE CAJA COBRO UAM ========");
        System.out.println("=============================================");
        System.out.printf("-> Costo final neto de matrícula: ₡%.2f%n", totalAPagar);
        System.out.println("=============================================");

        entrada.close();
    }
}
