package infra;

import java.util.EmptyStackException;
import java.util.Scanner;

import tad_pilha_LSE.classes.NodeStack;

import static principal.Main.OpcaoInvalida;

public class PilhaLSE {
	public static void pilhaLSE() {
		Scanner ler = new Scanner(System.in);
		boolean sair = false;
		while (!sair) {
			System.out.println("\n === TAD Pilha LSE (Lista Simplesmente Encadeada) === \n");
			System.out.println("1. Defini��o");
			System.out.println("2. Usar");
			System.out.println("0. Sair");
			System.out.print("Escolha das Op��es: ");
			int opc = ler.nextInt();
			switch (opc) {
			case 1: {
				System.out.println("\n === Defini��o === \n"
						+ "Uma pilha P � uma estrutura de dados b�sica, que segue o principio FIFO (First In, Last Out -> Primeiro a entrar, �ltimo a sair)"
						+ "\n=== Inser��o === \n"
						+ "A inser��o de x � feita pelo m�todo push(x), onde o elemento x � adicionado no topo da lista, sendo que se a "
						+ "pilha estiver vazia o elemento digitado ser� a base." + "\n=== Remo��o === \n"
						+ "A remo��o � feita pelo m�todo pop, onde ele sempre vai excluir o elemento que est� no top da pilha.\n"
						+ "\n=== Visualiza��o === \n"
						+ "A visualiza��o dos elementos s�o feitas dentro de chaves e separando cada elemento por uma virgula.\n"
						+ "Ex: [E, D, C, B, A]\n");
				break;
			}
			case 2: {
				boolean voltar = false;
				NodeStack<Integer> pilha = new NodeStack<Integer>();

				while (!voltar) {
					System.out.println("\n1. Adicionar um elemento");
					System.out.println("2. Remover o ultimo elemento");
					System.out.println("3. Visualizar Pilha Completa");
					System.out.println("4. Visualizar topo da Pilha");
					System.out.println("0. Voltar");
					System.out.print("Escolha das Op��es: ");
					int opcTest = ler.nextInt();

					switch (opcTest) {
					case 1: {
						System.out.print("\nDigite um numero que ser� inserido: ");
						int elemento = ler.nextInt();

						pilha.push(elemento);

						System.out.println("\nO elemento " + elemento + " foi adicionado com sucesso!");
						break;
					}
					case 2: {
						try {
							int removido = pilha.pop();
							System.out.println("\nElemento " + removido + " foi removido com sucesso!\n");
						} 
						catch (EmptyStackException e) {
							System.out.println(e);
						}
						break;
					}
					case 3: {
						try {
							System.out.println("\n" + pilha.toString());
						} 
						catch (EmptyStackException e) {
							System.out.println(e);
						}
						break;
					}
					case 4: {
						try {
							System.out.println("\n" + pilha.top());
						} 
						catch (EmptyStackException e) {
							System.out.println(e);
						}
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