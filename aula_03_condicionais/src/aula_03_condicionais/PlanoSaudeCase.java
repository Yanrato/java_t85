package aula_03_condicionais;

import java.util.Scanner;

public class PlanoSaudeCase {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String nome;
		int faixaEtaria;

		System.out.print("Digite seu nome: ");
		nome = leia.next();

		System.out.println("*****************************************");
		System.out.println("               Faixa Etaria              ");
		System.out.println("*****************************************");
		System.out.println(" ");
		System.out.println("          1 - De 0 a 10 anos de idade    ");
		System.out.println("          2 - De 11 a 29 anos de idade   ");
		System.out.println("          3 - De 30 a 45 anos de idade   ");
		System.out.println("          4 - De 36 a 59 anos de idade   ");
		System.out.println("          5 - De 60 a 65 anos de idade   ");
		System.out.println("          6 - Maiores de 60 anos         ");
		System.out.println(" ");
		System.out.println("*****************************************");

		System.out.print("Digite a sua faixa etaria: ");
		faixaEtaria = leia.nextInt();

		switch (faixaEtaria) {
		case 1:
			System.out.println("A mensalidade do plano e R$ 100,00");
			break;
		case 2:
			System.out.println("A mensalidade do plano e R$ 200,00");

			break;
		case 3:
			System.out.println("A mensalidade do plano e R$ 300,00");

			break;
		case 4:
			System.out.println("A mensalidade do plano e R$ 500,00");

			break;
		case 5:
			System.out.println("A mensalidade do plano e R$ 600,00");

			break;
		case 6:
			System.out.println("A mensalidade do plano e R$ 1000,00");

			break;
		default:
			System.out.println("Opcao invalida!");
		}

		leia.close();
	}
}