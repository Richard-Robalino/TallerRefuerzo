import java.util.Scanner;

// Clase principal para probar las cuentas
public class Main {
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
                    CuentaBancaria cuentaBancaria=new CuentaBancaria(1245454846,500.20);
                    cuentaBancaria.retirar(200);
                    cuentaBancaria.depositar(100);
                    System.out.println("Numero de cuenta Bancaria: " + cuentaBancaria.getNumeroCuenta());
                    System.out.println("Saldo cuenta corriente: " + cuentaBancaria.getSaldo());
                    break;
                case 2:
                    CuentaCorriente cuentaCorriente = new CuentaCorriente(1234, 1000.0,100);
                    System.out.println("Numero de cuenta Bancaria: " + cuentaCorriente.getNumeroCuenta());
                    System.out.println("Saldo cuenta corriente: " + cuentaCorriente.getSaldo());
                    cuentaCorriente.retirar(90.0);


                    break;
                case 3:
                    CuentaDeAhorro cuentaDeAhorro = new CuentaDeAhorro(5678, 1000.00,10);
                    System.out.println("Saldo cuenta de ahorro: " + cuentaDeAhorro.getSaldo());
                    double interes = cuentaDeAhorro.calcularInteres();
                    System.out.println("Interés generado: " + interes);
                    System.out.println("Saldo cuenta de ahorro después de calcular interés: " + cuentaDeAhorro.getSaldo());
                    break;


                default:
                    System.out.println("Opción inválida. Por favor, ingrese un número del 1 al 5.");
            }
        } while (opcion != 4);
    }
}