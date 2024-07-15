import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num = 0; num < 10; num++) {
            System.out.print("Enter number " + (num + 1) + ": ");
            int number = scanner.nextInt();

            if (number < min) {
                min = number;
            } else if (number > max) {
                max = number;
            }
        }

        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
    }
}
