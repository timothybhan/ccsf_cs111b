package week2_pokerhand;
import java.util.Scanner;
import java.util.Arrays;

public class PokerHand {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter five numeric cards, no face cards. Use 1 - 9 ");
		int[] pokerCards = new int[5];
		for (int i = 0; i < 5; ++i) {
			int cardNum = i + 1;
			System.out.print("Card " + cardNum + ": ");
			int card = input.nextInt();
			System.out.println();
			pokerCards[i] = card;
		}
		Arrays.sort(pokerCards);
		
		boolean isPair = false;
		boolean isStraight = true;
		for (int i = 0; i < pokerCards.length - 1 ; ++i) {
//			System.out.print(pokerCards[i] + " ");
			if (pokerCards[i]==pokerCards[i+1]) {
				isPair = true;
			}
			if (pokerCards[i]!=pokerCards[i+1]-1) {
				isStraight = false;
			}
		}
		if (isPair) {
			System.out.println("Pair!");
		}
		else if (isStraight) {
			System.out.println("Straight!");
		}
		else {
			System.out.println("High Card!");
		}

	}

}
