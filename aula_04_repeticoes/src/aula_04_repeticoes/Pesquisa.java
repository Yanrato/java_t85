package aula_04_repeticoes;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int idade, esporte, futebol = 0, voleiM18 = 0, totalRespostas = 0, somaIdades = 0;
		float mediaIdades;
		char continua = 'S';

		while (continua == 'S') {
			System.out.println("************************************************");
			System.out.println("***    Pesquisa sobre Esportes Favoritos     ***");
			System.out.println("************************************************");

			System.out.print("Digite sua idade: ");
			idade = leia.nextInt();

			do {
				System.out.println("Escolha seu Esporte Favorito");
				System.out.println("1 - Futbol");
				System.out.println("2 - voleibol");
				System.out.println("3 - basquetebol");
				System.out.println("4 - outros");
				esporte = leia.nextInt();
			} while (esporte < 1 || esporte > 4);
			totalRespostas++;
			somaIdades += idade;
			
			if(esporte == 1) 
				futebol++;
			
			if(idade>19 && esporte ==2)
				voleiM18++;
				
			do {
				System.out.println("Deseja continuar? (S/N)");
				continua = leia.next().toUpperCase().charAt(0);
			} while (!(continua == 'S') && !(continua == 'N'));
		}

		mediaIdades = somaIdades / totalRespostas;
		
		System.out.printf("futebol: %d\n", futebol);
		System.out.printf("volei %d", voleiM18);
		System.out.printf("\nMédia das idades: %.2f\n", mediaIdades);

		leia.close();

	}

}
