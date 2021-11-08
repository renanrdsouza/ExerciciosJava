import java.util.Locale;
import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);
        int counter = 1;
        double number;
        double largest = Integer.MIN_VALUE;

        while (counter <= 10) {
            System.out.print("Insert the " + counter + "º number: ");
            number = input.nextDouble();

            if (number > largest) {
                largest = number;
            }

            counter++;
        }

        System.out.printf("%s%.2f", "The largest value is: ", largest);
    }
}
