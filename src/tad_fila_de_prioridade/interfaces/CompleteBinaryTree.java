package tad_fila_de_prioridade.interfaces;

public interface CompleteBinaryTree<E> extends BinaryTree<E> {

	public Position<E> add(E elem);

	public E remove();
}
