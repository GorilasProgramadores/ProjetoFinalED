package tad_fila.exceptions;

@SuppressWarnings("serial")

public class FullQueueException extends RuntimeException {
	public FullQueueException(String err) {
		super("ATEN��O: A pilha est� cheia para usar essa fun��o voc� ter� que adicionar algum elemento.");
	}

}