public class LinkedList<T> implements IList<T> {
	private INode<T> head;
	private int size = 0;
	
	/**
	 * method for adding to a linkedlist
	 * @param e is a generic type to work with any object
	 */
	@Override
	public void add(T e) {
		if (head == null) {
			head = new Node<T>(e, null);
		} else {
			INode<T> temp = new Node<T>(e, null);
			if (head.getNext() == null) {
				INode<T> current = head;
				current.setNext(temp);
			} else {
				INode<T> current = head;
				if (current != null) {
					while (current.getNext() != null) {
						current = current.getNext();
					}
					current.setNext(temp);
				}
			}
		}
		size++;
		
	}
	/**
	 * method of adding with the specification of the index
	 * @param index is an integer
	 * @param e is generic type of object
	  * @throws   IndexOutOfBoundsException : if is out of index 
	 */
	@Override
	public void add(int index, T e) throws IndexOutOfBoundsException {
		
		INode <T> temp = new Node <T>(e,null);
		INode <T> current = head;
		if (index == 0) {
			head = new Node <T>(e, current);
		} else {
			if (current != null) {
				if (index <= size - 1){
					for (int i = 0; i < index - 1; i++) {
						current = current.getNext();
					}
				temp.setNext(current.getNext());
				current.setNext(temp);
				}
			}
		}
		size++;
		
	}
	/**
	 * in this method we clear the linkedlist
	 */
	@Override
	public void clear() {
		head=null;
		size=0;
		
	}
	/**
	 * in this method we check is the linkedlist contains
	 * the object
	 * @param s a generic type,  the object to checked 
	 * @return a boolean: true if exist, false otherwise
	 */
	@Override
	public boolean contains(T s) {
		for(int i=0; i < size; i++){
			if(get(i).equals(s)){
				return true;
			}
		}
		return false;
	}
	/**
	 * getting the head
	 */
	@Override
	public T getHead() {
		
		return head.getData();
	}
	/**
	 * getting the tail
	 */
	@Override
	public T getTail() {
		
		return get(size-1);
	}
	/**
	 * method in which we use the index to obtain the object needed
	 * @param index an integer
	 * @return e an object 
	 * @throws   IndexOutOfBoundsException : if is out of index 
	 */
	@Override
	public T get(int index) throws IndexOutOfBoundsException {
		INode<T> current = head;
		if (index == 0) {
			return head.getData();
		} else {
			if (index <= size - 1) {
				for (int i = 1; i <= index; i++) {
					current = current.getNext();
				}
				return current.getData();
			}
		}
		return null;
		
	}
	/**
	 * a method in we search in our linkedlist with the help 
	 * of the object that should be inside the linkedlist
	 * @param s any kind of object
	 * @return an integer as the index of the object
	 */
	@Override
	public int indexOf(T s) {
		INode<T> current = head;
		for (int i = 0; i < size; i++) {
			if (current.getData().equals(s)) {
				return i;
			}
			current = current.getNext();
		}
		return -1;
	}
	/**
	 * chech if the linkelist is empty wit the size
	 * @return a boolean tru if the size equal zero , false otherwise.
	 */
	@Override
	public boolean isEmpty() {
		 return size == 0;
	}
	/**
	 * a method to remove an object with the index
	 * @param index an integer
	 * @return The contents of the element that was removed. 
	  * @throws   IndexOutOfBoundsException : if is out of index 
	 */
	@Override
	public T remove(int index) throws IndexOutOfBoundsException {

		INode <T> current = head;
		INode <T> temp = null;
		if (index == 0) {
			head = current.getNext();
			size --;
		} else {
			if (index <= size - 1) {
				for (int i = 1; i <= index-1; i++) {
					current = current.getNext();
				}
			    temp = current;
			    current.setNext(temp.getNext().getNext());
				size --;
			}

		}
		return get(index);
	}
	/**
	 * a method that give the size
	 * @return size an integer
	 */
	@Override
	public int size() {
	
		return size;
	}
	
}	
	
