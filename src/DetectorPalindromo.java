import java.util.Locale;
import java.util.Scanner;

public class DetectorPalindromo {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        int numero;
        int novoNumero;
        int dezenaDeMilhar;
        int milhar;
        int centena;
        int dezena;
        int unidade;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o número com 5 dígitos: ");
        numero = input.nextInt();

        dezenaDeMilhar = numero / 10000;
        milhar = (numero % 10000) / 1000;
        centena = ((numero % 10000) % 1000) / 100;
        dezena = (((numero % 10000) % 1000) % 100) / 10;
        unidade = (((numero % 10000) % 1000) % 100) % 10;

        novoNumero = (unidade * 10000) + (dezena * 1000) + (centena * 100) + (milhar * 10) + dezenaDeMilhar;

        if (numero == novoNumero) {
            System.out.println("É palíndromo.");
        } else {
            System.out.println("Não é palíndromo.");
        }

    }
}
