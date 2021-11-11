import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        int numero;
        int fatorial = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o número: ");
        numero = input.nextInt();

        while (numero >= 1) {
            fatorial = fatorial * numero;
            numero--;
        }

        System.out.println(fatorial);
    }
}
