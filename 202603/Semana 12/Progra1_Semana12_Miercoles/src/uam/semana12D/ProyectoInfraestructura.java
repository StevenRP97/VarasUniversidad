package uam.semana12D;

public class ProyectoInfraestructura extends Proyecto {
    private double kilometros;

    public ProyectoInfraestructura(String codigo, String nombre, double presupuestoBase, double kilometros) {
        super(codigo, nombre, presupuestoBase);
        this.kilometros = kilometros;
    }

    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    @Override
    public double calcularCostoTotal() {
        return getPresupuestoBase() + (kilometros * 1000000.0);
    }
}