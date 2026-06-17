package aula_06_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exe04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Set<Integer> numeros = new HashSet<>(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));

		System.out.print("Digite um número: ");
		int numero = leia.nextInt();

		boolean encontrado = false;

		for (Integer n : numeros) {

			if (n == numero) {
				encontrado = true;
			}
		}

		if (encontrado) {
			System.out.println("O número " + numero + " foi encontrado!");
		} else {
			System.out.println("O número " + numero + " não foi encontrado!");
		}

		leia.close();
	}
}