package aula_04_repeticoes;

import java.util.Scanner;

public class tabuadafor {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero;

		System.out.println("Digite um número inteiro: ");
		numero = leia.nextInt();

		for (int contador = 1; contador <= 10; contador++)
			System.out.printf("%d X %d = %d\n", numero, contador, numero * contador);

		leia.close();

	}

}
