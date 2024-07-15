import java.util.Scanner;

public class EvenScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int scores;
        int counter;
        String evenScores = "";

        System.out.println("Enter 10 scores: ");
        for (counter = 1; counter <= 10; counter++) {
            scores = input.nextInt();

            if (scores % 2 == 0) {
                evenScores += scores + " ";
            }
        }

        System.out.println("Even scores entered: " + evenScores);
     }
}