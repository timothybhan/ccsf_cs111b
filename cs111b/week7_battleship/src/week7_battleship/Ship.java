package week7_battleship;

public class Ship {
	
	private Point origin;
	private boolean isVertical;
	private int length;
	private Point hitPoints[];
	private int hitCount;
	
	public Ship(Point origin, boolean isVertical, int length) {
		this.origin = origin;
		this.isVertical = isVertical;
		this.length = length;
		this.hitCount = 0;
		this.hitPoints = new Point[length];
	}
	
	public boolean containsPoint(Point p) {
		// if vertical, make sure Xs equal and that Y is in between origin and length Y
		if (isVertical && p.getX() == origin.getX() && p.getY() <= origin.getY() + length-1 && p.getY() >= origin.getY()) {
			return true;
		}
		// if horizontal, make sure Ys equal and that X is in between origin and length X
		else if (!isVertical && p.getY() == origin.getY() && p.getX() <= origin.getX() + length-1 && p.getX() >= origin.getX()) {
			return true;
		}
		return false;
	}
	
	public boolean withinLine (int l1Start, int l1Length, int l2Start, int l2Length) {
		return (l1Start >= l2Start && l1Start <= l2Start + l2Length-1) || (l1Start+l1Length-1 >= l2Start && l1Start+l1Length-1 <= l2Start + l2Length-1);
	}
	
	public boolean collidesWith(Ship s) {
		// if both vertical, check that x are the same AND y overlaps
		// y overlaps if origin is between or origin + length is between
		if (this.isVertical && s.isVertical) {
			boolean xEquals = this.origin.getX() == s.origin.getX();
			boolean yOverlap = withinLine(s.origin.getY(),s.length,this.origin.getY(),this.length);
			return xEquals && yOverlap;
		}
		// if both horizontal, check that y are the same AND x overlaps
		// x overlaps if origin is between or origin + length is between
		else if (!this.isVertical && !s.isVertical) {
			boolean yEquals = this.origin.getY() == s.origin.getY();
			boolean xOverlap = withinLine(s.origin.getX(),s.length,this.origin.getX(),this.length);
			return yEquals && xOverlap;
		}
		else {
			// if other ship is  vertical, check that x and y overlap, but don't use x length
			if (s.isVertical) {
				boolean yOverlap = withinLine(s.origin.getY(),s.length,this.origin.getY(),this.length);
				boolean xOverlap = withinLine(s.origin.getX(),0,this.origin.getX(),this.length);
				return yOverlap && xOverlap;
			}
			// if other ship is  horizontal, check that x and y overlap, but don't use y length
			else {
				boolean yOverlap = withinLine(s.origin.getY(),0,this.origin.getY(),this.length);
				boolean xOverlap = withinLine(s.origin.getX(),s.length,this.origin.getX(),this.length);
				return yOverlap && xOverlap;
			}
		}
	}
	
	public boolean isHitAtPoint(Point p) {
		if (hitCount == 0) {
			return false;
		}
		for (int i = 0; i < hitCount; i++) {
			if (hitPoints[i].isEquals(p)) {
				return true;
			}
		}
		return false;
	}
	
	public void shotFiredAtPoint(Point p) {
		if (containsPoint(p) && !isHitAtPoint(p)) {
			hitPoints[hitCount] = p;
			hitCount += 1;
		}
	}
	
	public int hitCount() {
		return hitCount;
	}
	
	public boolean isSunk() {
		return hitCount == length;
	}
	
	public int getLength() {
		return length;
	}
	
	public Point getOrigin() {
		return origin;
	}
	
	public boolean getVertical() {
		return isVertical;
	}

}
