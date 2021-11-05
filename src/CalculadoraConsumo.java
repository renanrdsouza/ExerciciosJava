import java.util.Scanner;

public class CalculadoraConsumo {
    public static void main(String[] args) {
        int quilometros;
        int litros;
        int contador = 1;
        Scanner input = new Scanner(System.in);

        while (contador >= 0) {
            System.out.print("Informe quantos quilômetros foram percorridos(-1 para encerrar): ");
            contador = input.nextInt();
            if (contador < 0) {
                break;
            }
            quilometros = contador;
            System.out.print("Informe quantos litros foram gastos: ");
            litros = input.nextInt();

            int consumo = quilometros / litros;
            System.out.printf("%s%d%s", "Você fez ", consumo, "km/L.");
            System.out.println();
        }
    }
}
