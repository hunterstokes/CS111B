package Project13.NumberGuesserExpanded;

import java.util.ArrayList;

public class NumberGuesser {
    protected int low;
    protected int high;
    private ArrayList<Integer> guessHistory;

    public NumberGuesser(int low, int high) {
        this.low = low;
        this.high = high;
        this.guessHistory = new ArrayList<>();
    }

    public ArrayList<Integer> getGuessHistory() {
        return new ArrayList<Integer>(this.guessHistory);
    }

    protected void addGuess(int guess) {
        this.guessHistory.add(guess);
    }

    public void higher() {
        int midpoint = getCurrentGuess();
        try {
            if (high == midpoint || low == midpoint) {
                throw new NumberGuesserIllegalStateException("No cheating. The number " + high + " must be correct! Please enter a valid input. (c)");
            } else {
                low = midpoint + 1;
                guessHistory.add(midpoint);
            }
        } catch (NumberGuesserIllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }

    public void lower() {
        int midpoint = getCurrentGuess();
        try {
            if (low == midpoint || high == midpoint) {
                throw new NumberGuesserIllegalStateException("No cheating. The number " + low + " must be correct! Please enter a valid input. (c)");
            } else {
                high = midpoint - 1;
                guessHistory.add(midpoint);
            }
        } catch (NumberGuesserIllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }

    public int getCurrentGuess() {
        int midpoint = (low + high) / 2;
        return midpoint;
    }

    public void reset() {
        low = 1;
        high = 100;
        guessHistory.clear();
    }
}
