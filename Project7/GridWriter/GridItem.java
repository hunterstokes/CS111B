package Project7.GridWriter;

public abstract class GridItem {
    protected int x;
    protected int y;

    public int getX() {
        return x;
    }

    public void setX(int value) {
        x = value;
    }

    public int getY() {
        return y;
    }

    public void setY(int value) {
        y = value;
    }

    public abstract double getArea();

    public abstract boolean containsPoint(int xValue, int yValue);
}
