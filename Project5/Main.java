package Project5;
import java.util.Scanner;

class Main {
    private static Scanner scnr = new Scanner(System.in); // Single Scanner for entire class

    // getMidpoint() function:
    private static int getMidpoint(int low, int high) {
        return (low + high) / 2;
    }

    // getUserResponseToGuess() function:
    private static char getUserResponseToGuess(int guess) {
        System.out.println("My guess is " + guess + ". Am I correct? (h/l/c)");
        char userResponse;
        do {
            userResponse = scnr.next().charAt(0);
            if (userResponse != 'h' && userResponse != 'l' && userResponse != 'c') {
                System.out.println("Invalid input. Please enter 'h', 'l', or 'c'.");
            }
        } while (userResponse != 'h' && userResponse != 'l' && userResponse != 'c');
        return userResponse;
    }

    // playOneGame() function:
    private static void playOneGame() {
        int low = 1;
        int high = 100;
        int guess;
        char userResponse;

        do {
            guess = getMidpoint(low, high);
            userResponse = getUserResponseToGuess(guess);
            if (userResponse == 'h') {
                low = guess + 1;
            } else if (userResponse == 'l') {
                high = guess - 1;
            }
        } while (userResponse != 'c');

        System.out.println("I guessed it! Your number is " + guess + ".");
    }

    // shouldPlayAgain() function:
    private static boolean shouldPlayAgain() {
        System.out.println("Great! Do you want to play again? (y/n)");
        char userResponse = scnr.next().charAt(0);
        return userResponse == 'y';
    }

    public static void main(String[] args) {
        boolean playAgain = true;
        while (playAgain) {
            playOneGame();
            playAgain = shouldPlayAgain();

        }
    }
}
