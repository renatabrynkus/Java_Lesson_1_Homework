import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numberToGuess = new Random().nextInt(100);

        System.out.println("Please type an integer between 0 and 99.");

        Scanner scan = new Scanner(System.in);
        int remainingAttempts = 5;

        while (remainingAttempts > 0) {
            int integerFromUser = scan.nextInt();

            if (integerFromUser < numberToGuess) {
                System.out.println("Your number is LOWER than the one you are trying to guess.");
                remainingAttempts--;
                printRemainingAttempts(remainingAttempts);
            } else if (integerFromUser > numberToGuess) {
                System.out.println("Your number is GREATER than the one you are trying to guess.");
                remainingAttempts--;
                printRemainingAttempts(remainingAttempts);
            } else {
                System.out.println("You guessed it!");
                scan.close();
                break;
            }

            if (remainingAttempts != 0) {
                System.out.println("Please try again.");
            } else {
                System.out.println("Sorry, you didn't guess the number. The answer was: " + numberToGuess);
            }
        }
        scan.close();
    }

    public static void printRemainingAttempts(int remainingAttempts) {
        System.out.println("Attempts remaining: " + remainingAttempts);
    }
}