package infra;

import java.util.Scanner;

import tad_ListaArranjos.classes.ArrayIndexList;

import static principal.Main.OpcaoInvalida;

public class ListaDeArranjos {
	public static void listaDeArranjos() {
		Scanner ler = new Scanner(System.in);
		boolean sair = false;
		while (!sair) {
			System.out.println("\n === TAD Lista de Arranjo === \n");
			System.out.println("1. Defini��o");
			System.out.println("2. Usar");
			System.out.println("0. Sair");
			System.out.print("Escolha das Op��es: ");
			int opc = ler.nextInt();

			switch (opc) {
			case 1: {
				System.out.println("\n === Defini��o === \n"
						+ "A Lista de Arranjo � um conjunto / vetor S de N elementos, onde cada elemento est� "
						+ "armazenado no intervalo [0, N - 1] de modo que o primeiro elemento seja o �ndice 0, o segundo �ndice 1, "
						+ "o terceiro �ndice 2, e assim por diante. Sendo que o �ltimo elemento possui o �ndice N-1\n"
						+ "\n=== Inser��o === \n"
						+ "A inser��o de S � feita pelo m�todo add (x, i), onde o elemento x � adicionado ao �ndice i de S tal que i> = 0 ei <= N.\n"
						+ "\n=== Remo��o === \n"
						+ "A remo��o em S � feita pelo m�todo remove (i), onde i � o �ndice do elemento a ser removido em S, tal que i> = 0 ei <= N.\n"
						+ "\n=== Visualiza��o === \n"
						+ "A visualiza��o dos elementos de S s�o feitas dentro de chaves e separando cada elemento por uma virgula.\n"
						+ "Ex: (2, 4, 6, 8, 10)\n");
				break;
			}
			case 2: {
				boolean voltar = false;
				ArrayIndexList<Integer> lista = new ArrayIndexList<Integer>();

				while (!voltar) {
					System.out.println("\n1. Adicionar um elemento");
					System.out.println("2. Remover um elemento");
					System.out.println("3. Visualizar Lista");
					System.out.println("0. Voltar");
					System.out.print("Escolha das Op��es: ");
					int opcTest = ler.nextInt();

					switch (opcTest) {
					case 1: {
						System.out.print("\nDigite um numero que ser� inserido: ");
						int elemento = ler.nextInt();
						System.out.print("Digite qual ser� a  posi��o de desse elemento na lista: ");
						int posicao = ler.nextInt();

						lista.add(elemento, posicao);

						System.out.println("\nO elemento " + elemento + " foi adicionado com sucesso!");
						break;
					}
					case 2: {
						if (!lista.isEmpty()) {
							System.out.print("\nDigite o Indice do elemento que vai ser removido: ");
							int indice = ler.nextInt();

							int removido = lista.remove(indice);
							System.out.println("\nElemento " + removido + " foi removido com sucesso!\n");
						} else {
							System.out.println("\nA Lista est� vazia.");
							System.out.println("\nSe quiser usar est� fun��o voc� deve inserir valores.");
						}
						break;
					}
					case 3: {
						System.out.println("\n" + lista.toString());
						break;
					}
					case 0: {
						System.out.println("Tem certeza que deseja voltar?   (Sim/Nao)");
						char respSair;
						respSair = ler.next().toUpperCase().charAt(0);
						if (respSair == 'S')
							voltar = true;
						else
							voltar = false;
						break;
					}
					default:
						OpcaoInvalida();
						break;
					}
				}
				break;
			}
			case 0: {
				System.out.println("Tem certeza que deseja sair?   (Sim/Nao)");
				char respSair;
				respSair = ler.next().toUpperCase().charAt(0);
				if (respSair == 'S')
					sair = true;
				else
					sair = false;
				break;
			}
			default:
				OpcaoInvalida();
				break;
			}
		}
	}
}
