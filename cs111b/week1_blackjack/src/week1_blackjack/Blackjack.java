
/* 
Timothy Han
*/

package week1_blackjack;
import java.util.Scanner;
import java.util.Random;

public class Blackjack {
	public static void main(String[] args) {
		Random rand = new Random();
		int upperbound = 11;
		int lowerbound = 1;
		char playGame = 'y';
		Scanner input = new Scanner(System.in);
		
		while (playGame == 'y') {
			int card1 = rand.nextInt(upperbound-lowerbound) + lowerbound;
			int card2 = rand.nextInt(upperbound-lowerbound) + lowerbound;
			System.out.println("First cards: " + card1 + ", " + card2);
			
			int runningTotal = card1 + card2;
			System.out.println("Total: " + runningTotal);
			
			System.out.print("Do you want another card? (y/n): ");
			char anotherCard = input.next().charAt(0);
			while (anotherCard=='y') {
				int nextCard = rand.nextInt(upperbound-lowerbound) + lowerbound;;
				System.out.println("Card: " + nextCard);
				runningTotal = runningTotal + nextCard;
				System.out.println("Total: " + runningTotal);
				if (runningTotal > 21) {
					System.out.println("Bust.");
					anotherCard = 'n';
				}
				else {
					System.out.print("Do you want another card? (y/n): ");
					anotherCard = input.next().charAt(0);
				}
			}
			System.out.print("Would you like to play again? (y/n): ");
			playGame = input.next().charAt(0);
		}
	}

}
