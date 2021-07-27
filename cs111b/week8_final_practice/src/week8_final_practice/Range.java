package week8_final_practice;

public class Range {
	protected int lowerBound;
	protected int upperBound;
	public Range() {
		lowerBound = 0;
		upperBound = 0;
	}
	public Range(int low, int high) {
		lowerBound = low;
		upperBound = high;
	}
	
	public int getLowerBound() {
		return lowerBound;
	}
	
	public int getUpperBound() {
		return upperBound;
	}
	
	public boolean contains(Range r) {
		return lowerBound<=r.getLowerBound() && upperBound>=r.getUpperBound();
	}
	
	public boolean equals(Range r) {
		return lowerBound==r.getLowerBound() && upperBound==r.getUpperBound();
	}
	
	public static void main(String[] args) {
		Range range1 = new Range(1,2);
		Range range2 = new Range(1,2);
		System.out.println(range1.contains(range2));
		System.out.println(range1.equals(range2));
	}
	
}
