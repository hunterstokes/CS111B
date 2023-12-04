package Project11.GridWriterExpanded;

class Main {
		public static void main(String[] args) {
		GridWriter gw = new GridWriter(40, 50);
		
		gw.add(new Circle(10, 10, 9));
		gw.add(new Circle(25, 20, 12));
		gw.add(new Circle(25, 20, 5));
		
		gw.add(new Rectangle(25, 25, 20, 15));
		gw.add(new Rectangle(5, 5, 3, 4));
		gw.add(new Rectangle(40, 0, 10, 10));
		
		gw.display();
	}
}