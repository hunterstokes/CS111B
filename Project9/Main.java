package Project9;

import java.util.Scanner;

public class Main {
    public static void playOneGame() {
        System.out.println("Think of a number between 1 and 100 inclusive.");
        System.out.println("And I will guess what it is");
        System.out.println("After each guess, enter");
        System.out.println("h if your number is higher than my guess,");
        System.out.println("l if your number is lower than my guess,");
        System.out.println("any other key if the guess is correct.");
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
            shouldPlayAgain();
        }
    }
}
