package week3_numberguesserclass;
import java.util.Random;

public class RandomNumberGuesser extends NumberGuesser {
	private int randNum;
	
	public RandomNumberGuesser() {
		lowerBound = 1;
		upperBound = 100;
		origLowerBound = lowerBound;
		origUpperBound = upperBound;
		randNum = generateRandomNumber();
	}
	
	public RandomNumberGuesser(int lowerBound, int upperBound) {
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
		origLowerBound = lowerBound;
		origUpperBound = upperBound;
		randNum = generateRandomNumber();
	}
	
	public int generateRandomNumber() {
		Random randGen = new Random();
		return randGen.nextInt(upperBound-lowerBound+1) + lowerBound;
	}
	
	@Override
	public int getCurrentGuess() {
		return randNum;
	}


	public void higher() throws NumberGuesserIllegalStateException {
		if(upperBound-lowerBound==0 || getCurrentGuess() == upperBound) {
			throw new NumberGuesserIllegalStateException("There is only 1 number to guess, and it must be " + upperBound );
		}
		
		if(upperBound-lowerBound == 1 || getCurrentGuess() == upperBound) {
			lowerBound = upperBound;
		}
		else {
			lowerBound = getCurrentGuess()+1;
		}
		
		randNum = generateRandomNumber();
	}
	
	public void lower() throws NumberGuesserIllegalStateException {
		if(upperBound-lowerBound==0 || getCurrentGuess() == lowerBound) {
			throw new NumberGuesserIllegalStateException("There is only 1 number to guess, and it must be " + lowerBound );
		}
		if(getCurrentGuess() == lowerBound) {
			upperBound = lowerBound;
		}
		else {
			upperBound = getCurrentGuess()-1;
		}
		randNum = generateRandomNumber();
	}

}
