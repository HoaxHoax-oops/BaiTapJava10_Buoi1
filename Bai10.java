import java.util.Scanner;

public class Bai10 {

	public static void main(String[] args) {
		/*
		 * Enter a number "n"
		 * Calculate and show on the screen 
		 * 	sum of all prime numbers under "n"
		 */
		Scanner scan = new Scanner(System.in);
		int num;
		
		System.out.print("Enter a munber: ");
		num = Integer.parseInt(scan.nextLine());
		
		System.out.println("Sum of all prime numbers under " + num + ": " + sumPrimeNumber(num));
	}

	private static int sumPrimeNumber(int num) {
		int sum = 0;
		
		for (int i = 1; i <= num; i++) {
			if(isPrime(i)) {
				sum += i;
				//System.out.println(i + " : " + sum);
			}	
		}
		
		return sum;
	}

	private static boolean isPrime(int n) {
		if (n == 2) {
            return true;
        }
        if (n < 2 || n % 2 == 0) {
            return false;
        }
        for (int i = 3, limit = (int) Math.sqrt(n); i <= limit; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
	}

}
