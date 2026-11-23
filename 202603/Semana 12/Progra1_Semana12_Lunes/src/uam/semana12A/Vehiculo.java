package uam.semana12A;

public class Vehiculo {
    // Atributos privados
    private String marca;
    private String placa;
    private double costoBaseAlquiler;

    // Constructor lleno
    public Vehiculo(String marca, String placa, double costoBaseAlquiler) {
        this.marca = marca;
        this.placa = placa;
        this.costoBaseAlquiler = costoBaseAlquiler;
    }

    // Métodos Get y Set
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getCostoBaseAlquiler() {
        return costoBaseAlquiler;
    }

    public void setCostoBaseAlquiler(double costoBaseAlquiler) {
        this.costoBaseAlquiler = costoBaseAlquiler;
    }

    // Método base solicitado en el enunciado
    public double calcularCostoFinal() {
        return costoBaseAlquiler;
    }
}