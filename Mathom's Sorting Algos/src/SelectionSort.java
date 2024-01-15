import java.util.Arrays;

public class SelectionSort {

	public static <T extends Comparable<T>> void selectionSort(T[] array) {
		int len = array.length;
		for (int i = 0; i < len - 1; i++) {
			int smallestIdx = i;
			for (int j = i; j < len; j++) {
				if (array[j].compareTo(array[smallestIdx]) < 0) {
					smallestIdx = j;
				}
			}
			T tmp = array[i];
			array[i] = array[smallestIdx];
			array[smallestIdx] = tmp;
		}
	}
	
	public static void main(String[] args) {
		Integer[] array = {1, -4, 6, 78, 3, 9, 0, -23, -1, 55};
		String[] array1 = {"hello", "a", "mathom", "hehehehaw", "world", "", "google"};
		selectionSort(array);
		selectionSort(array1);
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(array1));

	}
}
