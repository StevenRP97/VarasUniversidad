package uam.semana12C;

public class CuentaBancaria {
    private String numeroCuenta;
    private String titular;
    private double saldoBase;

    public CuentaBancaria(String numeroCuenta, String titular, double saldoBase) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldoBase = saldoBase;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldoBase() {
        return saldoBase;
    }

    public void setSaldoBase(double saldoBase) {
        this.saldoBase = saldoBase;
    }

    public double calcularSaldoTotal() {
        return saldoBase;
    }
}