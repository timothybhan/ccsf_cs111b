package week6_gridwriter;

public class GridWriterProgram {
	
	public static void main(String[] args) {
		GridWriter gw = new GridWriter(40, 50);
		
		gw.add(new MyCircle(10, 10, 9));
		gw.add(new MyCircle(25, 20, 12));
		gw.add(new MyCircle(25, 20, 5));
		
		gw.add(new MyRectangle(25, 25, 20, 15));
		gw.add(new MyRectangle(5, 5, 3, 4));
		gw.add(new MyRectangle(40, 0, 10, 10));
		
		gw.add(new MySquare(23, 0, 5));
		gw.add(new MySquare(40, 0, 10));
		
		MySquare testSquare = new MySquare(20, 0, 5);
		System.out.println(testSquare.getArea());
		
		
		gw.display();
	}
	
}