package tad_fila.exceptions;

@SuppressWarnings("serial")

public class EmptyQueueException extends RuntimeException {
	public EmptyQueueException(String err) {
		super("ATENÇÃO: A pilha está vazia para usar essa função você terá que adicionar algum elemento.");
	}

}