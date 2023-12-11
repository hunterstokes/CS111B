package Project13.NumberGuesserExpanded;

public class RandomNumberGuesser extends NumberGuesser {
    private int midpoint;

    public RandomNumberGuesser(int low, int high) {
        super(low, high);
        this.low = low;
        this.high = high;
    }

    public int getCurrentGuess() {
        midpoint = (int) (Math.random() * (high - low + 1) + low);
        // System.out.println("midpoint: " + midpoint);
        return midpoint; 
    }

    public void higher() {
        try {
            
                if (high == midpoint || low == midpoint) {
                    throw new NumberGuesserIllegalStateException("No cheating. The number" + high + " must be correct! Please enter a valid input. (c)");
                } else {
                    low = midpoint + 1;
                }
            } catch (NumberGuesserIllegalStateException e) {
                System.out.println(e.getMessage());
            }
    }

    public void lower() {
        try {
            if (low == midpoint || high == midpoint) {
                throw new NumberGuesserIllegalStateException("No cheating. The number" + low + " must be correct! Please enter a valid input. (c)"); 
            } else {
                high = midpoint - 1;
            }
        } catch (NumberGuesserIllegalStateException e) {
            System.out.println(e.getMessage());
        }
        // System.out.println("high: " + high);
    }
    public void reset() {
        low = 1;
        high = 100;
    }

}