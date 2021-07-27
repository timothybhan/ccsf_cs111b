package week7_battleship;

import java.util.Scanner;

public class BattleshipGame {
	public static void main(String[] args) {
//		Point s1Origin = new Point(2,2);
//		Ship s1 = new Ship(s1Origin,true,2);
////		
//		Point s2Origin = new Point(2,4);
//		Ship s2 = new Ship(s2Origin,false,5);
		
//		test containsPoint
//		Point testPoint = new Point(3,0);
//		System.out.print(s1.containsPoint(testPoint));
		
//		test collidesWith
//		System.out.print(s1.collidesWith(s2));
		
//		test shotFiredAtPoint, isHitAtPoint
//		Point shotPoint =  new Point(1,0);
//		Point shotPoint2 =  new Point(2,0);
//		Point shotPoint3 =  new Point(2,0);
//		Point shotPoint4 =  new Point(4,0);
//		s1.shotFiredAtPoint(shotPoint);
//		s1.shotFiredAtPoint(shotPoint2);
//		s1.shotFiredAtPoint(shotPoint3);
//		s1.shotFiredAtPoint(shotPoint4); 
//		System.out.println(shotPoint2==shotPoint3);
//		System.out.println(shotPoint2.isEquals(shotPoint3));
//		System.out.println(s1.hitCount());
//		System.out.println(s1.isHitAtPoint(shotPoint));
//		System.out.println(s1.isSunk());
		
//		test Board
		Board b = new Board();
		b.printShips();
		while (!b.gameWon()) {
			b.display();
			Scanner input = new Scanner(System.in);
			System.out.println();
			System.out.println("Enter a coordinate: ");
			int x = input.nextInt();
			int y = input.nextInt();
			Point p = new Point(x,y);
			b.add(p);
			if (b.onShip(p)) {
				b.hitShips(p);
				System.out.println("Hit!");
				Ship hitShip = b.onWhichShip(p);
				if (hitShip.isSunk()) {
					System.out.println("you sank a ship with length " + hitShip.getLength() + "!");
					System.out.println(b.getShipsSunk());
				}
			}
			else {
				System.out.println("Miss");
			}
		}
		System.out.println("You won!");
		
	}
}
