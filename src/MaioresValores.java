import java.util.Scanner;

public class MaioresValores {
    public static void main(String[] args) {
        double number;
        int counter = 1;
        double largest = Integer.MIN_VALUE;
        double secondLargest = Integer.MIN_VALUE;
        Scanner input = new Scanner(System.in);

        while (counter <= 10) {
            System.out.print("Insert the " + counter + "º value: ");
            number = input.nextDouble();

            if (number > largest) {
                largest = number;
            }

            if (number < largest && number > secondLargest) {
                secondLargest = number;
            }

            counter++;
        }

        System.out.printf("%s%.2f%s%.2f", "The largest number is ", largest,
                " and the second largest is ", secondLargest);
    }
}
