package uam.semana5;

// Importación de la librería nativa para la captura de flujos desde consola 
import java.util.Scanner;

public class EjercicioForBanderas {

    public static void main(String[] args) {

        // Inicialización del lector de teclado 
        Scanner entrada = new Scanner(System.in);

        // Variables operativas 
        int notaExpediente, expedientesProcesados = 0;

        // CONCEPTUALIZACIÓN CENTRAL: Variable bandera o interruptor de estado lógico 
        // Inicia en "false" porque asumimos que no hay anomalías al arrancar 
        boolean alertaFraude = false;
        System.out.println("=== AUDITORÍA FIJA DE EXPEDIENTES EXTRANJEROS UAM ===");

        System.out.println("Iniciando revisión del lote fijo de 5 expedientes...\n");

        // CICLO DE REPETICIÓN FIJA: Configurado estrictamente para dar 5 vueltas 
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese la nota del expediente #" + i + " (O digite -99 si detecta anomalía): ");
            notaExpediente = entrada.nextInt();
            // EVALUACIÓN DE CONTROL: Si digita el código de anomalía, encendemos la bandera 

            if (notaExpediente == -99) {
                alertaFraude = true;

            }

            // CONTROL DE BANDERA: Validamos el estado del interruptor antes de continuar 
            if (alertaFraude == true) {

                System.out.println("\n[ALERTA CRÍTICA] Se ha activado la bandera de fraude en el expediente #" + i);
                System.out.println("=> Cancelando inmediatamente el procesamiento del lote de forma segura.");
                // Rompe de forma prematura e irrevocable el flujo del ciclo for 
                break;
            }

            // Si la bandera sigue en false, el programa procesa el expediente con normalidad 
            System.out.println("   Expediente #" + i + " validado con éxito.");
            // Incrementamos el contador de éxito 
            expedientesProcesados += 1;

        }

        // Despliegue del informe final dependiendo del estado de la bandera al salir 
        System.out.println("\n==================================================");

        System.out.println("=== CONSOLIDADO DE AUDITORÍA DE LOTES ===");

        System.out.println("==================================================");

        if (alertaFraude == true) {
            System.out.println("-> ESTADO GENERAL: LOTE BLOQUEADO POR SEGURIDAD");

            System.out.println("-> Expedientes salvados antes del bloqueo: " + (99 - expedientesProcesados));

        } else {

            System.out.println("-> ESTADO GENERAL: LOTE COMPLETADO CON ÉXITO");

            System.out.println("-> Total de expedientes archivados: " + expedientesProcesados);

        }

        System.out.println("==================================================");
        entrada.close();
    }

}
