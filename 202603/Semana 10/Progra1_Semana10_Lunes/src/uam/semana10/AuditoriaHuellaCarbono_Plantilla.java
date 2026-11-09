package uam.semana10;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class AuditoriaHuellaCarbono_Plantilla {

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

        // Instanciación del Scanner
        Scanner lector = new Scanner(System.in);

        // REQUERIMIENTO 1: Arreglo guía de regiones
        String[] regiones = {
            "Norteamérica",
            "Europa Occidental",
            "Asia Oriental",
            "Latinoamérica",
            "Medio Oriente",
            "Oceanía"
        };

        // REQUERIMIENTO 2: Declaración de los vectores de emisiones
        int[] emisionesOriginal = new int[6];
        int[] emisionesOrdenadas = new int[6];

        System.out.println("======================================================");
        System.out.println("=== AUDITORÍA DE HUELLA DE CARBONO GLOBAL (CO2) - UAM ===");
        System.out.println("======================================================");

        // FASE 1: CAPTURA DE DATOS
        System.out.println("\n--- FASE 1: INGRESO DE EMISIONES DE CO2 ---");

        for (int i = 0; i < regiones.length; i++) {

            System.out.print("Ingrese las toneladas de CO2 para la región ["
                    + regiones[i] + "]: ");

            emisionesOriginal[i] = lector.nextInt();
        }

        // REQUERIMIENTO 3: Copia de seguridad
        // Copiamos elemento por elemento al segundo vector
        for (int i = 0; i < emisionesOriginal.length; i++) {

            emisionesOrdenadas[i] = emisionesOriginal[i];
        }

        System.out.println("\n[SISTEMA]: Copia de seguridad para ordenamiento procesada.");

        // REQUERIMIENTO 4: Ordenamiento por el método de la Burbuja
        for (int i = 0; i < emisionesOrdenadas.length - 1; i++) {

            for (int j = 0; j < emisionesOrdenadas.length - 1 - i; j++) {

                if (emisionesOrdenadas[j] > emisionesOrdenadas[j + 1]) {

                    // Variable temporal para realizar el intercambio
                    int temporal = emisionesOrdenadas[j];

                    emisionesOrdenadas[j] = emisionesOrdenadas[j + 1];
                    emisionesOrdenadas[j + 1] = temporal;
                }
            }
        }

        System.out.println("[SISTEMA]: Algoritmo de la Burbuja finalizado correctamente.");

        // DESPLIEGUE DEL VECTOR ORDENADO
        System.out.println("\n======================================================");
        System.out.println("=== REPORTE: EMISIONES ORDENADAS DE MENOR A MAYOR ===");
        System.out.println("======================================================");

        for (int i = 0; i < emisionesOrdenadas.length; i++) {

            System.out.println("Posición " + (i + 1) + " -> "
                    + emisionesOrdenadas[i] + " toneladas de CO2");
        }

        System.out.println("======================================================");

        // REQUERIMIENTO 5: Búsqueda lineal
        System.out.print("\nIngrese la cantidad exacta de toneladas de CO2 que desea buscar en el reporte: ");

        int emisionesBuscadas = lector.nextInt();

        // Bandera lógica para determinar si se encontró el valor
        boolean encontrado = false;

        // Variable para almacenar el índice de coincidencia
        int indiceEncontrado = -1;

        // Ciclo secuencial de búsqueda
        for (int i = 0; i < emisionesOrdenadas.length; i++) {

            if (emisionesOrdenadas[i] == emisionesBuscadas) {

                encontrado = true;
                indiceEncontrado = i;
                break;
            }
        }

        // DESPLIEGUE DEL RESULTADO
        if (encontrado) {

            System.out.println("\n¡Resultado Expositivo! La cifra de "
                    + emisionesBuscadas + " toneladas de CO2 fue encontrada.");

            System.out.println("-> Ubicación exacta en el arreglo ordenado: Posición "
                    + (indiceEncontrado + 1) + " (Índice " + indiceEncontrado + ").");

        } else {

            System.out.println("\n>>> RESULTADO: La cifra de "
                    + emisionesBuscadas
                    + " toneladas de CO2 no fue encontrada en el reporte.");
        }

        System.out.println("\n======================================================");
        System.out.println("========= AUDITORÍA AMBIENTAL CONCLUIDA ==============");
        System.out.println("======================================================");

        // Cierre del flujo de entrada
        lector.close();
    }
}