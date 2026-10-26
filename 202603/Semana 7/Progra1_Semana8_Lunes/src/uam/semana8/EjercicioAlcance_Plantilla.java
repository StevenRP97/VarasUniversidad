package uam.semana8;

public class EjercicioAlcance_Plantilla {

    // Variable global de clase compartida por todo el archivo fuente
    static int totalLibrosPrestados = 100;

    // Subprograma independiente
    public static void procesarDevoluciones() {

        // Variable local del método
        int librosDevueltos = 15;

        System.out.println("\n[DENTRO DEL MÉTODO DE DEVOLUCIONES]");
        System.out.println("-> Transacciones locales virtuales: " + librosDevueltos);

        // Afectación de la variable global compartida
        totalLibrosPrestados = totalLibrosPrestados - librosDevueltos;

        System.out.println("-> Inventario Global consolidado momentáneo: "
                + totalLibrosPrestados);
    }

    public static void main(String[] args) {

        // Variable local del método principal main
        int librosDevueltos = 5;

        System.out.println("=== SISTEMA DE CONTROL DE BIBLIOTECA UAM ===");
        System.out.println("-> Inventario Global inicial: " + totalLibrosPrestados);
        System.out.println("-> Libros devueltos registrados en MAIN: " + librosDevueltos);

        // Modificación del entorno global desde main
        totalLibrosPrestados = totalLibrosPrestados + librosDevueltos;

        System.out.println("-> Inventario Global tras recepción física: "
                + totalLibrosPrestados);

        // Invocación del subprograma secundario
        procesarDevoluciones();

        // Reporte de cierre
        System.out.println("\n====================================================");
        System.out.println("=== CONSOLIDADO TOTAL DE MOVIMIENTOS DIARIOS (GLOBAL) ===");
        System.out.println("=> Total de libros en circulación hoy: "
                + totalLibrosPrestados);
        System.out.println("====================================================");
    }
}
