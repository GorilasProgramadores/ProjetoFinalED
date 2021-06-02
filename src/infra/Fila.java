package infra;

import static principal.Main.OpcaoInvalida;

import java.util.EmptyStackException;
import java.util.Scanner;
import tad_fila.classes.ArrayQueue;


public class Fila {
	public static void fila() {
		Scanner ler = new Scanner(System.in);
		boolean sair = false;
		while (!sair) {
			System.out.println("\n === TAD Fila === \n");
			System.out.println("1. Defini��o");
			System.out.println("2. Usar");
			System.out.println("0. Sair");
			System.out.print("Escolha das Op��es: ");
			int opc = ler.nextInt();

			switch (opc) {
			case 1: {
				System.out.println("\n === Defini��o === \n"
						+ "Uma Fila � uma estrutura de dados b�sica, que segue o principio FIFO (First-In, First-Out -> Primeiro a entrar, Primeiro a sair).\n"
						+ "\n=== Inser��o === \n"
						+ "A inser��o de x � feita pelo m�todo enqueue(x), onde o elemento x � adicionado no final da fila, sendo que se a \n"
						+ "fila estiver vazia o elemento digitado ser� a base."
						+ "\n=== Remo��o === \n"
						+ "A remo��o � feita pelo m�todo pop, onde ele sempre vai excluir o elemento que est� no top da pilha.\n"
						+ "\n=== Visualiza��o === \n"
						+ "A visualiza��o dos elementos s�o feitas dentro de chaves e separando cada elemento por uma virgula.\n"
						+ "Ex: [1, 2, 3, 4, 5]\n");
				break;
			}
			case 2: {
				boolean voltar = false;
				ArrayQueue<Integer> fila = new ArrayQueue<Integer>();

				while (!voltar) {
					System.out.println("\n1. Adicionar um elemento");
					System.out.println("2. Remover um elemento");
					System.out.println("3. Visualizar Fila");
					System.out.println("0. Voltar");
					System.out.print("Escolha das Op��es: ");
					int opcTest = ler.nextInt();

					switch (opcTest) {
					case 1: {
						System.out.print("\nDigite um numero que ser� inserido: ");
						int elemento = ler.nextInt();
						
						fila.enqueue(elemento);

						System.out.println("\nO elemento " + elemento + " foi adicionado com sucesso!");
						break;
					}
					case 2: {
						try {
							int removido = fila.dequeue();
							System.out.println("\nElemento " + removido + " foi removido com sucesso!\n");
						} 
						catch (EmptyStackException e) {
							System.out.println(e);
						}
						break;
					}
					case 3: {
						System.out.println("\n" + fila.toString());
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