import java.util.Scanner;

public class LadosDoTriangulo {
    public static void main(String[] args) {
        int lado1;
        int lado2;
        int lado3;

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o lado 1: ");
        lado1 = input.nextInt();
        System.out.print("Informe o lado 2: ");
        lado2 = input.nextInt();
        System.out.print("Informe o lado 3: ");
        lado3 = input.nextInt();

        if ((lado1 + lado2) > lado3 || (lado1 + lado3 > lado2) || (lado2 + lado3 > 1)) {
            System.out.println("Esses valores formam um triângulo!");
        } else {
            System.out.println("Esses valores não formam um triângulo!");
        }
    }
}
