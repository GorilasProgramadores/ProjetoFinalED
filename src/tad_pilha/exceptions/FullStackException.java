package tad_pilha.exceptions;

@SuppressWarnings("serial")

public class FullStackException extends RuntimeException {
	public FullStackException(String err) {
		super("ATENÇÃO: A pilha está lotada para usar essa função você terá que remover algum elemento.");
	}
}