import java.util.Scanner;

public class Bai11 {

	public static void main(String[] args) {
		/*
		 * Enter an integer and
		 * Show on the screen the greatest value which is
		 * 	less than log2(n)
		 */
		Scanner scan = new Scanner(System.in);
		int num;
		
		System.out.print("Enter a munber: ");
		num = Integer.parseInt(scan.nextLine());
		
		System.out.println("The greatest number less than log2(" + num + "): " + findLargestUnderLog2n(num));

	}

	private static int findLargestUnderLog2n(int num) {
		return (int) (Math.log(num) / Math.log(2));
	}

}
