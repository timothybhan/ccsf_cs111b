package week3_numberguesserclass;

public class NumberGuesser {
	
	protected int lowerBound;
	protected int upperBound;
	protected int origLowerBound;
	protected int origUpperBound;
	
	public NumberGuesser() {
		lowerBound = 1;
		upperBound = 100;
		origLowerBound = lowerBound;
		origUpperBound = upperBound;
	}
	
	public NumberGuesser(int lowerBound, int upperBound) {
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
		origLowerBound = lowerBound;
		origUpperBound = upperBound;
	}
	
	public int getLowerBound() {
		return lowerBound;
	}
	
	public int getUpperBound() {
		return upperBound;
	}
	

	public int getCurrentGuess() {
		return (int) Math.floor((upperBound + lowerBound)/2);
	}
	
	public void higher() throws NumberGuesserIllegalStateException {
		if(upperBound-lowerBound==0 || getCurrentGuess() == upperBound) {
			throw new NumberGuesserIllegalStateException("There is only 1 number to guess, and it must be " + upperBound );
		}
		
		if(upperBound-lowerBound == 1) {
			lowerBound = upperBound;
		}
		else {
			lowerBound = getCurrentGuess()+1;
		}
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
	}

	public void reset() {
		lowerBound = origLowerBound;
		upperBound = origUpperBound;
	}
	
}
