package week7_battleship;

import java.util.Random;

public class Board {
	
	static final int ROWS = 10;
	static final int COLS = 10; 
	
	static final int SHIPNUM = 5;
	private int userPointsSize;	

	
	boolean isValidShip;
	
	private Ship ships[];
	
	private Point userPoints[];
	private static final int INITIAL_CAPACITY = 10;
	
	/****
	 * This is a private helper method that doubles the array capacity of the userPoints writer
	 * This allows it to accomodate a dynamic number of Points
	 **/
	private void doublePointsCapacity() {

		// allocate a new array with double capacity
		Point temp[] = new Point[userPoints.length * 2];
		
		// Copy by hand, so to speak
		for (int i = 0; i < userPoints.length; i++) {
			temp[i] = userPoints[i];
		}
		
		// point the items array at the temp array. 
		// The old array will be garbage collected
		userPoints = temp;
	}
	
	public void add(Point p) {
		
		// If the item array is full, we double its capacity
		if (userPointsSize == userPoints.length) {
			doublePointsCapacity();
		}
		
		// Store the Point in the userPointsSize array
		userPoints[userPointsSize] = p;
		
		// Increment size. Size counts the number of items 
		// currently stored in the userPoints. 
		userPointsSize++;
	}
	
	public Ship randShipGen() {
		Random randGen = new Random();
		boolean shipVertical = true;
		if (randGen.nextInt(2)==0) {
			shipVertical = false;
		}
		
		int shipLength = randGen.nextInt(5)+1;
		
//		System.out.print(shipLength);
		int randX = randGen.nextInt(COLS - shipLength);
		int randY = randGen.nextInt(ROWS);
		if (shipVertical) {
			randX = randGen.nextInt(COLS);
			
			randY = randGen.nextInt(ROWS - shipLength);
		}
		
		Point shipOrigin = new Point(randX,randY);
		
		Ship randShip = new Ship(shipOrigin,shipVertical,shipLength);
		
		return randShip;
	}
	
	public Board() {
		this.ships = new Ship[SHIPNUM];
		this.userPointsSize = 0;
		this.userPoints = new Point[INITIAL_CAPACITY];
		for (int i = 0; i < SHIPNUM; i++) {
			// while ship collides with another change inputs
			isValidShip = false;
			Ship randShip = null;
			while (!isValidShip){
				
				isValidShip = true;
				
				randShip = randShipGen();
				
				if (i == 0) {
					ships[i] = randShip;
				}
				else {
					
					for (int a = 0; a < i; a++) {
						if (ships[a].collidesWith(randShip)) {
							isValidShip = false;
						}
					}
				}
			}
			ships[i] = randShip;
		}
	}
	
	public void printShips() {
		for (Ship s : ships) {
			int num = 1;
			System.out.println(num + ": origin=" + s.getOrigin().printStr() + " vertical:" + s.getVertical() + " length:" + s.getLength() );
		}
	}
	
	// need to hold 5 ships, randomly placed
	// make sure ships don't collide with each other
	// ask user for coordinates
	// if user hits, print Hit
	// then display X in coordinate where Hit
	// if the hit sinks ship, print "you sank a ship with length" + length "!"
	// if all ships are sunk then game should end
	// if user misses, print Miss
	// then display "." in coordinate where Miss

	
	public boolean onShip(Point p) {
		for (Ship s : ships) {
			if (s.containsPoint(p)) {
				return true;
			}
		}
		return false;
	}
	
	public Ship onWhichShip(Point p) {
		for (Ship s : ships) {
			if (s.containsPoint(p)) {
				return s;
			}
		}
		return null;
	}
	
	public void hitShips(Point p) {
		for (Ship s : ships) {
			
			s.shotFiredAtPoint(p);
			
		}
	}
	
	public boolean isUserPoint(Point p) {
		if (userPoints == null) {
			return false;
		}
		for (int i = 0; i < userPointsSize; i++) {
			Point up = userPoints[i];
			if (up.isEquals(p)) {
				return true;
			}
		}
		return false;
	}
	
	public int getShipsSunk() {
		int ShipsSunk = 0;
		for (Ship s : ships) {
			if (s.isSunk()) {
				ShipsSunk+=1;
			}
		}
		return ShipsSunk;
	}
	
	public boolean gameWon() {
		if (getShipsSunk() == SHIPNUM) {
			return true;
		}
		return false;
	}
	
	public void display() {
		for (int r = ROWS-1; r >= 0; r--) {
			System.out.print(r);
			for (int c = 0; c < COLS; c++) {
				Point p = new Point(c,r);
//				if UserPoint and on ship then Hit!
				if (isUserPoint(p) && onShip(p)) {
					System.out.print(" X ");
				}
//				if UserPoint and not on ship then Miss!
				else if (isUserPoint(p) && !onShip(p)) {
					System.out.print(" . ");
				}
//				if on Ship then show it. will remove later
//				else if (onShip(p)) {
//					System.out.print(" O ");
//				}
				else {
					System.out.print(" ~ ");
				}
				
			}
			System.out.println();
		}
		System.out.print(" ");
		for (int c = 0; c < COLS; c++) {
			System.out.print(" "+c+" ");
		}
	}
}
