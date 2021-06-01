package principal;

import java.util.Scanner;
import static infra.ListaDeArranjos.listaDeArranjos;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Seja Bem-Vindo ao Sistema de ED");
		boolean sair = false;
		while(!sair) {
			int opc;

			System.out.println("Escolha das Opções: ");
			
			System.out.println("1. TAD-Lista Arranjo");
			System.out.println("2. TAD-Pilha: ");
			System.out.println("3. TAD-Fila");
			System.out.println("4. TAD-Lista de Nodos");
			System.out.println("5. TAD-Árvore Genérica");
			System.out.println("6. TAD-Árvore Binária");
			System.out.println("7. TAD-Fila de Prioridade");
			System.out.println("8. TAD-Mapa");
			System.out.println("9. TAD-Dicionário");
			System.out.println("10. TAD-Mapa Ordenado – ABB");
			System.out.println("11. TAD-Mapa Ordenado – AVL");
			System.out.println("12. TAD-Grafos");
			
			System.out.println("0. Sair");
			
			opc =  ler.nextInt();
			
			switch (opc) {
			case 1: {
				listaDeArranjos();
				break;
			}
			case 2: {
				System.out.println("2. TAD-Pilha: ");
				break;
			}
			case 3: {
				System.out.println("3. TAD-Fila");
				break;
			}
			case 4: {
				System.out.println("4. TAD-Lista de Nodos");
				break;
			}
			case 5: {
				System.out.println("5. TAD-Árvore Genérica");
				break;
			}
			case 6: {
				System.out.println("6. TAD-Árvore Binária");
				break;
			}
			case 7: {
				System.out.println("7. TAD-Fila de Prioridade");
				break;
			}
			case 8: {
				System.out.println("8. TAD-Mapa");
				break;
			}
			case 9: {
				System.out.println("9. TAD-Dicionário");
				break;
			}
			case 10: {
				System.out.println("10. TAD-Mapa Ordenado – ABB");
				break;
			}
			case 11: {
				System.out.println("11. TAD-Mapa Ordenado – AVL");
				break;
			}
			case 12: {
				System.out.println("12. TAD-Grafos");
				break;
			}
			case 0: {
				System.out.println("Tem certeza que deseja sair?   (Sim/Nao)");
				char respSair;
				respSair = ler.next().toUpperCase().charAt(0);
				if(respSair == 'S')
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
	public static void OpcaoInvalida() {
		System.out.println("Por favor digite uma opção que seja valida!!!");
	}

}
