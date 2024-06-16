import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        boolean playAgain = true;

        while (playAgain) {
            int attempts = 5;
            int numberToGuess = random.nextInt(100) + 1; 
            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I've chosen a number between 1 and 100. You have 5 attempts to guess it.");

            while (attempts > 0) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();

                if (guess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the number in " + (5 - attempts) + " attempts.");
                    score++;
                    break;
                } else if (guess < numberToGuess) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }

                attempts--;
            }

            if (attempts == 0) {
                System.out.println("You ran out of attempts. The number was " + numberToGuess);
            }

            System.out.print("Play again? (y/n): ");
            String playAgainInput = scanner.next();
            playAgain = playAgainInput.equalsIgnoreCase("y");
        }

        System.out.println("Your final score is: " + score);
        scanner.close();
    }
}