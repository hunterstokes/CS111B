package Project13.NumberGuesserExpanded;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static char getUserResponseToGuess(int guess) {
        System.out.println("Is it " + guess + "? (h/l/c): ");
        Scanner scnr = new Scanner(System.in);
        char response = scnr.next().charAt(0);
        return response;
    }
    public static void playOneGame() {
        System.out.println("Think of a number between 1 and 100 inclusive.");
        System.out.println("And I will guess what it is");
        System.out.println("After each guess, enter");
        System.out.println("h if your number is higher than my guess,");
        System.out.println("l if your number is lower than my guess,");
        System.out.println("any other key if the guess is correct.");
        System.out.println();
        RandomNumberGuesser guesser = new RandomNumberGuesser(1, 100);
        int guess = guesser.getCurrentGuess();
        guesser.addGuess(guess);
        char response = getUserResponseToGuess(guess);
        while (response != 'c') {
            if (response == 'h') {
                guesser.higher();
            } else if (response == 'l') {
                guesser.lower();
            }
            guess = guesser.getCurrentGuess();
            response = getUserResponseToGuess(guess); 
            guesser.addGuess(guess);
        }

        System.out.print("Here are the guesses: ");

        ArrayList<Integer> guesses = guesser.getGuessHistory();
    
        for (Integer g: guesses) {
          System.out.print(g + " ");
        }
    
        System.out.println();

    }
    public static boolean shouldPlayAgain() {
        System.out.println("Great! Do you want to play again? (y/n)");
        Scanner scnr = new Scanner(System.in);
        String playAgain = scnr.next();
        if (playAgain.equals("y")) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        boolean playAgain = true;
        while (playAgain) {
            playOneGame();
            playAgain = shouldPlayAgain();
        }
    }
}
