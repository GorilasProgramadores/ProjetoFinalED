package tad_pilha.exceptions;

@SuppressWarnings("serial")

public class FullStackException extends RuntimeException {
	public FullStackException(String err) {
		super("ATEN��O: A pilha est� lotada para usar essa fun��o voc� ter� que remover algum elemento.");
	}
}