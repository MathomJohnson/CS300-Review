
public interface QueueADT<T> {
	public T peek();
	public void enqueue(T element);
	public T dequeue();
	public int size();
	public boolean isFull();
	public boolean isEmpty();
}
