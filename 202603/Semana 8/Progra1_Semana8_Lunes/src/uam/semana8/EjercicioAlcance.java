
package uam.semana8;

import java.util.Scanner;

public class EjercicioAlcance{

    // Variable global compartida por todos los métodos de la clase
    static int totalLibrosPrestados = 0;

    // Subprograma independiente
    public static void procesarDevoluciones(int librosDevueltos) {

        // Variable local del método
        int devolucionesLocales = librosDevueltos;

        System.out.println("\n[DENTRO DEL MÉTODO DE DEVOLUCIONES]");
        System.out.println("-> Transacciones locales virtuales: "
                + devolucionesLocales);

        // Actualizar la variable global
        totalLibrosPrestados -= devolucionesLocales;

        System.out.println("-> Inventario Global consolidado momentáneo: "
                + totalLibrosPrestados);
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Variables locales de main
        int librosPrestados;
        int librosDevueltos;
        int opcion;

        System.out.println("=== SISTEMA DE CONTROL DE BIBLIOTECA UAM ===");

        // Solicitar el inventario inicial
        System.out.print("Ingrese la cantidad inicial de libros prestados: ");
        totalLibrosPrestados = entrada.nextInt();

        // Ciclo iterativo para registrar varias operaciones
        do {
            System.out.println("\n========== MENÚ DE MOVIMIENTOS ==========");
            System.out.println("1. Registrar préstamos de libros");
            System.out.println("2. Registrar devoluciones de libros");
            System.out.println("3. Consultar inventario global");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {

                case 1:
                    // Variable local utilizada para registrar préstamos
                    System.out.print("¿Cuántos libros se prestaron?: ");
                    librosPrestados = entrada.nextInt();

                    if (librosPrestados > 0) {
                        // Modificación de la variable global desde main
                        totalLibrosPrestados += librosPrestados;

                        System.out.println("-> Inventario Global tras registrar "
                                + "préstamos: " + totalLibrosPrestados);
                    } else {
                        System.out.println("Ingrese una cantidad positiva.");
                    }
                    break;

                case 2:
                    // Variable local utilizada para registrar devoluciones
                    System.out.print("¿Cuántos libros se devolvieron?: ");
                    librosDevueltos = entrada.nextInt();

                    if (librosDevueltos > 0
                            && librosDevueltos <= totalLibrosPrestados) {

                        // Invocar el subprograma de devoluciones
                        procesarDevoluciones(librosDevueltos);

                    } else {
                        System.out.println(
                                "Cantidad inválida. Verifique el inventario.");
                    }
                    break;

                case 3:
                    System.out.println("-> Inventario Global actual: "
                            + totalLibrosPrestados);
                    break;

                case 4:
                    System.out.println("Cerrando el sistema...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcion != 4);

        // Reporte de cierre
        System.out.println("\n====================================================");
        System.out.println("=== CONSOLIDADO TOTAL DE MOVIMIENTOS DIARIOS =======");
        System.out.println("-> Total de libros en circulación hoy: "
                + totalLibrosPrestados);
        System.out.println("====================================================");

        entrada.close();
    }
}
