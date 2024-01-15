import java.util.Arrays;

public class InsertionSort {
	
	public static void insertionSort(int[] array) {
		
		int len = array.length;
		for (int i = 1; i < len; i++) {
			int j = i;
			boolean done = false;
			while (!done) {
				if (j == 0) {
					done = true;
				} else if (array[j] >= array[j-1]) {
					done = true;
				} else {
					swap(j, j-1, array);
					j--;
				}
			}
		}
	}
	
	public static void recursiveInsertionSort(int[] array, int start) {
		
		int len = array.length;
		
		//base case
		if (start == len) {
			return;
		}
		
		int j = start;
		boolean done = false;
		while (!done) {
			if (j == 0) {
				done = true;
			} else if (array[j] < array[j-1]) {
				swap(j, j-1, array);
				j--;
			} else {
				done = true;
			}
		}
		
		recursiveInsertionSort(array, start+1);
	}
	
	private static void swap(int idx1, int idx2, int[] array) {
		int tmp = array[idx1];
		array[idx1] = array[idx2];
		array[idx2] = tmp;
	}
	
	public static void main(String[] args) {
		int[] array = {-3, 3, 4, 12, 5, -6, 9, 0, -1, 13, 10, -9};
		recursiveInsertionSort(array, 0);
		System.out.println(Arrays.toString(array));
	}
}
