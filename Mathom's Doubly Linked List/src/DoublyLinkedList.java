
public class DoublyLinkedList<T> implements StackADT<T>{
	
	//head is top of stack, tail is bottom
	private Node<T> head;
	private Node<T> tail;
	private int capacity;
	private int size;
	
	public DoublyLinkedList(int capacity) {
		this.head = null;
		this.tail = null;
		this.capacity = capacity;
		this.size = 0;
	}

	@Override
	public T peek() {
		return head.getData();
	}

	@Override
	public void push(Node<T> node) {
		if (isEmpty()) {
			this.head = node;
			this.tail = node;
			this.size++;
			return;
		}
		if (isFull()) {
			throw new IllegalStateException("Stack is already full");
		}
		node.setNext(head);
		head = node;
		this.size++;
	}
	
	@Override
	public T pop() {
		if (isEmpty()) {
			throw new IllegalStateException("Stack is already empty.");
		}
		if (size == 1) {
			T data = head.getData();
			head = null;
			tail = null;
			size--;
			return data;
		}
		T data = head.getData();
		head = head.getNext();
		head.setPrevious(null);
		size--;
		return data;
	}

	@Override
	public boolean isFull() {
		return size == capacity;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public int size() {
		return size;
	}
	
}
