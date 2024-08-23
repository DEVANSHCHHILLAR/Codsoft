import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String playAgain = "yes";
        
        while (playAgain.equalsIgnoreCase("yes")) {
            int numberToGuess = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 10;
            int userGuess = 0;
            int score = 0;

            System.out.println("Welcome to the Number Guessing Game!");
            while (userGuess != numberToGuess && attempts < maxAttempts) {
                System.out.print("Enter your guess (1-100): ");
                userGuess = scanner.nextInt();
                attempts++;

                if (userGuess > numberToGuess) {
                    System.out.println("Too high!");
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Correct!");
                    score = maxAttempts - attempts;
                    System.out.println("You scored: " + score + " points!");
                }

                if (attempts == maxAttempts && userGuess != numberToGuess) {
                    System.out.println("You've run out of attempts! The correct number was: " + numberToGuess);
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next();
        }
        
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
