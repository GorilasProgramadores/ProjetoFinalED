package tad_mapa.exceptions;

@SuppressWarnings("serial")
public class EmptyTreeException extends RuntimeException {
	public EmptyTreeException(String err) {
		super(err);
	}
}