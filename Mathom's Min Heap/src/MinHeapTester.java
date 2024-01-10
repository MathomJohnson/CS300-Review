
public class MinHeapTester {
	
	public static boolean test() {
		MinHeap<Integer> heap = new MinHeap<Integer>();
		heap.enqueue(6);
		heap.enqueue(4);
		heap.enqueue(7);
		heap.enqueue(11);
		heap.enqueue(2);
		heap.enqueue(9);
		heap.enqueue(1);
		heap.enqueue(-4);
		heap.enqueue(13);
		heap.enqueue(5);
		heap.stringify();
		if (heap.dequeue() != -4) return false;
		heap.stringify();
		if (heap.dequeue() != 1) return false;
		heap.stringify();
		if (heap.dequeue() != 2) return false;
		heap.stringify();
		heap.dequeue();
		heap.dequeue();
		heap.dequeue();
		heap.dequeue();
		heap.dequeue();
		heap.dequeue();

		heap.stringify();
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(test());
	}
}
 