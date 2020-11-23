import java.util.Random;
import java.util.Scanner;

public class Bai14 {

	public static void main(String[] args) {
		/*
		 * Enter the length of an array 
		 * Enter each element of the array 
		 * Delete duplicate elements
		 */
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int arrayLength;
		int[] array;

		System.out.print("Enter the length of an array: ");
		arrayLength = Integer.parseInt(scan.nextLine());

		array = new int[arrayLength];
		// fillinArray(scan, array);

		generateDummyData(array, rand);
		showElementArray(array);

		array = removeDuplicateElements(array);
		showElementArray(array);
	}

	private static int[] removeDuplicateElements(int[] array) {
		int[] tempArray = null;
		int tempArrayLength = countUniqueElements(array);

		tempArray = new int[tempArrayLength];

		tempArray[0] = array[0];
		int k = 1;
		for (int i = 1; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) 
					continue;
			}
			tempArray[k++] = array[i];
		}

		return tempArray;
	}

	private static int countUniqueElements(int[] array) {
		int count = array.length;

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					count--;
					// System.out.println(array[i] + " : " + count);
					break;
				}
			}
		}

		return count;
	}

	private static void showElementArray(int[] array) {
		System.out.print("All elements of the array: ");

		for (int i : array) {
			System.out.print(i + " ");
		}

		System.out.println();
	}

	private static void generateDummyData(int[] array, Random rand) {
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10) - 5;
		}
	}

	private static void fillinArray(Scanner scan, int[] array) {
		System.out.println("Enter elements of the array:");
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(scan.nextLine());
		}
	}

}
