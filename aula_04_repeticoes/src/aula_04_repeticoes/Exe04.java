package aula_04_repeticoes;

import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int backend = 0;
		int mulheresFrontend = 0;
		int homensMobile40 = 0;
		int naoBinarioFull30 = 0;
		int total = 0;
		int somaIdades = 0;

		String SN = "S";

		while (SN.equalsIgnoreCase("S")) {

			System.out.print("Digite sua idade: ");
			int idade = leia.nextInt();

			somaIdades += idade;

			System.out.println("\nDigite sua Identidade de Gênero:");
			System.out.println("1 - Mulher Cis");
			System.out.println("2 - Homem Cis");
			System.out.println("3 - Não Binário");
			System.out.println("4 - Mulher Trans");
			System.out.println("5 - Homem Trans");
			System.out.println("6 - Outros");
			int genero = leia.nextInt();

			System.out.println("\nDigite a área de atuação:");
			System.out.println("1 - Backend");
			System.out.println("2 - Frontend");
			System.out.println("3 - Mobile");
			System.out.println("4 - FullStack");
			int atuacao = leia.nextInt();

			
			if (atuacao == 1) {
				backend++;
			}

			
			if ((genero == 1 || genero == 4) && atuacao == 2) {
				mulheresFrontend++;
			}

			if ((genero == 2 || genero == 5) && atuacao == 3 && idade > 40) {
				homensMobile40++;
			}

			if (genero == 3 && atuacao == 4 && idade < 30) {
				naoBinarioFull30++;
			}

			total++;

			System.out.print("\nDeseja continuar (S/N): ");
			SN = leia.next();
		}

		System.out.println("\n=====================================");
		System.out.printf("Total de pessoas desenvolvedoras Backend: %d%n", backend);
		System.out.printf("Total de Mulheres Cis e Trans desenvolvedoras Frontend: %d%n", mulheresFrontend);
		System.out.printf("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: %d%n", homensMobile40);
		System.out.printf("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: %d%n", naoBinarioFull30);
		System.out.printf("O número total de pessoas que responderam à pesquisa: %d%n", total);

		if (total > 0) {
			System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.2f%n",
					(double) somaIdades / total);
		}

		leia.close();
	}
}