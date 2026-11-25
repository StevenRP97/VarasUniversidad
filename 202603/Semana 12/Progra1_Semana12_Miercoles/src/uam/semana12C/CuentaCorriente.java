package uam.semana12C;

public class CuentaCorriente extends CuentaBancaria {
    private double limiteSobregiro;

    public CuentaCorriente(String numeroCuenta, String titular, double saldoBase, double limiteSobregiro) {
        super(numeroCuenta, titular, saldoBase);
        this.limiteSobregiro = limiteSobregiro;
    }

    public double getLimiteSobregiro() {
        return limiteSobregiro;
    }

    public void setLimiteSobregiro(double limiteSobregiro) {
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public double calcularSaldoTotal() {
        return getSaldoBase() + limiteSobregiro;
    }
}