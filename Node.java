public class Node<E> implements INode<E> {
	private E e;
	private INode<E> n;
	/**
	 * a constructor
	 * @param i whatever object
	 * @param p  for the next object
	 */
	
	public Node(E i, INode<E> p){
		this.e=i;
		this.n=p;
	}
	/**
	 * a method to return the type of e, the type of object
	 * @return e as any kind of object
	 * Returns the data stored in this node.
	 */
	@Override
	public E getData() {
		// TODO Auto-generated method stub
		return e;
	}
	/**
	 * a method to be setter for data for this node
	 * @param data the object to set and it can be any kind of object
	 */

	@Override
	public void setData(E data) {
		e=data;
		
	}
	/**
	 * a method to returns the node next to this node
	 * @return n as an object
	 */

	@Override
	public INode<E> getNext() {
		// TODO Auto-generated method stub
		return n;
	}

	/**
	 * @param next  an object
	 * a method to set node received as the next node to this node.

	 */
	@Override
	public void setNext(INode<E> next) {
		n=next;
		
	}
