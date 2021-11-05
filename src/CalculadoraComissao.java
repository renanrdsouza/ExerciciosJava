import java.util.Scanner;

public class CalculadoraComissao {
    public static void main(String[] args) {
        double total = 0;
        int contador = 1;
        double salario;
        Scanner input = new Scanner(System.in);

        while (contador <= 4) {
            if (contador == 1) {
                System.out.print("Quantidade de itens 1 vendidos: ");
                total += input.nextDouble() * 239.99;
            }
            if (contador == 2) {
                System.out.print("Quantidade de itens 2 vendidos: ");
                total += input.nextDouble() * 129.75;
            }
            if (contador == 3) {
                System.out.print("Quantidade de itens 3 vendidos: ");
                total += input.nextDouble() * 99.95;
            }
            if (contador == 4) {
                System.out.print("Quantidade de itens 5 vendidos: ");
                total += input.nextDouble() * 350.89;
            }
            contador++;
        }

        salario = total + (total * 0.09) + 200.0;

        System.out.printf("%s%.2f", "Salário: R$", salario);
    }
}
