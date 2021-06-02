package tad_lista_de_nodos.interfaces;

import java.util.Iterator;

import tad_lista_de_nodos.exceptions.*;

public interface PositionList<E> extends Iterable<E> {

	public int size();

	public boolean isEmpty();
	
	public Position<E> first();

	public Position<E> last();

	public Position<E> next(Position<E> p) throws InvalidPositionException, BoundaryViolationException;

	public Position<E> prev(Position<E> p) throws InvalidPositionException, BoundaryViolationException;

	public void addFirst(E e);

	public void addLast(E e);

	public void addAfter(Position<E> p, E e) throws InvalidPositionException;

	public void addBefore(Position<E> p, E e) throws InvalidPositionException;

	public E remove(Position<E> p) throws InvalidPositionException;
	
	public E set(Position<E> p, E e) throws InvalidPositionException;

	public Iterator<E> iterator();

}