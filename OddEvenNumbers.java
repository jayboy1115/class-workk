import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sumOdd = 0;
        int sumEven = 0;

        for(int counter = 1; counter <= 10; counter++) {
            System.out.println("Enter a score: ");
            int scores = input.nextInt();

            if (counter % 2 == 1) {
                sumOdd = sumOdd + scores;
            } else {
                sumEven = sumEven + scores;
            }
        }

        System.out.printf("The sum of the odd scores is %d\n", sumOdd);
        System.out.printf("The sum of the even scores is %d\n", sumEven);
    }
}