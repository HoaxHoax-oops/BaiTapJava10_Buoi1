import java.util.Scanner;

public class Bai12 {

	public static void main(String[] args) {
		/*
		 * Enter a number "n" Show on the screen right triangle. 
		 * Ex: n = 4 
		 * 		1 
		 * 		1 2 
		 * 		1 2 3 
		 * 		1 2 3 4
		 */
		Scanner scan = new Scanner(System.in);
		int num;

		System.out.print("Enter a munber: ");
		num = Integer.parseInt(scan.nextLine());

		drawRightTriangle(num);

	}

	private static void drawRightTriangle(int num) {
		String str = "";
		for (int j = 1; j <= num; j++) {
			str += j + " ";
			System.out.println(str);
		}
	}

}
