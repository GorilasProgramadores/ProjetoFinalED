package tad_pilha_LSE.exceptions;

@SuppressWarnings("serial")

public class EmptyStackException extends RuntimeException {
	public EmptyStackException(String err) {
		super("ATENÇÃO: A pilha está vazia para usar essa função você terá que adicionar algum elemento.");
	}
}