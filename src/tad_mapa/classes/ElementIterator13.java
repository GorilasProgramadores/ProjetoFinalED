package tad_mapa.classes;

import java.util.Iterator;
import tad_mapa.exceptions.*;
import tad_mapa.interfaces.*;



public class ElementIterator13<E> implements Iterator<E> {

	protected PositionList<E> list;

	protected Position<E> cursor;

	public ElementIterator13(PositionList<E> L) {

		list = L;

		cursor = (list.isEmpty()) ? null : list.first();

	}

	public boolean hasNext() {
		return (cursor != null);
	}

	public E next() throws NoSuchElementException {
		if (cursor == null)
			throw new NoSuchElementException("No next element");

		E toReturn = cursor.element();
		cursor = (cursor == list.last()) ? null : list.next(cursor);

		return toReturn;
	}

	public void remove() throws UnsupportedOperationException {
		throw new UnsupportedOperationException("remove");
	}
}