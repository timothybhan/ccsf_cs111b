package week4_improved_circle_class;

public class Circle {
	private Point center;
	private double radius;
	
	public Circle(Point o, double r) {
		Point deepCopyPoint = new Point(o);
		center = deepCopyPoint;
		radius = r;
	}

	public Circle(double xValue, double yValue, double r) {
		center = new Point(xValue, yValue);
		radius = r;
	}

	public Circle() {
		center = new Point(0.0,0.0);
		radius = 1;
		
	}

	public Circle(Circle c){
		this(c.center, c.radius);
	}
	
	public Point getCenter() {
		return center;
	}

	void setCenter(Point p) {
		Point deepCopyPoint = new Point(p);
		this.center = deepCopyPoint;
	}
	
	public double getX() {
		return center.getX();
	}

	public void setX(double x) {
		center.setX(x);
	}
	
	public double getY() {
		return center.getY();
	}

	public void setY(double y) {
		center.setY(y);
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
	
	public String toString() {
		return "Circle x: " + center.getX() + ", y: " + center.getY() + ", radius: " + radius;
	}

	public boolean equals(Circle c) {
		double xDiff = Math.abs( center.getX() - c.center.getX() );
		double yDiff = Math.abs( center.getY() - c.center.getY() );
		double radiusDiff = Math.abs( radius - c.getRadius() );
		return xDiff + yDiff + radiusDiff < 0.00001;
	}

	public boolean doesOverlap(Circle c) {
		double combinedRadius = radius + c.getRadius();
		double distanceBetweenCenters = center.distanceTo(c.getCenter());
		if ( combinedRadius >= distanceBetweenCenters ){
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String args[]){
		/*
		 Testing Constructors and To String method
		 */
//		Circle testCircle = new Circle();
//		Circle testCircle = new Circle(13.0,16.0,4.0);
//		Circle testCircleStage = new Circle(13.0,16.0,4.0);
//		Circle testCircle = new Circle(testCircleStage);
//		System.out.print(testCircle.toString());
		
		/*
		 Testing setting and getting center
		 */
//		Circle testCircle = new Circle();
//		Point testPoint = new Point(-4.0,59.0);
//		testCircle.setCenter(testPoint);
//		Point newCenter = new Point(testCircle.getCenter());
//		System.out.print("x:" + newCenter.getX() + " y:"+ newCenter.getY());
		/*
		 Testing equals method
		 */
//		Circle testCircleOne = new Circle();
//		Circle testCircleTwo = new Circle(); // same circle
//		Circle testCircleTwo = new Circle(0.0,0.0,1.005); //try different circle
//		System.out.print(testCircleOne.equals(testCircleTwo));
		/*
		 Testing doesOverlap method
		 Test against https://www.calculatorsoup.com/calculators/geometry-plane/distance-two-points.php
		 if distance <= sum of radiuses then should return true else false
		 */
		Circle testCircleOne = new Circle(-1.0,-30.0,10.0);
		Circle testCircleTwo = new Circle(-15.0,40.0,61.39);
		System.out.print(testCircleOne.doesOverlap(testCircleTwo));
		
	}
}
