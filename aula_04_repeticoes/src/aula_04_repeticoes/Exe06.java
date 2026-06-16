package aula_04_repeticoes;

import java.util.Scanner;

public class Exe06 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero;
		int somaMultiplos = 0;
		int quantidadeMultiplos = 0;
		float media;

		do {
			System.out.print("Digite números inteiros, para parar digite 0: ");
			numero = leia.nextInt();

			if (numero != 0 && numero % 3 == 0) {
				somaMultiplos += numero;
				quantidadeMultiplos++;
			}

		} while (numero != 0);

		if (quantidadeMultiplos > 0) {
			media = (float) somaMultiplos / quantidadeMultiplos;
			System.out.printf("A média de todos os números múltiplos de 3 é: %.2f", media);
		} else {
			System.out.println("Nenhum múltiplo de 3 foi digitado.");
		}

		leia.close();
	}
}