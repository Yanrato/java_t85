package aula_04_repeticoes;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int idade = 0, maior = 0, menor = 0;
		
		while(idade >= 0) {
			System.out.printf("Digite varias idade e para parar digite um valor negativo");
			idade = leia.nextInt();
			if(idade < 21 && idade > 0) {
				menor++;
			} else if(idade > 50){
				maior++;
			}
		}
		
		System.out.printf("\nTotal de pessoas menores de 21 anos: %d", menor);
				
		System.out.printf("\nTotal de pessoas maiores de 50 anos: %d", maior);
				
		
		leia.close();
	}

}
