package uam.semana12D;

public class ProyectoVivienda extends Proyecto {
    private int numeroCasas;

    public ProyectoVivienda(String codigo, String nombre, double presupuestoBase, int numeroCasas) {
        super(codigo, nombre, presupuestoBase);
        this.numeroCasas = numeroCasas;
    }

    public int getNumeroCasas() {
        return numeroCasas;
    }

    public void setNumeroCasas(int numeroCasas) {
        this.numeroCasas = numeroCasas;
    }

    @Override
    public double calcularCostoTotal() {
        return getPresupuestoBase() + (numeroCasas * 500000.0);
    }
}