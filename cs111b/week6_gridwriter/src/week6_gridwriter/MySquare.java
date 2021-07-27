package week6_gridwriter;

public class MySquare extends GridItem {
	private int side;
	
	public MySquare(int xValue, int yValue, int s) {
		x = xValue;
		y = yValue;
		side = s;
	}

	public double getArea() {
		return side * side;
	}
	
	public boolean containsPoint(int xValue, int yValue) {
//		System.out.println("square");
		return	xValue >= x &&
				xValue <= x + side &&
				yValue >= y &&
				yValue <= y + side;
	}

}
