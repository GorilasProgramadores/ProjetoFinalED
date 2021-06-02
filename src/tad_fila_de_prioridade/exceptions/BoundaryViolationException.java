package tad_fila_de_prioridade.exceptions;

@SuppressWarnings("serial")
public class BoundaryViolationException extends RuntimeException {
	public BoundaryViolationException(String err) {
		super(err);
	}
}