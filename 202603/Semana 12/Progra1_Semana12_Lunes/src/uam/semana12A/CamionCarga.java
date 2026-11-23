package uam.semana12A;

public class CamionCarga extends Vehiculo {
    // Atributo específico inferido del constructor: new CamionCarga("Volvo", "CL-654321", 120000.0, 4.5)
    private double capacidadToneladas;

    public CamionCarga(String marca, String placa, double costoBaseAlquiler, double capacidadToneladas) {
        super(marca, placa, costoBaseAlquiler);
        this.capacidadToneladas = capacidadToneladas;
    }

    public double getCapacidadToneladas() {
        return capacidadToneladas;
    }

    public void setCapacidadToneladas(double capacidadToneladas) {
        this.capacidadToneladas = capacidadToneladas;
    }
}