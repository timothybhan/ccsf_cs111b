package week4_improved_circle_class;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this(p.x, p.y);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }


    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distanceTo(Point p) {

    	double aSquared = Math.pow(this.x-p.getX(),2);
		double bSquared = Math.pow(this.y-p.getY(),2);
		double cSquared = aSquared + bSquared;
		double c = Math.sqrt(cSquared);
		return c;
    }

    public boolean equals(Point p) {
        return this.distanceTo(p) < 0.00001;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    
}