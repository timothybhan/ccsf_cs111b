package week3_numberguesserclass;

import java.util.Random;
import java.util.Scanner;

public class GuessingProgram {
	
	/*
	 Test individual game playing --  Regular NumberGuesser
	 */
//	public static Scanner input = new Scanner(System.in);
//	
//	public static char getUserResponseToGuess(int guess) {
//		System.out.print("Is it " + guess + "?  (h/l/c):");
//		return input.next().charAt(0);
//	}
//	
//	public static boolean shouldPlayAgain() {
//		System.out.print("Great! Do you want to play again? (y/n):");
//		return input.next().charAt(0) == 'y';
//	}
//	
//	public static void playOneGame(int lowerStart, int upperStart) {
//		
//		NumberGuesser gameGuesser = new NumberGuesser(lowerStart,upperStart);
//		System.out.println("Guess a number from "+lowerStart +" to "+upperStart+".");
//		
//		char response = getUserResponseToGuess(gameGuesser.getCurrentGuess());
//		while (response != 'c') {
//			if (response=='h') {
//				try {
//					gameGuesser.higher();
//					response = getUserResponseToGuess(gameGuesser.getCurrentGuess());
//				} catch (NumberGuesserIllegalStateException excpt) {
//					System.out.println(excpt.getMessage());
//					response = 'c';
//				}
//			}
//			else {
//				try {
//					gameGuesser.lower();
//					response = getUserResponseToGuess(gameGuesser.getCurrentGuess());
//				} catch (NumberGuesserIllegalStateException excpt) {
//					System.out.println(excpt.getMessage());
//					response = 'c';
//				}
//			}
//		}
//			
//	}
//	
//	public static void main(String[] args) {
//		do {
//
//		playOneGame(1,200);
//
//		} while (shouldPlayAgain());
//		
//
//	}
	
	/*
	 Test individual game playing -- RandomNumberGuesser
	 */
	public static Scanner input = new Scanner(System.in);
	
	public static char getUserResponseToGuess(int guess) {
		System.out.print("Is it " + guess + "?  (h/l/c):");
		return input.next().charAt(0);
	}
	
	public static boolean shouldPlayAgain() {
		System.out.print("Great! Do you want to play again? (y/n):");
		return input.next().charAt(0) == 'y';
	}
	
	public static void playOneGame(int lowerStart, int upperStart) {
		
		RandomNumberGuesser gameGuesser = new RandomNumberGuesser(lowerStart,upperStart);
		System.out.println("Guess a number from "+lowerStart +" to "+upperStart+".");
		
		char response = getUserResponseToGuess(gameGuesser.getCurrentGuess());
		while (response != 'c') {
			if (response=='h') {
				try {
					gameGuesser.higher();
					response = getUserResponseToGuess(gameGuesser.getCurrentGuess());
				} catch (NumberGuesserIllegalStateException excpt) {
					System.out.println(excpt.getMessage());
					response = 'c';
				}
			}
			else {
				try {
					gameGuesser.lower();
					response = getUserResponseToGuess(gameGuesser.getCurrentGuess());
				} catch (NumberGuesserIllegalStateException excpt) {
					System.out.println(excpt.getMessage());
					response = 'c';
				}
			}
		}
			
	}
	
	public static void main(String[] args) {
		do {

		playOneGame(1,200);

		} while (shouldPlayAgain());
		

	}
	
	
	/*
	 Test that getCurrentGuess() of RandomNumberGuesser returns the same number if bounds haven't changed
	 */
//	public static void main(String[] args) {
//		RandomNumberGuesser rng = new RandomNumberGuesser(1,10);
//		System.out.println(rng.getCurrentGuess());
//		System.out.println(rng.getCurrentGuess());
//		System.out.println(rng.getCurrentGuess());
//	}
	
	
	
	
	
	/*
	 Test many simulated games to test the reset() method. Should output ~5.8
	 */
//	public static void main(String[] args) {
//
//
//	    final int GAME_COUNT = 100000;
//
//	    final int MIN = 1;
//
//	    final int MAX = 100;
//
//
//	    Random random = new Random();
//
////	    NumberGuesser guesser = new NumberGuesser(MIN, MAX);
//	    RandomNumberGuesser guesser = new RandomNumberGuesser(MIN, MAX);
//	    
//
//	    int totalGuessCount = 0;
//
//
//	    // Make the guesser look for a random number, GAME_COUNT times
//
//	    for (int i = 0; i < GAME_COUNT; i++) {
//
//
//	        // There is always the initial guess
//
//	        int guessCount = 1;
//
//
//	        // Generate a random value to look for, from MIN to MAX, inclusive.
//
//	        int targetValue = MIN + random.nextInt(MAX - MIN + 1);
////	        System.out.println(targetValue);
//
//
//	        // Keep looping until the guesser gets it right
//
//	        while (targetValue != guesser.getCurrentGuess()) {
//
//
//	            // Adjust the guesser, as needed...
//
//	            if (targetValue > guesser.getCurrentGuess()) {
//
//	                guesser.higher();
//
//	            } else {
//
//	                guesser.lower();
//
//	            }
//
//
//	            // That's one more guess, bump up the count
//
//	            guessCount++;
//
//	        }
//
//
//	        // Keep track of the total number of guesses in all the simulated games
//
//	        totalGuessCount += guessCount;
//
//
//	        // Return the guesser is in its initial state
//
//	        guesser.reset();
//
//	    }
//
//
//	    // Calculate and display the average
//
//	    double averageGuessCount = totalGuessCount / (double) GAME_COUNT;
//
//	    System.out.println("Average number of guesses: " + averageGuessCount);
//
//	}

}
