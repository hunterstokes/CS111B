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

        // Display dealer cards:
        System.out.println("> The dealer's cards are " + dealersCard1 + " and a facedown card!");
        
        // Display the cards to the User
        System.out.println("> Your cards are " + usersCard1 + " and " + usersCard2);
        System.out.println("> Your total is " + usersTotal);

        // Prompt the user to hit or stay
        System.out.println("> Would you like to hit or stay? Type: (h/s) and press enter.");
        String usersChoice = scnr.next();
        
        // User game logic
        while ((usersChoice.equals("h")) || (usersChoice.equals("H")) || (usersChoice.equals("hit")) || (usersChoice.equals("Hit"))) {
            int usersCard3 = rand.nextInt(10) + 1;
            usersTotal = usersTotal + usersCard3;
            if (usersTotal <= 21){
                System.out.println("> Your new total is " + usersTotal + ". (h/s)");
            } else {
                System.out.println("> " + usersTotal + ", You busted!");
                break;
            }
            usersChoice = scnr.next();
        }

        // Dealer game logic
        while ((dealersTotal < 17) && (usersTotal <= 21)) {
            System.out.print("> Dealers total is " + dealersTotal + ".");
            int dealersCard3 = rand.nextInt(10) + 1;
            dealersTotal = dealersTotal + dealersCard3;
            System.out.println(" The dealer has less than 17, they must hit!");
            System.out.println("> The dealer's new card is " + dealersCard3);
            if (dealersTotal <= 21){
                System.out.println("> The dealer's new total is " + dealersTotal);
            } else {
                System.out.println(dealersTotal + ", Dealer busted!");
                break;
            }
        }

        // Dealer vs User score
        if ((dealersTotal > usersTotal) && (dealersTotal <= 21)) {
            System.out.println("> You Had: " + usersTotal + ".");
            System.out.println("> Dealer had: " + dealersTotal + ", Dealer wins!");
        } else if ((dealersTotal < usersTotal) && (usersTotal > 21)) {
            System.out.println("> Dealer wins!");
        } else if ((dealersTotal > usersTotal) && (dealersTotal > 21)){
            System.out.println("> You Had: " + usersTotal + ".");
            System.out.println("> Dealer had: " + dealersTotal + ", You win!");
        } else if ((dealersTotal < usersTotal) && (usersTotal <= 21)) {
            System.out.println("> You Had: " + usersTotal + ".");
            System.out.println("> Dealer had: " + dealersTotal + ", You win!");
        } else {
            System.out.print("> User had: " + usersTotal + ", Dealer had: " + dealersTotal + ".");
            System.out.println(" Push! (tie)");
        }
    }
}


/* SAMPLE OUTPUT */

/*
Welcome to Blackjack!
> Your cards are 1 and 5
> Your total is 6
> The dealer's cards are 10 and a facedown card!
> Would you like to hit or stay? Type: (h/s) and press enter.
h
> Your new total is 10. (h/s)
h
> Your new total is 19. (h/s)
s
> Dealers total is 12. The dealer has less than 17, they must hit!
> The dealer's new card is 6
> The dealer's new total is 18
> You Had: 19.
> Dealer had: 18, You win! 
-------------------------------
Welcome to Blackjack!
> Your cards are 3 and 4
> Your total is 7
> The dealer's cards are 10 and a facedown card!
> Would you like to hit or stay? Type: (h/s) and press enter.
H
> Your new total is 14. (h/s)
H 
> Your new total is 17. (h/s)
h
> 25, You busted!
> Dealer wins!
-------------------------------
Welcome to Blackjack!
> Your cards are 8 and 5
> Your total is 13
> The dealer's cards are 10 and a facedown card!
> Would you like to hit or stay? Type: (h/s) and press enter.
h
> Your new total is 17. (h/s)
h
> Your new total is 21. (h/s)
s
> You Had: 21.
> Dealer had: 20, You win!
-------------------------------
Welcome to Blackjack!
> The dealer's cards are 10 and a facedown card!
> Your cards are 7 and 9
> Your total is 16
> Would you like to hit or stay? Type: (h/s) and press enter.
h
> Your new total is 17. (h/s)
s
> Dealers total is 16. The dealer has less than 17, they must hit!
> The dealer's new card is 8
24, Dealer busted!
> You Had: 17.
> Dealer had: 24, You win!
*/
