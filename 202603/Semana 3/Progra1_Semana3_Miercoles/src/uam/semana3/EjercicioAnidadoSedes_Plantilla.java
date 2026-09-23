package uam.semana3;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.Scanner;

public class EjercicioAnidadoSedes_Plantilla {

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

        // Configuración inicial del Scanner 
        Scanner input = new Scanner(System.in, "UTF-8");
        input.useLocale(Locale.US);

        // Variables operativas 
        double montoMatricula, descuentoDinero, totalFinal, porcentajeDescuento;
        int codigoSede, metodoPago;

        System.out.println("=== SISTEMA DE DESCUENTOS ESTACIONALES UAM ===");
        System.out.print("Ingrese el costo base de la matrícula: ₡");
        montoMatricula = input.nextDouble();

        System.out.print("Ingrese el código de Sede (1 = San José / 2 = Otra Sede): ");
        codigoSede = input.nextInt();

        System.out.print("Ingrese método de pago (1 = Tarjeta Crédito / 2 = Otro método): ");
        metodoPago = input.nextInt();

        // ANIDACIÓN DE ESTRUCTURAS SELECTIVAS 
        // Filtro Principal: Validamos si pertenece a la sede de San José 
        if (codigoSede == 1) {
            // FILTRO ANIDADO: Como es de San José, evaluamos su método de pago interno 
            if (metodoPago == 1) {
                porcentajeDescuento = 0.1;
                System.out.println("Beneficio aplicado del 10% por pagar con tarjeta en sede San José");
            } else {
                porcentajeDescuento = 0.05;
                System.out.println("Beneficio aplicado del 5% por pagar en sede San José");
            }

            // Si el estudiante no pertenece a la Sede Código 1 (San José) 
        } else {
            porcentajeDescuento = 0.03;
            System.out.println("Beneficio aplicado del 3% por matricular en sedes regionales");
        }
        // Operaciones aritméticas y expresiones matemáticas para obtener el neto 
        descuentoDinero = montoMatricula*porcentajeDescuento;
        totalFinal = montoMatricula - descuentoDinero;
        
        // Despliegue del desglose financiero 
        System.out.println("\n=== DETALLE DE FACTURA ===");
        System.out.println("Monto Base: ₡" + montoMatricula);
        System.out.println("Descuento Otorgado: ₡" + descuentoDinero);
        System.out.println("Total Neto a Cancelar: ₡" + totalFinal);
        input.close();
    }

}
