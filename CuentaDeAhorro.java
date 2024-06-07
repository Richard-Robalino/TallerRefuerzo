// Subclase: CuentaDeAhorro
public class CuentaDeAhorro extends CuentaBancaria {
    private double tasaInteres;

    public CuentaDeAhorro(int numeroCuenta,double saldo, double tasaInteres) {
        super(numeroCuenta,saldo);
        this.tasaInteres = tasaInteres;
    }

    public double calcularInteres() {
        double interes = getSaldo() * tasaInteres / 100;
        depositar(interes);
        return interes;
    }
}
