package SCT_SD_02;

import java.util.Scanner;
import java.util.Random;

    public class NumberGuessingGame {
        public static void main(String[] args) {
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);

            int randomNumber = random.nextInt(100) + 1;
            int guess = 0;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I have chosen a number between 1 and 100. Can you guess it?");

            while (guess != randomNumber) {
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();

                if (guess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > randomNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number.");
                }
            }

            scanner.close();
        }
    }


