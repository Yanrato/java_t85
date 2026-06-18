package aula_06_collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExeFila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		Scanner leia = new Scanner(System.in);

		boolean sair = false;
		while (!sair) {
			System.out.println("\n******************************************************************");
			System.out.println("             1 - Adicionar Cliente na Fila");
			System.out.println("             2 - Listar Todos os Clientes");
			System.out.println("             3 - Retirar Cliente da Fila");
			System.out.println("             0 - Sair");
			System.out.println("\n******************************************************************");
			System.out.print("Entre com a opção deseada: ");
			int opcao = leia.nextInt();

			switch (opcao) {
			case 1:

				System.out.println("\nOpção 1 - Adicionar Cliente a fila");
				System.out.print("\nDigite o nome do Cliente: ");
				String novoCliente = leia.next();
				fila.add(novoCliente);
				System.out.println("\nFila: ");
				for (var cliente : fila) {
					System.out.println( cliente);
				}
				System.out.println("\nCliente Adicionado!");
				break;

			case 2:

				System.out.println("\n Opção 2 - Listar Todos os Clientes");
				if (fila.isEmpty()) {
					System.out.println("A Fila está vazia!");
				} else {
					System.out.println("\nFila: ");
					for (var cliente : fila) {
						System.out.println( cliente);
					}
				}

				break;

			case 3:

				if (fila.isEmpty()) {
					System.out.println("\nA Fila está vazia!");
				} else {
					System.out.println("\nOpção 3 - Retirar Cliente da Fila");
					System.out.println("\n" + fila.peek() + " será chamado");
					System.out.print("Quer continuar? (S/N): ");

					String SN = leia.next();

					if (SN.equalsIgnoreCase("S")) {
						System.out.println("\n" + fila.peek() + " foi Chamado!");
						fila.remove();
						System.out.println("\nFila Atualizada: ");
						for (var cliente : fila) {
							System.out.println( cliente);
						}
					}
				}
				break;

			case 0:

				System.out.println("\nOpção 0 - Sair");
				System.out.println("\nPrograma Finalizado!");
				sair = true;
				break;

			default:
				System.out.println("Opção Inválida!!");

			}

		}
		leia.close();
	}
}
