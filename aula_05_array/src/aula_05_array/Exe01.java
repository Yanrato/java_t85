package aula_05_array;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int vetorN[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		
		System.out.println("Digite um número inteiro: ");
		int numeroX = leia.nextInt();
		
		boolean encontrado = false;
		
		for (int contador = 0; contador < vetorN.length; contador ++) {
			
			
			if (vetorN[contador] == numeroX) {
				System.out.printf("numero %d encontrado na posição: %d", numeroX, contador);
				encontrado = true;
			}
			
			
		}
		
		if (!encontrado) {
			System.out.printf("Numero %d nao encontrado no vetor", numeroX);}
			
		
		leia.close();
	}

}
