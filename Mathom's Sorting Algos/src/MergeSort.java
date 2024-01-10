import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {

	public static void mergeSort(int[] array) {
		int size = array.length;
		
		if (size <= 1) return; //base case
		
		int middle = size / 2;
		int[] left = new int[middle];
		int[] right = new int[size - middle];
		int i = 0;
		int j = 0;
		
		for (i = 0; i < middle; i++) {
			left[i] = array[i];
		}
		for (; i < size; i++) {
			right[j] = array[i];
			j++;
		}
		
		mergeSort(left);
		mergeSort(right);
		
		merge(left, right, array);
	}
	
	private static void merge(int[] left, int[] right, int[] array) {
		int l = 0;
		int r = 0;
		int k = 0;
		
		while (l < left.length && r < right.length) {
			if (left[l] < right[r]) {
				array[k] = left[l];
				l++;
			} else {
				array[k] = right[r];
				r++;
			}
			k++;
		}
		
		while (l < left.length) {
			array[k] = left[l];
			l++;
			k++;
		}
		while (r < right.length) {
			array[k] = right[r];
			r++;
			k++;
		}
	}
	
	public static void main(String[] args) {
		int[] array = {-4, 6, 8, 1, -2, -1, 19, 9, 23, 1, 0};
		mergeSort(array);
		System.out.println(Arrays.toString(array));
	}
}
