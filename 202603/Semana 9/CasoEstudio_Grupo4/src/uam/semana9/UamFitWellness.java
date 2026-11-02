package uam.semana9;

// Importamos la librería Scanner
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.Locale;

public class UamFitWellness {

    // Variables globales para acumular los resultados
    static double totalIngresos = 0.0;
    static int totalPlanesBasicos = 0;
    static int totalPlanesPremium = 0;
    static int totalAfiliados = 0;

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

        // Instanciación del objeto Scanner
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        // BANDERA LOGICA PARA CONTROLAR EL SISTEMA
        boolean sistemaEncendido = true;

        int opcionUsuario;
        int tipoPlan;
        int pagoAnual;

        double tarifaBase;
        double descuento;
        double montoNeto;

        System.out.println("==========================================");
        System.out.println("       TERMINAL DE AFILIACIONES UAM-FIT");
        System.out.println("==========================================");

        // CICLO PRINCIPAL DEL SISTEMA
        while (sistemaEncendido) {

            System.out.println("\n1. Registrar Nueva Afiliacion");
            System.out.println("2. Cerrar Sistema Gym y Arquear");

            System.out.print("Seleccione opcion: ");
            opcionUsuario = entrada.nextInt();

            // ESTRUCTURA SELECTIVA SWITCH
            switch (opcionUsuario) {

                case 1:

                    System.out.print("\nSeleccione Plan (1 = Basico / 2 = Premium): ");
                    tipoPlan = entrada.nextInt();

                    // VALIDACION DEL TIPO DE PLAN
                    while (tipoPlan != 1 && tipoPlan != 2) {
                        System.out.print("Opcion invalida. Seleccione 1 o 2: ");
                        tipoPlan = entrada.nextInt();
                    }

                    System.out.print("Desea suscripcion de facturacion anualizada? (1 = SI / 2 = NO): ");
                    pagoAnual = entrada.nextInt();

                    // VALIDACION DEL PAGO ANUAL
                    while (pagoAnual != 1 && pagoAnual != 2) {
                        System.out.print("Opcion invalida. Seleccione 1 o 2: ");
                        pagoAnual = entrada.nextInt();
                    }

                    // LLAMADA AL METODO ARITMETICO
                    tarifaBase = calcularTarifaBase(tipoPlan);

                    // LLAMADA AL METODO DE DESCUENTO
                    descuento = calcularDescuento(tarifaBase, pagoAnual);

                    // LLAMADA AL METODO DE MONTO NETO
                    montoNeto = calcularMontoNeto(tarifaBase, descuento);

                    // ACUMULACION DE INGRESOS
                    totalIngresos += montoNeto;

                    // CONTADOR DE AFILIADOS
                    totalAfiliados++;

                    if (tipoPlan == 1) {
                        totalPlanesBasicos++;
                    } else {
                        totalPlanesPremium++;
                    }

                    // IMPRESION DE FACTURA INDIVIDUAL
                    imprimirFactura(tarifaBase, descuento, montoNeto);

                    break;

                case 2:

                    // APAGAMOS LA TERMINAL MEDIANTE LA BANDERA
                    sistemaEncendido = false;

                    // LLAMADA AL REPORTE FINAL
                    mostrarReporte();

                    break;

                default:

                    System.out.println("\nOpcion incorrecta. Intente nuevamente.");

                    break;
            }
        }

        entrada.close();

        System.out.println("\nTerminal UAM-FIT desconectada.");
    }

    // METODO PARA CALCULAR LA TARIFA BASE
    public static double calcularTarifaBase(int tipoPlan) {

        double tarifa = 0.0;

        if (tipoPlan == 1) {
            tarifa = 18000.0;
        } else if (tipoPlan == 2) {
            tarifa = 30000.0;
        }

        return tarifa;
    }

    // METODO PARA CALCULAR EL DESCUENTO
    public static double calcularDescuento(double tarifaBase, int pagoAnual) {

        double descuento = 0.0;

        if (pagoAnual == 1) {
            descuento = tarifaBase * 0.20;
        }

        return descuento;
    }

    // METODO PARA CALCULAR EL MONTO NETO
    public static double calcularMontoNeto(double tarifaBase, double descuento) {

        double montoNeto = tarifaBase - descuento;

        return montoNeto;
    }

    // METODO PARA IMPRIMIR LA FACTURA INDIVIDUAL
    public static void imprimirFactura(double tarifaBase,
            double descuento, double montoNeto) {

        System.out.println("\n>>> CONTRATO EMITIDO <<<");

        System.out.println("-> Tarifa base : ₡" + tarifaBase);
        System.out.println("-> Descuento   : ₡" + descuento);
        System.out.println("-> MONTO NETO  : ₡" + montoNeto);

        System.out.println("------------------------------------------");
    }

    // METODO PARA MOSTRAR EL REPORTE Y ARQUEO FINAL
    public static void mostrarReporte() {

        System.out.println("\n==========================================");
        System.out.println("          AUDITORIA GENERAL UAM-FIT");
        System.out.println("==========================================");

        System.out.println("Total de afiliados: " + totalAfiliados);

        System.out.println("Planes Basicos registrados: "
                + totalPlanesBasicos);

        System.out.println("Planes Premium registrados: "
                + totalPlanesPremium);

        System.out.println("------------------------------------------");

        System.out.println("BALANCE TOTAL DE INGRESOS: ₡"
                + totalIngresos);

        System.out.println("==========================================");

        System.out.println("ARQUEO DE CAJA FINALIZADO");
    }
}
