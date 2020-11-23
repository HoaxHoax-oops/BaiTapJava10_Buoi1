import java.util.Random;
import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		/*
		 * Convert decimal to binary
		 */
		Scanner scan = new Scanner(System.in);
		int num = 0;

		/*
		 * // user enter a number System.out.print("Enter a decimal number: "); num =
		 * Integer.parseInt(scan.nextLine());
		 * 
		 * // convert and show the number after converting
		 * System.out.println("Your number after converting: " + toBinary(num));
		 */
		
		// random number for check
		check();

	}

	private static void check() {
		Random rand = new Random();
		final int times = 10;
		int temp;
		
		for (int i = 0; i < times; i++) {
			temp = rand.nextInt(100);
			System.out.println(temp + ": " + toBinary(temp));
		}
	}

	private static String toBinary(int num) {
		String binary = "";

		while (num > 0) {
			binary = String.valueOf(num % 2) + binary;
			num = num / 2;
		}

		return binary;
	}

}
