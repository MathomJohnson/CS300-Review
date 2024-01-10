
interface StackADT<T> {
	/**
	 * Look at the top of the stack and return that
	 * element without altering the stack.
	 */
	public T peek();
	
	/**
	 * Adds a node to the stack and does not return 
	 * anything.
	 */
	public void push(Node<T> node);
	
	/**
	 * Returns the top element of the stack and also
	 * removes that element from the stack.
	 */
	public T pop();
	
	/**
	 * returns true if the stack is full else false.
	 */
	public boolean isFull();
	
	/**
	 * returns true if the stack is empty else false.
	 */
	public boolean isEmpty();
	
	/**
	 * return the current number of elements in the stack.
	 */
	public int size();
}
