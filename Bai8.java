import java.util.Scanner;

public class Bai8 {

	public static void main(String[] args) {
		/*
		 * Enter a string
		 * Upcase the first letter of the string and
		 * Show on the screen
		 */
		Scanner scan = new Scanner(System.in);
		String str = "";
		
		System.out.print("Enter a string: ");
		str = scan.nextLine();
		
		System.out.println("Upcase the first letter: " + upcaseFirstLetter(str));

	}

	private static String upcaseFirstLetter(String str) {
		char[] in = str.toCharArray();
		
		in[0] -= 32;
		for (int i = 1; i < in.length; i++) {
			// capture white space and upcase the next letter
			if(in[i] == 32) {
				i++;
				in[i] -= 32;
			}
		}
		
		return new String(in);
	}

}
