package tad_mapa.exceptions;

@SuppressWarnings("serial")
public class NoSuchElementException extends RuntimeException {
	public NoSuchElementException(String err) {
		super(err);
	}
}
