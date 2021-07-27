
/* 
Timothy Han
*/

package week2_numberguesser;

import java.util.Scanner;

public class NumberGuesser {
	
	public static Scanner input = new Scanner(System.in);
	
	public static int getMidpoint(int low, int high) {
		return (int) Math.floor((high+low)/2);
	}
	
	public static char getUserResponseToGuess(int guess) {
		System.out.print("Is it " + guess + "?  (h/l/c):");
		return input.next().charAt(0);
	}
	
	public static boolean shouldPlayAgain() {
		System.out.print("Great! Do you want to play again? (y/n):");
		return input.next().charAt(0) == 'y';
	}
	
	
	
	public static void playOneGame() {
		System.out.println("Guess a number from 1 to 100.");
		int low = 1;
		int high = 100;
		int mid = getMidpoint(low,high);
		char response = getUserResponseToGuess(mid);
		while (response != 'c') {
			if (response=='h') {
				low = mid+1;
			}
			else {
				high = mid-1;
			}
			mid = getMidpoint(low,high);
			response = getUserResponseToGuess(mid);
		}
			
	}
	
	
	
	public static void main(String[] args) {
		do {

		playOneGame();

		} while (shouldPlayAgain());
		

	}
}
