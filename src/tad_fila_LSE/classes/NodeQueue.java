package tad_fila_LSE.classes;

import tad_fila_LSE.exceptions.EmptyQueueException;

public class NodeQueue<E> {
	protected int E[];
	protected int size;
	protected Node<E> f;
	protected Node<E> r;

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		if (size == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void enqueue(E elem) {
		Node<E> node = new Node<E>();

		node.setElement(elem);
		node.setNext(null);
		if (size == 0)
			f = node;
		else
			r.setNext(node);
		r = node;
		size++;
	}

	public E dequeue() throws EmptyQueueException {
		if (size == 0)
			throw new EmptyQueueException("Queue is empty.");
		E tmp = f.getElement();
		f = f.getNext();
		size--;
		if (size == 0)
			r = null;
		return tmp;
	}

	public String toString() {
		String s;
		Node<E> p = f;
		s = "[";
		while (p != null) {
			s += p.getElement();
			s += ", ";
			p = p.getNext();
		}
		if (s.length() > 1)
			s = s.substring(0, s.length() - 2);
		return s + "]";
	}
}
