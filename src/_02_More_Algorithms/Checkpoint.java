package _02_More_Algorithms;

public class Checkpoint {
	static int[] intArray = { 1, 2, 3, 4, 5, 7, 4, 8 };
	static double[] array = { 1.1, 2.3, 4.5, 9.2, 2.1, 4.6 };

	public static void main(String[] args) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(DoubleArraySorter(array)[i] + "   ");

		}
		System.out.println("");
		System.out.println(isInside(intArray, 1));
		System.out.println(isInside(intArray, 6));
		System.out.println("Bonus:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(ReverseArraySorter(array)[i] + "   ");

		}
	}

	public static double[] DoubleArraySorter(double[] array) {

		for (int j = 1; j < array.length; j++) {
			for (int i = 0; i < array.length - 1; i++) {

				if (array[i] > array[j]) {
					double temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}

		}
		return array;

	}
	public static double[] ReverseArraySorter(double[] array) {
		for (int j = 1; j < array.length; j++) {
			for (int i = 0; i < array.length - 1; i++) {

				if (array[i] < array[j]) {
					double temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}

		}
		return array;
		
	}

	public static boolean isInside(int[] array, int num) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				return true;
			}
		}
		return false;

	}
}
