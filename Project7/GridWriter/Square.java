package Project7.GridWriter;

public class Square extends GridItem {
    
    private int side;

    public Square(int xValue, int yValue, int s) {
        x = xValue;
        y = yValue;
        side = s;
    }

    public double getArea() {
        return Math.pow(side, 2);
    }

    public boolean containsPoint(int xValue, int yValue) {
        return xValue >= x && xValue <= x + side && yValue >= y && yValue <= y + side;
    }
}
