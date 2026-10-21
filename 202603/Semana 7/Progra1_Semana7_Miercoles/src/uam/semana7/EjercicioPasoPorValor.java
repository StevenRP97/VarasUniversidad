package uam.semana7;

public class EjercicioPasoPorValor {

    // Método que recibe una copia del precio y simula un descuento
    public static void probarDescuento(double precioCombo) {

        System.out.println("\n[DENTRO DEL MÉTODO DE LA SODA]");
        System.out.println("-> Copia del precio recibida: ₡" + precioCombo);

        // Aplicar el descuento únicamente a la copia local
        precioCombo = precioCombo - 500;

        System.out.println("-> Precio simulado con descuento por dentro: ₡"
                + precioCombo);
    }

    public static void main(String[] args) {

        // Declarar el precio base del combo en el main
        double precioCombo = 3000.0;

        System.out.println("=== PUNTO DE VENTA SODA UAM - SIMULACIÓN DE PRECIOS ===");

        // Mostrar el precio original antes de invocar el método
        System.out.println("-> Precio base en MAIN antes del descuento: ₡"
                + precioCombo);

        // Invocar el método pasando el precio como argumento
        probarDescuento(precioCombo);

        // Mostrar el precio después de regresar del método
        System.out.println("\n[DE VUELTA EN EL MAIN DE LA SODA]");
        System.out.println("-> Precio final real en MAIN: ₡" + precioCombo);

        System.out.println("=> Comprobación: El precio del inventario se mantiene "
                + "intacto de forma segura.");

        System.out.println("========================================================");
    }
}
