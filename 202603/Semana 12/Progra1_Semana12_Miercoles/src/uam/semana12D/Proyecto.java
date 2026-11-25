package uam.semana12D;

public class Proyecto {
    private String codigo;
    private String nombre;
    private double presupuestoBase;

    public Proyecto(String codigo, String nombre, double presupuestoBase) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.presupuestoBase = presupuestoBase;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPresupuestoBase() {
        return presupuestoBase;
    }

    public void setPresupuestoBase(double presupuestoBase) {
        this.presupuestoBase = presupuestoBase;
    }

    public double calcularCostoTotal() {
        return presupuestoBase;
    }
}