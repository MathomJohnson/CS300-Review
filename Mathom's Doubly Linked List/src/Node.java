
public class Node<T> {
	
	private T data;
	private Node<T> next;
	private Node<T> previous;
	
	public Node(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public Node<T> getNext() {
		return next;
	}
	
	public void setNext(Node<T> node) {
		next = node;
	}
	
	public Node<T> getPrevious() {
		return previous;
	}
	
	public void setPrevious(Node<T> node) {
		previous = node;
	}
}
