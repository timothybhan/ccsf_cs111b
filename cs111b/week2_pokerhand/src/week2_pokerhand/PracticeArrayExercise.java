package week2_pokerhand;

public class PracticeArrayExercise {
	
	public static void checkPositiveArray(int[] inputArray) {
		boolean isPositive = true;
		for (int i = 0; i < inputArray.length; ++i) {
			if (inputArray[i] < 0) {
				isPositive = false;
			}
		}
		System.out.print(isPositive);

	}
	public static void main(String[] args) {
		int[] testArray = new int[3];
		testArray[0] = 1;
		testArray[1] = 1;
		testArray[2] = 0;
		checkPositiveArray(testArray);
	}

}
