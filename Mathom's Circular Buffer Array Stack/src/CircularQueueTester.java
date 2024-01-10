
public class CircularQueueTester {
	
	public static void main(String[] args) {
		CircularQueue<Integer> nums = new CircularQueue<>(4);
		nums.enqueue(3);
		nums.dequeue();
		nums.enqueue(6);
		nums.enqueue(12);
		nums.enqueue(8);
		nums.dequeue();
		nums.enqueue(12);
		nums.enqueue(12);
		nums.dequeue();
		nums.dequeue();
		nums.enqueue(12);
		nums.dequeue();
		nums.dequeue();
		nums.dequeue();

		System.out.println(nums.toString());
	}
}
