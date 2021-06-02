package tad_fila_de_prioridade.exceptions;

@SuppressWarnings("serial")
public class NoSuchElementException extends RuntimeException {
	public NoSuchElementException(String err) {
		super(err);
	}
}
