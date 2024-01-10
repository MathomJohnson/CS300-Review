
public interface HeapADT<T extends Comparable<T>> {
	
	public void enqueue(T data);
	
	public T dequeue();
	
	public void percolateUp(int index);
	
	public void percolateDown(int index);
	
	public T peek();
	
	public int lChildIdx(int index);
	
	public int rChildIdx(int index);
	
	public int parentIdx(int index);
}
