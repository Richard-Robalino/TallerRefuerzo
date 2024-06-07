import java.util.Scanner;

// Clase principal para probar las cuentas
public class Mainingresado {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMENU:");
            System.out.println("1. Cuenta Bancaria ");
            System.out.println("2. Cuenta Corriente");
            System.out.println("3. Cuenta Ahorro");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el número de cuenta bancaria: ");
                    int numeroCuenta = scanner.nextInt();
                    System.out.print("Ingrese el saldo inicial: ");
                    double saldoInicial = scanner.nextDouble();
                    CuentaBancaria cuentaBancaria = new CuentaBancaria(numeroCuenta, saldoInicial);
                    System.out.print("Ingrese el monto a retirar: ");
                    double montoRetirar = scanner.nextDouble();
                    cuentaBancaria.retirar(montoRetirar);
                    System.out.print("Ingrese el monto a depositar: ");
                    double montoDepositar = scanner.nextDouble();
                    cuentaBancaria.depositar(montoDepositar);
                    System.out.println("Numero de cuenta Bancaria: " + cuentaBancaria.getNumeroCuenta());
                    System.out.println("Saldo cuenta corriente: " + cuentaBancaria.getSaldo());
                    break;
                case 2:
                    System.out.print("Ingrese el número de cuenta corriente: ");
                    int numeroCuentaCorriente = scanner.nextInt();
                    System.out.print("Ingrese el saldo inicial: ");
                    double saldoInicialCorriente = scanner.nextDouble();
                    System.out.print("Ingrese el límite de crédito: ");
                    double limiteCredito = scanner.nextDouble();
                    CuentaCorriente cuentaCorriente = new CuentaCorriente(numeroCuentaCorriente, saldoInicialCorriente, limiteCredito);
                    System.out.println("Numero de cuenta Bancaria: " + cuentaCorriente.getNumeroCuenta());
                    System.out.println("Saldo cuenta corriente: " + cuentaCorriente.getSaldo());
                    System.out.print("Ingrese el monto a retirar: ");
                    double montoRetirarCorriente = scanner.nextDouble();
                    cuentaCorriente.retirar(montoRetirarCorriente);
                    break;
                case 3:
                    System.out.print("Ingrese el número de cuenta de ahorro: ");
                    int numeroCuentaAhorro = scanner.nextInt();
                    System.out.print("Ingrese el saldo inicial: ");
                    double saldoInicialAhorro = scanner.nextDouble();
                    System.out.print("Ingrese el interés anual: ");
                    double interesAnual = scanner.nextDouble();
                    CuentaDeAhorro cuentaDeAhorro = new CuentaDeAhorro(numeroCuentaAhorro, saldoInicialAhorro, interesAnual);
                    System.out.println("Saldo cuenta de ahorro: " + cuentaDeAhorro.getSaldo());
                    double interes = cuentaDeAhorro.calcularInteres();
                    System.out.println("Interés generado: " + interes);
                    System.out.println("Saldo cuenta de ahorro después de calcular interés: " + cuentaDeAhorro.getSaldo());
                    break;
                case 4:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion incorrecta igresa del 1 al 4");
            }

        } while (opcion!= 4);
    }
}
