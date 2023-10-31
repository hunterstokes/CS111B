package Project3;
import java.util.Scanner;
import java.util.Random;

class Main {
    static public void main(String[] args) {
        // This app is designed to play blackjack
        // The goal is to get 2 cards dealt and then hit until you get 21 or bust
        System.out.println("Welcome to Blackjack!");
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();

        // Deal the cards to User
        int usersCard1 = rand.nextInt(10) + 1;
        int usersCard2 = rand.nextInt(10) + 1;
        int usersTotal = usersCard1 + usersCard2;

        // Deal the cards to the Dealer
        int dealersCard1 = 10;
        int dealersCard2 = rand.nextInt(10) + 1;
        int dealersTotal = dealersCard1 + dealersCard2;

        // Display the cards to the User
        System.out.println("Your cards are " + usersCard1 + " and " + usersCard2);
        System.out.println("Your total is " + usersTotal);

        // Display dealer cards:
        System.out.println("The dealer's cards are " + dealersCard1 + " and a facedown card!");

        System.out.println("Would you like to hit or stay? Type: (h/s) and press enter.");
        String usersChoice = scnr.next();
        
        while ((usersChoice.equals("h")) || (usersChoice.equals("H")) || (usersChoice.equals("hit")) || (usersChoice.equals("Hit"))) {
            int usersCard3 = rand.nextInt(10) + 1;
            usersTotal = usersTotal + usersCard3;
            if (usersTotal <= 21){
                System.out.println("Your new total is " + usersTotal);
            } else {
                System.out.println(usersTotal + ", You busted!");
                break;
            }
            usersChoice = scnr.next();
        }

        // Dealer vs User score

        if (dealersTotal > usersTotal) {
            System.out.println("You Had: " + usersTotal + ".");
            System.out.println("Dealer had: " + dealersTotal + ", Dealer wins!");
        } else if ((dealersTotal < usersTotal) && (usersTotal > 21)) {
            System.out.println("Dealer wins!");
        } else if ((dealersTotal < usersTotal) && (usersTotal <= 21)) {
            System.out.println("You Had: " + usersTotal + ".");
            System.out.println("Dealer had: " + dealersTotal + ", You win!");
        } else {
            System.out.println("Push! (tie)");
        }
    }
}
