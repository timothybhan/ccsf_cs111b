package week3_circle_class;

public class CircleTester {

	public static void main(String[] args) {
		
//		First Circle
		Circle testCircle = new Circle();
		double X = 1.0;
		double Y = 1.0;
		double Radius = 1.0;
		double Area = Math.PI * Radius * Radius;
		testCircle.setX(X);
		testCircle.setY(Y);
		testCircle.setRadius(Radius);
		
//		Second Circle
		Circle testSecondCircle = new Circle();
		double secondX = -5.0;
		double secondY = 25.0;
		double secondRadius = 5.0;
		testSecondCircle.setX(secondX);
		testSecondCircle.setY(secondY);
		testSecondCircle.setRadius(secondRadius);
		
//		Third Circle
		Circle testThirdCircle = new Circle();
		double thirdX = 1.0;
		double thirdY = -10.0;
		double thirdRadius = 10.0;
		testThirdCircle.setX(thirdX);
		testThirdCircle.setY(thirdY);
		testThirdCircle.setRadius(thirdRadius);
		
		boolean shouldCirclesOverlap = false;
		
		System.out.println("Testing started");

		assert (testCircle.getX() == X) : "Assertion testCircle.getX() == X failed";
	    assert (testCircle.getY() == Y) : "Assertion testCircle.getY() == Y failed";
	    assert (testCircle.getRadius() == Radius) : "Assertion testCircle.getRadius() == Radius failed";
	    assert (testCircle.getArea() == Area) : "Assertion testCircle.getArea() == Area failed";
	    assert (testCircle.doesOverlap(testSecondCircle) == shouldCirclesOverlap) : "testCircle.doesOverlap(testSecondCircle) == shouldCirclesOverlap failed";

	    System.out.println("Testing completed");
	    
	    System.out.println("Circle 1 Area: " + testCircle.getArea());
	    System.out.println("Circle 2 Area: " + testSecondCircle.getArea());
	    System.out.println("Circle 3 Area: " + testThirdCircle.getArea());
	    
	    System.out.println("Circle 1 overlaps with Circle 2?: " + testCircle.doesOverlap(testSecondCircle));
	    System.out.println("Circle 1 overlaps with Circle 3?: " + testCircle.doesOverlap(testThirdCircle));
	    System.out.println("Circle 2 overlaps with Circle 3?: " + testSecondCircle.doesOverlap(testThirdCircle));
	    
//	    Test distance calculation against https://www.calculatorsoup.com/calculators/geometry-plane/distance-two-points.php 
//	    System.out.println("Circle 1 center distance from Circle 2 center?: " + testCircle.distanceBetweenCenters(testSecondCircle));
//	    System.out.println("Circle 1 center distance from Circle 3 center?: " + testCircle.distanceBetweenCenters(testThirdCircle));
//	    System.out.println("Circle 2 center distance from Circle 3 center?: " + testSecondCircle.distanceBetweenCenters(testThirdCircle));
	    

	}

}
