package tad_fila.exceptions;

@SuppressWarnings("serial")

public class FullQueueException extends RuntimeException {
	public FullQueueException(String err) {
		super("ATENÇÃO: A pilha está cheia para usar essa função você terá que adicionar algum elemento.");
	}

}