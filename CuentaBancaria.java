// Clase base: CuentaBancaria
public class CuentaBancaria {
    private int numeroCuenta;
    private double saldo;

    public CuentaBancaria(int numeroCuenta ,double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;

    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
    }


    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("No tiene suficiente saldo para retirar");
        }
    }
}



