import java.util.ArrayList;

public class CircularQueue<T> implements QueueADT<T>{
	private int start;
	private int end;
	private int capacity;
	private int size;
	private ArrayList<T> array;
	
	public CircularQueue(int capacity) {
		if (capacity < 1) {
			throw new IllegalStateException("Capacity must be greater than 0!");
		}
		array = new ArrayList<>(capacity);
		start = 0;
		end = 0;
		size = 0;
		this.capacity = capacity;
		for (int i = 0; i < capacity; i++) {
			array.add(null);
		}
	}

	@Override
	public T peek() {
		return array.get(start);
	}

	@Override
	public void enqueue(T element) {
		if (isFull()) {
			throw new IllegalStateException("Queue is already full!");
		}
		if (isEmpty()) {
			array.set(end, element);
			size++;
		}
		else {
			int index = (end + 1) % capacity;
			array.set(index, element);
			size++;
			end = index;
		}
	}

	@Override
	public T dequeue() {
		if (isEmpty()) {
			throw new IllegalStateException("Queue is already empty!");
		}
		if (size == 1) {
			T element = array.get(start);
			array.set(start, null);
			size--;
			return element;
		}
		T element = array.get(start);
		array.set(start, null);
		start = (start + 1) % capacity;
		size--;
		return element;
		
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isFull() {
		return size == capacity;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void printOut() {
		for (int i = 0; i < capacity; i++) {
			System.out.println(array.get(i));
		}
	}
	public String toString() {
		String msg = "[";
		for (int i = 0; i < capacity; i++) {
			if (i == start) {
				msg = msg + "(s)";
			}
			if (i == end) {
				msg = msg + "(e)";
			}
			if (array.get(i) == null) {
				if (i == capacity - 1) {
					msg = msg + "null";
				}
				else {
					msg = msg + "null, ";
				}
			}
			else if (i == capacity - 1) {
				msg = msg + array.get(i);
			}
			else {
				msg = msg + array.get(i) + ", ";
			}
		}
		msg = msg + "]";
		return msg;
	}
}
