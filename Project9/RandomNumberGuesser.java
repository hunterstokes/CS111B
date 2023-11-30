package Project9;

public class RandomNumberGuesser extends NumberGuesser {
    private int midpoint;

    public RandomNumberGuesser(int low, int high) {
        super(low, high);
        this.low = low;
        this.high = high;
    }

    public int getCurrentGuess() {
        midpoint = (int) (Math.random() * (high - low + 1) + low);
        System.out.println("midpoint: " + midpoint);
        return midpoint; 
    }

    public void higher() {
        low = midpoint + 1;
        System.out.println("low: " + low);
    }

    public void lower() {
        high = midpoint - 1;
        System.out.println("high: " + high);
    }
    public void reset() {
        low = 1;
        high = 100;
    }

}