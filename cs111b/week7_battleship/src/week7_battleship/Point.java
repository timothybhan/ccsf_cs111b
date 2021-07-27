package week7_battleship;

public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int xVal) {
		x = xVal;
	}
	
	public void setY(int yVal) {
		y = yVal;
	}
	
	public boolean isEquals(Point p) {
		return this.x == p.x && this.y == p.y;
	}
	
	public String printStr() {
		return "x:" + this.x + " y:" + this.y;
	}
}
