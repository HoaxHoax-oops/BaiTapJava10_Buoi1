
public class Bai1 {

	public static void main(String[] args) {
		// TODO: in quốc kì Mỹ
		final String temp1 = "* * * * * * ";
		final String temp2 = " * * * * *  ";
		final int num = 60;
		
		for (int i = 0; i < 4; i++) {
			System.out.println(temp1 + String.format("%" + (num-temp1.length()) + "s", "").replace(" ", "="));
			System.out.println(temp2 + String.format("%" + (num-temp1.length()) + "s", "").replace(" ", "="));
		}
		
		System.out.println(temp1 + String.format("%" + (num-temp1.length()) + "s", "").replace(" ", "="));
		
		for (int i = 0; i < 6; i++) {
			System.out.println(String.format("%" + num + "s", "").replace(" ", "="));
		}

	}

}
