package uam.semana6;

import java.util.Scanner;

public class EjercicioMetodos {

    // 1. SUBTEMA: DECLARACIÓN DE SUBPROGRAMA - TIPO: SIN RETORNO Y SIN PARÁMETROS
    // Método que imprime un banner visual y el título del sistema
    public static void imprimirBannerClub() {
        System.out.println("==============================================");
        System.out.println("       SISTEMA DE ASIGNACIÓN DE");
        System.out.println("             CLUBES UAM");
        System.out.println("==============================================");
    }

    // 2. SUBTEMA: DECLARACIÓN DE SUBPROGRAMA - TIPO: SIN RETORNO Y CON PARÁMETROS
    // Recibe el nombre del club, el apellido del coordinador y la cantidad de miembros
    public static void registrarClub(String nombreClub, String apellidoCoordinador, int cantidadMiembros) {
        System.out.println("\n==============================================");
        System.out.println("       CONFIRMACIÓN DE REGISTRO DEL CLUB");
        System.out.println("==============================================");
        System.out.println("Nombre del club: " + nombreClub);
        System.out.println("Apellido del estudiante coordinador: " + apellidoCoordinador);
        System.out.println("Cantidad de miembros actuales: " + cantidadMiembros);
        System.out.println("Estado: Registro realizado exitosamente.");
        System.out.println("==============================================");
    }

    // Método principal (Punto de entrada de la aplicación)
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Variables locales para capturar los datos del usuario
        String nombreClub;
        String apellidoCoordinador;
        int cantidadMiembros;

        // INVOCACIÓN DEL PRIMER SUBPROGRAMA (Sin parámetros)
        imprimirBannerClub();

        // Captura de datos en el flujo principal (main)
        System.out.print("Ingrese el nombre del club: ");
        nombreClub = entrada.nextLine();

        System.out.print("Ingrese el apellido del estudiante coordinador: ");
        apellidoCoordinador = entrada.nextLine();

        System.out.print("Ingrese la cantidad de miembros actuales: ");
        cantidadMiembros = entrada.nextInt();

        // INVOCACIÓN DEL SEGUNDO SUBPROGRAMA (Con parámetros)
        registrarClub(nombreClub, apellidoCoordinador, cantidadMiembros);

        System.out.println("\n>>> Proceso de registro modular finalizado con éxito. <<<");

        entrada.close();
    }
}
