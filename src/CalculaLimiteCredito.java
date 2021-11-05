import java.util.Scanner;

public class CalculaLimiteCredito {
    public static void main(String[] args) {
        int saldoInicioDoMes;
        int totalCobrado;
        int totalDeCredito;
        int limiteDeCredito;
        Scanner input = new Scanner(System.in);

        System.out.print("Saldo: R$");
        saldoInicioDoMes = input.nextInt();
        System.out.print("Total de gastos: R$");
        totalCobrado = input.nextInt();
        if (totalCobrado > saldoInicioDoMes) {
            totalDeCredito = totalCobrado - saldoInicioDoMes;
        } else {
            totalDeCredito = 0;
        }
        System.out.print("Limite de crédito: R$");
        limiteDeCredito = input.nextInt();

        if (totalDeCredito >= limiteDeCredito) {
            System.out.println("Excedeu o limite de crédito.");
        } else {
            System.out.println("Não excedeu o limite de crédito.");
        }
    }
}
