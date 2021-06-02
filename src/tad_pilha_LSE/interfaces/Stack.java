package tad_pilha_LSE.interfaces;

import tad_pilha_LSE.exceptions.EmptyStackException;

public interface Stack<E> {
	public int size();

	// @return True se a pilha é vazia, False em caso contrário.

	public boolean isEmpty();

	// @return o elemento que está no topo da pilha.

	// @exception EmptyStackException se a pilha estiver vazia.

	public E top() throws EmptyStackException;

	// @param elemento a ser inserido.

	public void push(E element);

	// @return elemento removido.

	// @exception EmptyStackException se a pilha estiver vazia.

	public E pop() throws EmptyStackException;
}