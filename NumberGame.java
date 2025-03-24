import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int score = 0;
        boolean again = true;
        
        System.out.println("Welcome to the NUMBER GAME");

        while (again) {
            int num = r.nextInt(100) + 1;
            int numberOfAttempts = 0;
            int maxAttempts = 7;
            boolean guessedCorrectly = false;

            System.out.println("A number has been generated between 1 and 100. Can you guess it?");
            System.out.println("You have " + maxAttempts + " attempts.");

            while (numberOfAttempts < maxAttempts && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                numberOfAttempts++;

                if (guess == num) {
                    guessedCorrectly = true;
                    score += (maxAttempts - numberOfAttempts + 1); // Higher score is given for fewer attempts
                    System.out.println("Congratulations! You Win");
                    System.out.println("Number guessed in " + numberOfAttempts + " attempts.");
                } else if (guess > num) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Too low! Try again.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry! You lose.");
                System.out.println("The number was: " + num);
            }

            System.out.println("Your Score: " + score);
            System.out.print("Play Again? (Yes/No): ");
            String response = sc.next().trim().toLowerCase();

            if (!response.equals("yes")) {
                again = false;
            }
        }

        System.out.println("Final score is: " + score);
        sc.close();
    }
}
