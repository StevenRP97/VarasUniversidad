package uam.semana12A;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class EjemploPOOVehiculos {

    public static void main(String[] args) {
        // FORZAR SALIDA EN CONSOLA (Para las tildes y el colón)
        // Intentamos usar UTF-8 nativo en el flujo de impresión, si falla usamos Windows-1252
        try {
            System.setOut(new PrintStream(System.out, true, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            try {
                System.setOut(new PrintStream(System.out, true, "Windows-1252"));
            } catch (UnsupportedEncodingException ex) {
                ex.printStackTrace();
            }
        }

        System.out.println("===SISTEMA DE GESTION DE FLOTA DE VEHICULOS (POO)===");

        // INSTANCIACIÓN DE OBJETOS
        Camioneta camionetaFamilia = new Camioneta("Toyota", "CL-123456", 50000.0, 7);
        CamionCarga camionPesado = new CamionCarga("Volvo", "CL-654321", 120000.0, 4.5);

        // DEMOSTRACIÓN DE ENCAPSULAMIENTO
        System.out.println("\n---Modificando datos de placa mediante Setters");
        System.out.println("Placa previa del camión: " + camionPesado.getPlaca());
        camionPesado.setPlaca("C-999999");
        System.out.println("Placa actualizada del camión: " + camionPesado.getPlaca());

        // MANEJO DE POLIMORFISMO
        Vehiculo[] flota = new Vehiculo[2];
        flota[0] = camionetaFamilia;
        flota[1] = camionPesado;

        System.out.println("\n===RECORRIDO POLIMÓRFICO DE LA FLOTA===");

        // RECORRIDO DE LOS OBJETOS
        for (int i = 0; i < flota.length; i++) {
            System.out.println("\nVehículo #" + (i + 1));
            System.out.println("Marca: " + flota[i].getMarca());
            // Aquí continuarán las impresiones de placa, costo final, etc.
        }
    }
}