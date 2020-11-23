import java.util.Random;

public class Bai9 {

	public static void main(String[] args) {
		/*
		 * Enter two positive integer
		 * Return true if
		 * 		these two number have one or more similar digit
		 * Otherwise return false
		 */
		Random rand = new Random();
		int numA;
		int numB;
		final int times = 50;
		
		for (int i = 0; i <= times; i++) {
			numA = rand.nextInt(100);
			numB = rand.nextInt(100);
			System.out.println(numA + " compare to " + numB + ": " + checkSameDigits(numA, numB));
		}	

	}

	private static boolean checkSameDigits(int numA, int numB) {
		int[] digitA = split(numA);
		int[] digitB = split(numB);
		
		for (int i : digitB) {
			for (int j : digitA) {
				if(i == j)
					return true;
			}
		}
		return false;
	}

	private static int[] split(int num) {
		int[] digit = new int[2];
		
		digit[0] = num / 10;
		digit[1] = num % 10;
		
		return digit;
	}

}
