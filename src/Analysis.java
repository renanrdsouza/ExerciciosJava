import java.util.Scanner;

public class Analysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        while (studentCounter <= 10) {
            int result;
            System.out.print("Enter result (1=pass, 2=fail): ");
            result = input.nextInt();

            while (true) {
                if (result != 1 && result != 2) {
                    System.out.print("Enter a valid number (1=pass, 2=fail): ");
                    result = input.nextInt();
                } else {
                    break;
                }
            }

            if (result == 1) {
                passes++;
            } else {
                failures++;
            }

            studentCounter++;
        }

        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

        if (passes >= 8) {
            System.out.println("Bonus to instructor!");
        }
    }
}
