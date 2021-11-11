import java.util.Scanner;

public class BinarioParaDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int binario;
        int decimal = 0;
        int multiplicador = 1;

        System.out.println("Digite um número binário: ");
        binario = input.nextInt();

        while (binario > 0) {
            decimal += (binario % 10) * multiplicador;
            binario = binario / 10;

            multiplicador *= 2;
        }

        System.out.println(decimal);
    }
}
