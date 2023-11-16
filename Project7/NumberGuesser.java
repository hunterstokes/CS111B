package Project7;

import java.util.Scanner;

class NumberGuesser {
    private int number;
    private int min;
    private int max;

    public NumberGuesser(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void higher() {
        min = number + 1;
    }

    public void lower() {
        max = number - 1;
    }

    public int getCurrentGuess() {
        number = (min + max) / 2;
        return number;
    }

    public void reset() {
        min = 1;
        max = 100;
    }
    public void playOneGame() {
        NumberGuesser guesser = new NumberGuesser(1, 100);
        Scanner input = new Scanner(System.in);
        char response;
        do {
            System.out.println("Guess a number between 1 and 100.");
            System.out.println("Is the number " + guesser.getCurrentGuess() + "?");
            System.out.println("(h/l/c): ");
            response = input.next().charAt(0);
            if (response == 'h') {
                guesser.higher();
            } else if (response == 'l') {
                guesser.lower();
            }
        } while (response != 'c');
        System.out.println("You picked " + guesser.getCurrentGuess() + "? Great pick!");
    }

    void playAgain() {
        Scanner input = new Scanner(System.in);
        char response;
        do {
            System.out.println("Do you want to play again? (y/n): ");
            response = input.next().charAt(0);
            if (response == 'y') {
                playOneGame();
            } else if (response == 'n') {
                System.out.println("Thanks for playing!");
            }
        } while (response != 'n');
    }

}