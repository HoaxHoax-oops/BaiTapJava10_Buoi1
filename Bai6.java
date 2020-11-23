import java.util.Scanner;

public class Bai6 {

	public static void main(String[] args) {
		/*
		 * Enter a string
		 * Reverse a string and show on the console
		 */
		Scanner scan = new Scanner(System.in);
		String str = "";
		
		// allow user to enter a string
		System.out.print("Enter a string: ");
		str = scan.nextLine();
		
		// reverse the string and show to the screen
		System.out.println("The string after reversion: " + reverseString(str));
	}

	private static String reverseString(String str) {
		char[] in = str.toCharArray();
		char temp;
		
		for (int i = 0, j = in.length - 1; i < j; i++, j--) {
			//System.out.println(in[i] + " : " + in[j]);
			temp = in[i];
			in[i] = in[j];
			in[j] = temp;
		}
		
		return new String(in);
	}

}
