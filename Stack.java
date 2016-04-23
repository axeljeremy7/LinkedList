public class Stack<T> implements IStack<T> {
	private IList<T> list = new LinkedList<T>();
	private int size=0;// the size of the stack
	/**
	 * void method to push the object
	 * @param s any kind object
	 */
	@Override
	public void push(T s) {
		list.add(s);
		size++;
	}

	/**
	 * a void method to pop the object
	 */
	@Override
	public void pop() {
		size = size-1;  
		list.get(size);
	}

	/**
	 * a method to peek the object without removed it 
	 * @return any kind of object of the stack
	 */
	@Override
	public T peek() {
		return list.get(size-1);
	}

	/**
	 * a method to return the size of the stack
	 * @return a integer value of the size
	 */
	@Override
	public int size() {
		return size;
	}
    /**
     * a boolean method that return true if the size equal zero, false otherwise
     * @return a boolean as an answer is empty
     */
	@Override
	public boolean isEmpty() {
		return (size==0);
	}
}
