package tad_fila_de_prioridade.exceptions;

@SuppressWarnings("serial")
public class EmptyListException extends RuntimeException {
	public EmptyListException(String err) {
		super(err);
	}
}
