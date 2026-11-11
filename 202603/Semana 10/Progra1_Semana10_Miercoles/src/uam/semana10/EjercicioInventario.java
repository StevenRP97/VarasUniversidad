package uam.semana10;

public class EjercicioInventario {
    public static void main(String[] args) {
        // 1. Declarar e inicializar la matriz de 3x4 con las existencias iniciales
        int[][] inventario = {
            {20, 15, 30, 12},
            {40, 25, 18, 50},
            {10, 35, 22, 19}
        };

        // 2. Imprimir el inventario inicial en forma de matriz
        System.out.println("=== INVENTARIO INICIAL POR SUCURSAL ===");
        for (int i = 0; i < inventario.length; i++) {
            for (int j = 0; j < inventario[i].length; j++) {
                System.out.print(inventario[i][j] + " unidades\t");
            }
            System.out.println();
        }
        System.out.println();

        // 3. Actualizar las existencias de la Sucursal 3, Categoría 1 (índices [2][0]) a 50 unidades
        inventario[2][0] = 50;
        System.out.println("--- Reabastecimiento puntual en Sucursal 2, Categoría 0 ---");

        // 4. Restar 3 unidades a cada celda de la matriz por concepto de ventas del día
        for (int i = 0; i < inventario.length; i++) {
            for (int j = 0; j < inventario[i].length; j++) {
                inventario[i][j] -= 3;
            }
        }
        System.out.println("--- Restando 3 unidades por venta diaria a todas las celdas ---\n");

        // 5. Realizar la copia completa de la matriz en una variable llamada inventarioRespaldo
        int[][] inventarioRespaldo = new int[inventario.length][inventario[0].length];
        for (int i = 0; i < inventario.length; i++) {
            for (int j = 0; j < inventario[i].length; j++) {
                inventarioRespaldo[i][j] = inventario[i][j];
            }
        }

        // 6. Mostrar en consola el contenido de inventarioRespaldo
        System.out.println("=== MATRIZ DE RESPALDO PROCESADA ===");
        for (int i = 0; i < inventarioRespaldo.length; i++) {
            for (int j = 0; j < inventarioRespaldo[i].length; j++) {
                System.out.print(inventarioRespaldo[i][j] + " unidades\t");
            }
            System.out.println();
        }
    }
}