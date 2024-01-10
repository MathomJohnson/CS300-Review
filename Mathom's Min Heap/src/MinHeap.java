import java.util.ArrayList;
import java.util.Arrays;

public class MinHeap<T extends Comparable<T>> implements HeapADT<T> {
	
	private ArrayList<T> heap;
	private int size;
	
	public MinHeap() {
		heap = new ArrayList<T>();
		size = 0;
	}
	
	@Override
	public int lChildIdx(int index) {
		return (2*index) + 1; 
	}

	@Override
	public int rChildIdx(int index) {
		return (2*index) + 2;
	}

	@Override
	public int parentIdx(int index) {
		return (index-1)/2;
	}

	@Override
	public void enqueue(T data) {
		heap.add(data);
		size++;
		percolateUp(size - 1);
	}

	@Override
	public T dequeue() {
		if (size < 1) {
			throw new IllegalStateException("heap is empty");
		}
		T data = heap.get(0);
//		heap.set(0, heap.get(size - 1));
//		heap.set(size - 1, null);
		swap(0, size - 1);
		size--;
		percolateDown(0);
		return data;
	}

	@Override
	public void percolateUp(int index) {
		if (index == 0) {
			return;
		}
		if (heap.get(parentIdx(index)).compareTo(heap.get(index)) <= 0) {
			return;
		}
		
		swap(index, parentIdx(index));
		
		percolateUp(parentIdx(index));
	}

	@Override
	public void percolateDown(int index) {
		//base cases
		if (lChildIdx(index) > size - 1) {
			return;
		}
		if (!(rChildIdx(index) > size - 1)) {
			if (heap.get(index).compareTo(heap.get(lChildIdx(index))) < 0
					&& heap.get(index).compareTo(heap.get(rChildIdx(index))) < 0) {
				return;
			}
		}
		if (heap.get(index).compareTo(heap.get(lChildIdx(index))) < 0) {
			return;
		}
		
		T left = heap.get(lChildIdx(index));
		T right = heap.get(rChildIdx(index));
		
		if (right == null || left.compareTo(right) < 0) {
			swap(index, lChildIdx(index));
			percolateDown(lChildIdx(index));
		}
		else {
			swap(index, rChildIdx(index));
			percolateDown(rChildIdx(index));
		}
	}

	private void swap(int idx1, int idx2) {
		T data = heap.get(idx1);
		heap.set(idx1, heap.get(idx2));
		heap.set(idx2, data);
	}
	
	@Override
	public T peek() {
		if (isEmpty()) {
			throw new IllegalStateException("heap is empty");
		}
		return heap.get(0);
	}

	public boolean isEmpty() {
		if (size < 1) return true;
		return false;
	}
	

	public void stringify() {
		System.out.println(Arrays.toString(heap.toArray()));
	}
}
