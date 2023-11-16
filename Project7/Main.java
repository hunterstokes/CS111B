package Project7;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
        NumberGuesser guesser = new NumberGuesser(1, 100);
        guesser.playOneGame();
        guesser.playAgain();
   } 
}
