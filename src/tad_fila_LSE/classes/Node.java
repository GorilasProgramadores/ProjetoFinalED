package tad_fila_LSE.classes;

public class Node<E> {

	private E element;

	private Node next;

	public Node() {
		this.element = null;
		this.next = null;
	}

	public E getElement() {
		return element;
	}
	
	public Node getNext() {
		return next;
	}
	public void setElement(E elem) {
		element = elem;
	}
	
	public void setNext(Node newNext) {
		next = newNext;
	}

}
