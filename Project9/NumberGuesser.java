package Project9;

public class NumberGuesser {
    protected int low;
    protected int high;

    public NumberGuesser(int low, int high) {
        this.low = low;
        this.high = high;
    }

    public void higher() {
        low = getCurrentGuess() + 1;
    }

    public void lower() {
        high = getCurrentGuess() - 1;
    }
    
    public int getCurrentGuess() {
        int midpoint = (low + high) / 2;
        return midpoint;
    }

    public void reset() {
        low = 1;
        high = 100;
    }
}
