package Project1;
import java.util.Scanner;
import java.util.Random;

class Main {
  static public void main(String[] args) {
    

    //prompt user for input
    System.out.println("Enter a number.");
    System.out.print("Number must be 0, 1 or 2: ");


    Scanner scnr = new Scanner(System.in);
    int usersNumber = scnr.nextInt();

    // initialize the program number
    int programsGuess;
    Random rand = new Random();
    programsGuess = rand.nextInt(0, 3);
    
    // check the numbers
    if (usersNumber == programsGuess) {
      System.out.println("It was " + usersNumber + "!?");
      System.out.print("I was right!");
    } else {
      System.out.print("Argh! I was wrong! I guessed " + programsGuess);
    }


  }
}
