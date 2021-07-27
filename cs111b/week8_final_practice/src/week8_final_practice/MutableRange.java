package week8_final_practice;

public class MutableRange extends Range {
	
	public MutableRange() {
		lowerBound = 0;
		upperBound = 0;
	}
	
	public MutableRange(int lower, int upper) {
		lowerBound = lower;
		upperBound = upper;
	}
	
	public MutableRange(Range r) {
		lowerBound = r.getLowerBound();
		upperBound = r.getUpperBound();
	}
	
	public void setLowerBound(int lower) {
		lowerBound = lower;
	}
	
	public void setUpperBound(int upper) {
		upperBound = upper;
	}
	
	public int expandToContain(Range r) {
		if (lowerBound > r.getLowerBound()){
			lowerBound = r.getLowerBound();
		}
		if (upperBound < r.getUpperBound()){
			upperBound = r.getUpperBound();
		}
		return upperBound - lowerBound;
	}
}
