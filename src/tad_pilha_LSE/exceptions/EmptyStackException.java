package tad_pilha_LSE.exceptions;

@SuppressWarnings("serial")

public class EmptyStackException extends RuntimeException {
	public EmptyStackException(String err) {
		super("ATEN��O: A pilha est� vazia para usar essa fun��o voc� ter� que adicionar algum elemento.");
	}
}