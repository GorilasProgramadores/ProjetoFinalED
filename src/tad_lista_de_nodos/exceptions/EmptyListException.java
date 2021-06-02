package tad_lista_de_nodos.exceptions;

@SuppressWarnings("serial")
public class EmptyListException extends RuntimeException {

	public EmptyListException(String err) {
		super(err);
	}

}
