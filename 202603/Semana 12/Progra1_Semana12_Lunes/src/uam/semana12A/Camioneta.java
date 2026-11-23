package uam.semana12A;

public class Camioneta extends Vehiculo {
    // Atributo específico inferido del constructor: new Camioneta("Toyota", "CL-123456", 50000.0, 7)
    private int capacidadPasajeros;

    public Camioneta(String marca, String placa, double costoBaseAlquiler, int capacidadPasajeros) {
        super(marca, placa, costoBaseAlquiler);
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }
}