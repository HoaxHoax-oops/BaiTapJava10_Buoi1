import java.util.Scanner;

public class Bai7 {

	public static void main(String[] args) {
		/*
		 * Nhập vào 1 số tự nhiên 
		 * In ra các ước số của số đó
		 */
		Scanner scan = new Scanner(System.in);
		int so;

		System.out.print("Nhập số tự nhiên: ");
		so = Integer.parseInt(scan.nextLine());

		lietKeUocSo(so);

	}

	private static void lietKeUocSo(int so) {
		System.out.print("Các ước số của " + so + ": ");
		for (int i = 1; i <= so; i++) {
			if ((so % i) == 0)
				System.out.print(i + " ");
		}
	}

}
