import java.util.Scanner;

public class CalculadoraSalario {
    public static void main(String[] args) {
        int contador = 1;
        Scanner input = new Scanner(System.in);

        while (contador <= 3) {
            int horas;
            double salarioHora;
            double salario = 0;

            System.out.print("Informe a quantidade de horas: ");
            horas = input.nextInt();
            System.out.print("Informe o salário por hora do funcionário: ");
            salarioHora = input.nextDouble();

            if (horas > 40) {
                salario += (horas - 40) * (salarioHora / 2);
                horas = 40;
            }
            if (horas <= 40) {
                salario += (salarioHora * horas);
            }

            System.out.printf("%s%.2f%n", "Salário: R$", salario);
            contador++;
        }

    }
}
