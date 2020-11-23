import java.util.Random;
import java.util.Scanner;

public class testMain {

	public static void main(String[] args) {
		System.out.println("Wellcome, my lord Mr.Lâm!");
		
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int[] array = new int[10];
		int tempValue;
		
		System.out.println(-3 % 2);
		System.out.println(-5 % 2);
		System.out.println(-2 % 2);
		System.out.println(-6 % 2);

	}
	
	private static int[] takeOutPositiveElements(int[] array) {
		// catch an event when array does not contain any positive element
		if(countPositiveElements(array) == 0)
			return null;
		
		int[] positiveArray = new int[countPositiveElements(array)];
		
		int i = 0;
		for (int j : array) {
			if(j > 0) {
				positiveArray[i] = j;
				i++;
			}	
			
		}
		
		return positiveArray;
	}
	
	private static int countPositiveElements(int[] array) {
		int count = 0;
		
		for (int i : array) {
			if(i > 0)
				count++;
		}
		return count;
	}
	
	private static int[] removeElement(int[] array, int tempValue) {
		int[] tempArray = null;
		
		// catch an event when tempValue does not exist in the array
		if(!existValue(array, tempValue))
			return tempArray;
		
		tempArray = new int[array.length - 1];
		// just remove the first element in terms of duplicate value
		boolean removeFirstElement = true;
		
		for (int i = 0, k = 0; i < array.length; i++) {
			System.out.println("i: " + i + "\t" + "k: " + k);
			if(array[i] == tempValue && removeFirstElement) {
				removeFirstElement = false;
				continue;
			}
			
			tempArray[k++] = array[i];
		}

		return tempArray;
	}
	
	private static boolean existValue(int[] array, int tempArray) {
		for (int i : array) {
			if(i == tempArray)
				return true;
		}
		return false;
	}

	private static void showElementArray(int[] array) {
		System.out.print("All elements of the array: ");

		for (int i : array) {
			System.out.print(i + " ");
		}

		System.out.println();
	}

}
