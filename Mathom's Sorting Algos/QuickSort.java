import java.util.Arrays;

public class QuickSort {

	public static void quickSort(int[] array, int low, int high) {
		if (high <= low) return;
		
		int mid = (low + high)/2;
		int midVal = array[mid];
		array[mid] = array[high];
		array[high] = midVal;

		int l = low;
		int r = high - 1;
		
		while (l <= r) {
			if (array[l] > midVal && array[r] < midVal) {
				swap(l, r, array);
				l++;
				r--;
			} else {
				if (array[l] < midVal) {
					l++;
				}
				if (array[r] > midVal) {
					r--;
				}
			}
		}
		
		swap(l, high, array);
		
		quickSort(array, low, l - 1);
		quickSort(array, l + 1, high);
	}
	
	private static void swap(int idx1, int idx2, int[] array) {
		int tmp = array[idx1];
		array[idx1] = array[idx2];
		array[idx2] = tmp;
	}
	
	public static void main(String[] args) {
		int[] array = {0, 4, -3, 99, 3, 12};
		quickSort(array, 0, array.length-1);
		System.out.println(Arrays.toString(array));
	}
}
