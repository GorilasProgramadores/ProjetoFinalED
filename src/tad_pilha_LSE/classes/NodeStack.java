package tad_pilha_LSE.classes;

import tad_pilha_LSE.exceptions.EmptyStackException;
import tad_pilha_LSE.interfaces.Stack;

public class NodeStack<E> implements Stack<E> {

	protected Node<E> top;

	protected int size; 

	public NodeStack() {
		top = null;
		size = 0;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		if (top == null)
			return true;

		return false;
	}

	public void push(E elem) {
		Node<E> v = new Node<E>(elem, top);
		top = v;
		size++;
	}

	public E top() throws EmptyStackException {
		if (isEmpty())
			throw new EmptyStackException("Stack is empty.");
		return top.getElement();
	}

	public E pop() throws EmptyStackException {
		Node<E> aux = top;

		if (isEmpty())
			throw new EmptyStackException("Stack is empty.");

		E temp = top.getElement();
		top = top.getNext();
		aux.setNext(null);
		size--;
		
		return temp;
	}


	public String checarExpressao(String[] arranjo) {
		NodeStack<String> teste = new NodeStack<String>();
		
		for (int i = 0; i <= arranjo.length - 1; i++) {
			if (arranjo[i].equals("(") || arranjo[i].equals("[") || arranjo[i].equals("{")) 
				teste.push(arranjo[i]); 
			
			else if (arranjo[i].equals(")") || arranjo[i].equals("]") || arranjo[i].equals("}")) {
				if (teste.isEmpty()) 
					return "Incorreto";
				
				if (teste.top().equals("(") && arranjo[i].equals(")") || teste.top().equals("[") && arranjo[i].equals("]") || teste.top().equals("{") && arranjo[i].equals("}")) 				
					teste.pop();
				
				else return "Incorreto";
			}
		}
		if (teste.isEmpty())
			return "Correto";
		
		else
			return "Incorreto";
	}
	
	public String toString() {
		String s;
		Node<E> p = top;		
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