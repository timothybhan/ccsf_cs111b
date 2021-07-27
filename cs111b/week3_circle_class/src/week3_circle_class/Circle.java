package week3_circle_class;

public class Circle {

	private double radius;
	private double x;
	private double y;
	
	public void setX(double value) {
		x = value;
	}
	
	public double getX() {
		return x;
	}
	
	public void setY(double value) {
		y = value;
	}
	
	public double getY() {
		return y;
	}
	
	public void setRadius(double value) {
		radius = value;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	public double distanceBetweenCenters(Circle otherCircle) {
		double aSquared = Math.pow(getX()-otherCircle.getX(),2);
		double bSquared = Math.pow(getY()-otherCircle.getY(),2);
		double cSquared = aSquared + bSquared;
		double c = Math.sqrt(cSquared);
		return c;
	}


	public boolean doesOverlap(Circle otherCircle) {
		double combinedRadius = getRadius() + otherCircle.getRadius();
		double distanceBetweenCenters = distanceBetweenCenters(otherCircle);
		if ( combinedRadius >= distanceBetweenCenters ){
			return true;
		}
		else {
			return false;
		}
	}
	

}
