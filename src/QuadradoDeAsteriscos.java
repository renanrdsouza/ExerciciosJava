import java.util.Scanner;

public class QuadradoDeAsteriscos {
    public static void main(String[] args) {
        int counter = 1;
        int lado;
        int linha;
        int asteriscos;
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o valor do lado do quadrado: ");
        lado = input.nextInt();
        linha = lado;

        while (linha >= 1) {
            asteriscos = lado;
            while (asteriscos >= 1) {
                System.out.print("* ");
                asteriscos--;
            }
            System.out.println();
            linha--;
        }
    }
}
