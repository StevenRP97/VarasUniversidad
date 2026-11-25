package uam.semana12B;

public class CuentaAhorro extends CuentaBancaria {
    private double tasaInteresAnual;

    public CuentaAhorro(String numeroCuenta, String titular, double saldoBase, double tasaInteresAnual) {
        super(numeroCuenta, titular, saldoBase);
        this.tasaInteresAnual = tasaInteresAnual;
    }

    public double getTasaInteresAnual() {
        return tasaInteresAnual;
    }

    public void setTasaInteresAnual(double tasaInteresAnual) {
        this.tasaInteresAnual = tasaInteresAnual;
    }

    @Override
    public double calcularSaldoTotal() {
        return getSaldoBase() + (getSaldoBase() * (tasaInteresAnual / 100));
    }
}