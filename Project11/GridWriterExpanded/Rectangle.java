package Project11.GridWriterExpanded;

public class Rectangle extends GridItem {

	private int height;
	private int width;
	
	public Rectangle(int xValue, int yValue, int w, int h) {
		x = xValue;
		y = yValue;
		width = w;
		height = h;
	}

	public double getArea() {
		return height * width;
	}
	
	public boolean containsPoint(int xValue, int yValue) {
		return	xValue >= x &&
				xValue <= x + width &&
				yValue >= y &&
				yValue <= y + height;
	}
}
