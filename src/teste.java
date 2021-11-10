import javax.swing.*;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        int comprimento;
        double comprimentoEmKm;
        int voltas;
        int reabastecimentos;
        double consumo;
        double combustivelMinimo;

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o comprimento da pista: ");
        comprimento = input.nextInt();
        System.out.print("Informe o número de voltas: ");
        voltas = input.nextInt();
        System.out.print("Informe a quantidade de reabastecimentos desejados: ");
        reabastecimentos = input.nextInt();
        System.out.print("Informe o consumo do carro (em Km/L): ");
        consumo = input.nextDouble();

        comprimentoEmKm = (comprimento * voltas) / 1000;

        combustivelMinimo = (comprimentoEmKm / consumo) / (reabastecimentos+1);

        System.out.printf("%s%.2f%s",
                "A quantidade mínima de combustível antes do primeiro reabastecimento é: " ,
                combustivelMinimo, " litros");
    }
}