// Subclase: CuentaCorriente
public class CuentaCorriente extends CuentaBancaria {
    private double limiteDescubierto;

    public CuentaCorriente(int numeroCuenta,double saldo, double limiteDescubierto) {
        super(numeroCuenta,saldo);
        this.limiteDescubierto = limiteDescubierto;
    }

    public double getLimiteDescubierto() {
        return limiteDescubierto;
    }

    @Override
    public void retirar(double monto) {
        if (monto <= limiteDescubierto) {
            super.retirar(monto);
            System.out.println("Saldo cuenta corriente: " + getSaldo());
        } else {
            System.out.println("No puede retirar más de su límite de descubierto");
        }
    }
}