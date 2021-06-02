package tad_fila_de_prioridade.exceptions;

@SuppressWarnings("serial")
public class InvalidPositionException extends RuntimeException {
	public InvalidPositionException(String err) {
		super(err);
	}
}
