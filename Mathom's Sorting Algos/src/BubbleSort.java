import java.util.Arrays;

public class BubbleSort {

	public static void bubbleSort(int[] array) {
		int len = array.length;
		
		for (int i = 0; i < len - 1; i++) {
			int j = 0;
			boolean done = false;
			
			while (!done) {
				if (j == len - 1) done = true;
				else if (array[j] > array[j+1]) {
					swap(j, j+1, array);
				} 
				j += 1;
			}
		}
	}
	
	private static void swap(int idx1, int idx2, int[] array) {
		int tmp = array[idx1];
		array[idx1] = array[idx2];
		array[idx2] = tmp;
	}
	
	public static void main(String[] args) {
		int[] array = {2, 4, 0, -1, 8, -5, -2, 11, 3, 9, 10, -14};
		bubbleSort(array);
		System.out.println(Arrays.toString(array));
	}
}
