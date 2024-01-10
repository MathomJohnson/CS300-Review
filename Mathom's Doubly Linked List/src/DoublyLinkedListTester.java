
public class DoublyLinkedListTester {
	public static boolean pushTester() {
		DoublyLinkedList<String> list = new DoublyLinkedList<>(3);
		if (!list.isEmpty()) return false;
		Node<String> node1 = new Node<>("Mathom");
		Node<String> node2 = new Node<>("Gunter");
		Node<String> node3 = new Node<>("Johnson");
		Node<String> node4 = new Node<>("oj");
		list.push(node1);
		if (list.size() != 1) return false;
		list.push(node2);
		list.push(node3);
		if (!list.isFull()) return false;
		try {
			list.push(node4);
			return false;
		} catch (IllegalStateException e) {}
		
		return true;
	}
	
	public static boolean popTester() {
		DoublyLinkedList<String> list = new DoublyLinkedList<>(3);
		Node<String> node1 = new Node<>("Mathom");
		Node<String> node2 = new Node<>("Gunter");
		Node<String> node3 = new Node<>("Johnson");
		list.push(node1);
		list.push(node2);
		list.push(node3);
		if (list.pop() != node3.getData()) return false;
		if (list.pop() != node2.getData()) return false;
		if (list.pop() != node1.getData()) return false;
		try {
			list.pop();
			return false;
		} catch (IllegalStateException e) {}
		if (!list.isEmpty()) return false;
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(pushTester());
		System.out.println(popTester());
	}
}
