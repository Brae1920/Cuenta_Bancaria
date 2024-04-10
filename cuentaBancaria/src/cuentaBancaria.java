import java.util.Scanner;

public class cuentaBancaria {
    public static void main(String[] args) {
        /* incluir datos del cliente
            Nombre del cliente
            Tipo de cuenta
            Saldo disponible */
        String nombre = "Braulio Elizondo";
        String tipoDeCuenta = "Ahorros";
        double saldoDisponible = 10000.00;
        int opccion = 0;
        System.out.println("\n***Bienvenido al Banco De Costa Rica***");
        String datosCliente = ("""
                \n******************************\n
                Nombre de cliente: %s
                Tipo de cuenta : %s
                Saldo disponible : $ %.2f
                \n******************************
                """).formatted(nombre, tipoDeCuenta, saldoDisponible);
        System.out.println(datosCliente);

        // Menu de opciones
        String menuDeOpciones = ("""
                Menú
                1 = consultar saldos
                2 = Retirar
                3 = Depositar
                9 = Salir
                """);
        Scanner scanner = new Scanner(System.in);
        while (opccion != 9) {
            System.out.println(menuDeOpciones);
            opccion = scanner.nextInt();

            switch (opccion) {
                case 1:
                    System.out.printf("El saldo disponible es de: $ %.2f\n", saldoDisponible);
                    break;

                case 2:
                    System.out.println("Digite el monto que desea retirar");
                    double montoARetirar = scanner.nextDouble();
                    if (montoARetirar > saldoDisponible) {
                        System.out.println("Monto insuficiente");
                    } else {
                        saldoDisponible -= montoARetirar;
                        System.out.printf("Su saldo actual es de: $ %.2f\n", saldoDisponible);
                    }
                    break;

                case 3:
                    System.out.println("Digite el monto a depositar");
                    double montoADepositar = scanner.nextDouble();
                    saldoDisponible += montoADepositar;
                    System.out.printf("Su saldo actual es de: $ %.2f\n", saldoDisponible);
                    break;

                case 9:
                    System.out.println("""
                            Gracias por utilizar nuestra red de cajeros automáticos.
                            *****Fue un gusto servirle****
                            """);
                    break;

                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}
