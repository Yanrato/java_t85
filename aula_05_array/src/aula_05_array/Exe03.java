package aula_05_array;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int matrizX[][] = new int[3][3];
		
		for (int linha = 0; linha < matrizX.length; linha++) {

			for (int coluna = 0; coluna < matrizX[linha].length; coluna++) {
				System.out.printf("Digite um número para a posição [%d][%d]", linha, coluna);
				matrizX[linha][coluna] = leia.nextInt();
			}
		}
		
		System.out.println("Elementos da Diagonal Principal: " + matrizX[0][0] + " " + matrizX[1][1] + " " + matrizX[2][2]);
		
		System.out.println("Elementos da Diagonal Secundaria: " + matrizX[0][2] + " " + matrizX[1][1] + " " + matrizX[2][0]);
		
		System.out.println("Soma dos Elementos da Diagonal Principal: " + (matrizX[0][0] + matrizX[1][1] + matrizX[2][2]));
		
		System.out.println("Soma dos Elementos da Diagonal Secundaria: " + (matrizX[0][2] + matrizX[1][1] + matrizX[2][0]));
	}

}
