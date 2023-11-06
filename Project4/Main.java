package Project4;

import java.util.Scanner;

class Main {

    static final int HAND_SIZE = 5;
    static int[] handCards = new int[HAND_SIZE];

    // Check the hand for a pair
    public static boolean containsPair(int[] hand) {
        for (int i = 0; i < hand.length - 1; i++) {
            if (hand[i] == hand[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsTwoPair(int hand[]) {
        for (int i = 0; i < HAND_SIZE - 1; i++) {
            for (int j = i + 1; j < HAND_SIZE; j++) {
                if (hand[i] == hand[j]) {  // Found the first pair
                    for (int k = 0; k < HAND_SIZE - 1; k++) {  // Start the search for the second pair from the beginning
                        if (k == i || k == j) continue;  // Skip over the indices of the first pair
                        for (int l = k + 1; l < HAND_SIZE; l++) {
                            if (l == i || l == j) continue;  // Skip over the indices of the first pair
                            if (hand[k] == hand[l]) {  // Found the second pair
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    // check the hand for 3 of a kind
    public static boolean containsThreeOfAKind(int[] hand) {
        for (int i = 0; i < hand.length - 2; i++) {
            if (hand[i] == hand[i + 1] && hand[i] == hand[i + 2]) {
                return true;
            }
        }
        return false;
    }

    // check the hand for 4 of a kind
    public static boolean containsFourOfAKind(int[] hand) {
        for (int i = 0; i < hand.length - 3; i++) {
            if (hand[i] == hand[i + 1] && hand[i] == hand[i + 2] && hand[i] == hand[i + 3]) {
                return true;
            }
        }
        return false;
    }
    
    // check for straight
    public static boolean containsStraight(int hand[]) {
        for (int i = 0; i < HAND_SIZE - 1; i++) {
            if (handCards[i] + 1 != handCards[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean containsFullHouse(int hand[]) {
        containsPair(hand);
        containsThreeOfAKind(hand);
        if (containsPair(hand) == true && containsThreeOfAKind(hand) == true) {
            return true;
        } return false;
    }

    static public void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Check you poker hands!");
        // Prompt the user for a hand
        System.out.println("Enter five numeric cards, no face cards. Use 2 - 9.");
        for (int i = 0; i < HAND_SIZE; i++) {
            System.out.println("Card " + (i + 1) + ":");
            handCards[i] = scnr.nextInt();
        }
        

        // Sort the hand
        for (int i = 0; i < handCards.length; i++) {
            for (int j = 0; j < handCards.length; j++) {
                if (handCards[i] < handCards[j]) {
                    int temp = handCards[i];
                    handCards[i] = handCards[j];
                    handCards[j] = temp;
                }
            }
        }

        for (int i = 0; i < handCards.length; i++) {
            System.out.print(handCards[i] + " ");
        }
        System.out.println();

        System.out.println("Your best hand is: ");

        if (containsFullHouse(handCards)) {
            System.out.println("Full House!");
        } else if (containsStraight(handCards)){
            System.out.println("Straight!");
        } else if (containsFourOfAKind(handCards)) {
            System.out.println("Four of a Kind!");
        } else if (containsThreeOfAKind(handCards)) {
            System.out.println("Three of a Kind!");
        } else if (containsTwoPair(handCards)) {
            System.out.println("Two Pair!");
        } else if (containsPair(handCards)) {
            System.out.println("Pair!");
        } else {
            System.out.println("High Card!");
        }

        // Check the hand
        
    }
}
