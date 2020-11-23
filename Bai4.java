import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		/*
		 * Nhập vào số tự nhiên và In ra tổng các chữ số của số đó
		 */
		Scanner scan = new Scanner(System.in);
		int num;

		// nhập số
		System.out.print("Mời nhập số: ");
		num = Integer.parseInt(scan.nextLine());

		// xuất tổng các chữ số
		System.out.println("Tổng các chữ chỗ là: " + tinhTongCacChuSo(num));

	}

	private static int tinhTongCacChuSo(int num) {
		int sum = 0;
		while (num > 0) {
			sum = sum + (num % 10);
			num = num / 10;
			//System.out.println(num + " : " + sum);
		}
		return sum;
	}

}
