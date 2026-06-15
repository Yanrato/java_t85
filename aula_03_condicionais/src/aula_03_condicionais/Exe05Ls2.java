package aula_03_condicionais;

import java.util.Scanner;

public class Exe05Ls2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("***Lanchonete do Ratão***");

		System.out.println("*****************************************");
		System.out.println("                 Cardapio                ");
		System.out.println("*****************************************");
		System.out.println(" ");
		System.out.println("          1 - Cachorro-quente - R$10,00   ");
		System.out.println("          2 - X-Salada        - R$15,00   ");
		System.out.println("          3 - X-Bacon         - R$18,00   ");
		System.out.println("          4 - Bauru           - R$12,00   ");
		System.out.println("          5 - Refrigerante    - R$8,00    ");
		System.out.println("          6 - Suco de Laraja  - R$13,00   ");
		System.out.println(" ");
		System.out.println("*****************************************");

		System.out.println("Digite seu o numero do seu pedido: ");
		int pedido = leia.nextInt();

		switch (pedido) {
		case 1:
			System.out.println("Cachorro quente");
			pedido = 10;
			break;
		case 2:
			System.out.println("X-Salada");
			pedido = 15;
			break;
		case 3:
			System.out.println("X-Bacon");
			pedido = 18;
			break;
		case 4:
			System.out.println("Bauru");
			pedido = 12;
			break;
		case 5:
			System.out.println("Refrigerante");
			pedido = 8;
			break;
		case 6:
			System.out.println("Suco de Laranja");
			pedido = 13;
			break;
		default:
			System.out.println("Opcao invalida!");
		}

		System.out.println("Agora digite a quantidade: ");
		int quantidade = leia.nextInt();
		
		int total = pedido * quantidade;
		
		System.out.printf("o valor total é de R$%d", total);
		leia.close();
	}

}
