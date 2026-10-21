
package uam.semana7;

import java.util.Scanner;

public class EjemploMetodosConRetorno_Plantilla {

    // SUBTEMA: DEVOLUCIÓN DE VALORES - TIPO CON RETORNO (double)
    // Y CON PARÁMETROS
    public static double calcularMatricula(int creditos, double porcentajeBeca) {

        // Constante local del precio de la educación en Ingeniería
        final double PRECIO_CREDITO = 15000.0;

        // Operaciones aritméticas internas
        double costoBruto = creditos * PRECIO_CREDITO;
        double montoBeca = costoBruto * (porcentajeBeca / 100);
        double totalAPagar = costoBruto - montoBeca;

        // RETORNO DE VALOR: devuelve el resultado al método que lo invocó
        return totalAPagar;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Declarar las variables operativas
        int cantidadCreditos;
        double porcentajeBeca;
        double totalAPagar;

        System.out.println("=== CALCULADORA FINANCIERA DE MATRÍCULA UAM ===");

        System.out.print("Ingrese la cantidad de créditos a matricular: ");
        cantidadCreditos = entrada.nextInt();

        System.out.print("Ingrese el porcentaje de beca del alumno (0 a 100): ");
        porcentajeBeca = entrada.nextDouble();

        // SUBTEMA: LLAMADO A UN SUBPROGRAMA CON RETORNO
        // Se envían los argumentos y se guarda el valor devuelto
        totalAPagar = calcularMatricula(cantidadCreditos, porcentajeBeca);

        // Despliegue del resultado obtenido desde el subprograma externo
        System.out.println("\n=============================================");
        System.out.println("=== LIQUIDACIÓN DE CAJA COBRO UAM ===========");
        System.out.println("=============================================");
        System.out.printf("-> Costo final neto de matrícula: ₡%.2f%n",
                totalAPagar);
        System.out.println("=============================================");

        entrada.close();
    }
}
