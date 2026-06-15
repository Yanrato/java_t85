package aula_03_condicionais;

import java.util.Scanner;

public class Exe02Ls1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Par ou impar? Positivo ou Negativo?");
		
		System.out.println("Digite um número inteiro: ");
		int n1= leia.nextInt();
		
		if(n1%2 == 0 && n1 >= 0) {
			System.out.printf("%d é um número par e positivo!",n1);
		} else if(n1%2 == 0 && n1 < 0) {
			System.out.printf("%d é um número par e negativo!",n1);
		} else if(n1%2 != 0 && n1 >= 0) {
			System.out.printf("%d é um número impar e positivo!",n1);
		} else if(n1%2 != 0 && n1 < 0) {
			System.out.printf("%d é um número impar e negativo!",n1);
		} else {
			System.out.println("Valor inválido");
		}
	}

}
