package uam.semana6;

import java.util.Scanner;

public class EjemploDeclaracionMetodos_Plantilla {

    // 1. SUBTEMA: DECLARACIÓN DE SUBPROGRAMA - TIPO: SIN RETORNO Y SIN PARÁMETROS
    // Public: Acceso total | Static: Pertenece a la clase (invocable desde main) | Void: No retorna ningún valor
    public static void mostrarMensaje() {
        System.out.println(">>> Bienvenido al sistema de cursos. <<<");
    }

    // 2. SUBTEMA: DECLARACIÓN DE SUBPROGRAMA - TIPO: SIN RETORNO Y CON PARÁMETROS
    // Recibe tres parámetros formales locales: 'nombre', 'creditos' y 'cupo'
    public static void mostrarCurso(String nombre, int creditos, int cupo) {
        System.out.println("\n--- Información del curso ---");
        System.out.println("Nombre del curso: " + nombre);
        System.out.println("Cantidad de créditos: " + creditos);
        System.out.println("Cupo disponible: " + cupo);
    }

    // Método principal (Punto de entrada obligatorio de la aplicación)
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Variables locales para capturar los datos del usuario
        String nombre;
        int creditos;
        int cupo;

        // INVOCACIÓN DEL PRIMER SUBPROGRAMA (Sin parámetros)
        mostrarMensaje();

        // Captura de datos en el flujo principal (main)
        System.out.print("Ingrese el nombre del curso: ");
        nombre = entrada.nextLine();

        System.out.print("Ingrese la cantidad de créditos: ");
        creditos = entrada.nextInt();

        System.out.print("Ingrese el cupo disponible: ");
        cupo = entrada.nextInt();

        // INVOCACIÓN DEL SEGUNDO SUBPROGRAMA (Pasando argumentos reales por valor)
        // El orden de las variables debe coincidir estrictamente con la declaración del método
        mostrarCurso(nombre, creditos, cupo);

        System.out.println("\n>>> Proceso de despliegue modular finalizado con éxito. <<<");
        entrada.close();
    }
}
