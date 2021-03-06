package week8_final_practice;

public class FinalsPractice {
	
//	public static boolean beginsWithZ(String input) {
//		if (input == "" || input == null) {
//			return false;
//		}
//		return input.charAt(0) == 'Z' || input.charAt(0) == 'z';
//	}
	
	public static Range encompassingRange(Range[] rangeArray) {
		int minLowBound = rangeArray[0].getLowerBound();
		int maxUpperBound = rangeArray[0].getUpperBound();
		for (Range r : rangeArray) {
			if (r.getLowerBound() < minLowBound) {
				minLowBound = r.getLowerBound();
			}
			if (r.getUpperBound() > maxUpperBound) {
				maxUpperBound = r.getUpperBound();
			}
		}
		return new Range(minLowBound,maxUpperBound);
	}
	
	public static int sumLargeSmall(int[] intArray) {
		
		if (intArray == null || intArray.length == 0) {

			throw new IllegalArgumentException();

			}

		int minSmall = intArray[0];

		int maxLarge = intArray[0];

		for (int i : intArray) {

			if (i < minSmall){

				minSmall = i;

			}

		if (i > maxLarge){

			maxLarge = i;

		}

		}

		return minSmall + maxLarge;

		}
	
	
	public static int landUnsafeJetPacks(JetPack[] jpArray, JetPack pacer, double highestSafeAltitude){

		int numLanded = 0;

		for (JetPack j : jpArray){

		if (j.isHigherAndFaster(pacer) || j.getAltitude() > highestSafeAltitude){

		j.land();

		numLanded += 1;

		}

		}

		return numLanded;

		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String testStr = null;
//		System.out.println(beginsWithZ(testStr));
		
		// writing the triangle pyramid shape
//		int numStars = 1;
//		int numSpaces;
//		while (numStars <= 9) {
//			//print space, print *, print space
//			numSpaces = (9-numStars)/2;
//			for(int i=0;i<numSpaces;i++) {
//				System.out.print(" ");
//			}
//			for(int i=0;i<numStars;i++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//			numStars+=2;
//		}
//		Range[] rangeArray = new Range[3];
//		rangeArray[0] = new Range(1,4);
//		rangeArray[1] = new Range(2,6);
//		rangeArray[2] = new Range(3,5);
//		Range eRange = encompassingRange(rangeArray);
//		System.out.println(eRange.getLowerBound());
//		System.out.println(eRange.getUpperBound());
		
//		int[] testArray = new int[1];
//		testArray[0] = -5;
//		testArray[1] = 20;
//		testArray[2] = 8;
//		System.out.println(sumLargeSmall(testArray));
		
		Location testLocation = new Location(1,3);
//		SmartBackpack testBackPack = new SmartBackpack(5.0, testLocation);
//		SmartBackpack testBackPack = new SmartBackpack();
//		System.out.println(testBackPack.getSpeed());
//		testBackPack.getLocation().print();
//		testBackPack.lockdown();
//		testLocation = new Location(3,3);
//		System.out.println(testBackPack.getSpeed());
//		SmartBackpack test2BackPack = new SmartBackpack(testBackPack);
//		System.out.println(test2BackPack.getSpeed());
//		test2BackPack.getLocation().print();
		JetPack testJP1 = new JetPack(6.2, testLocation, 10.2);
		JetPack testJP2 = new JetPack(testJP1);
		JetPack testJP3 = new JetPack(16.1, testLocation, 34.1);
		JetPack testJP4 = new JetPack(6.1, testLocation, 10.3);
//		System.out.println(testJP3.isHigherAndFaster(testJP1));
//		testJP1.land();
//		System.out.println(testJP1.getAltitude());
//		System.out.println(testJP1.getSpeed());
		
		JetPack[] jpArray = new JetPack[3];
		jpArray[0]= testJP1;
		jpArray[1]= testJP2;
		jpArray[2]= testJP3;
		System.out.println(landUnsafeJetPacks(jpArray,testJP4,60.0));
	}

}
