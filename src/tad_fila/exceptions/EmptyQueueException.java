package tad_fila.exceptions;

@SuppressWarnings("serial")

public class EmptyQueueException extends RuntimeException {
	public EmptyQueueException(String err) {
		super("ATEN��O: A pilha est� vazia para usar essa fun��o voc� ter� que adicionar algum elemento.");
	}

}