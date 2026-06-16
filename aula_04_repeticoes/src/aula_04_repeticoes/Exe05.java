package aula_04_repeticoes;

import java.util.Scanner;

public class Exe05 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int contador = 1, soma = 0;
		
		do {
			System.out.println("Digite números inteiros, para parar digite 0: ");
			int numero = leia.nextInt();
			if (numero == 0) {
				contador--;
			} else if (numero > 0) {
				soma += numero;
			}
		} while(contador !=0);
		
		System.out.println("A soma dos números positivos é: " + soma);
		leia.close();
	}

}
