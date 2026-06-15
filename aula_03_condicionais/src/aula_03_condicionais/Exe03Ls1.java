package aula_03_condicionais;

import java.util.Scanner;

public class Exe03Ls1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("***Doacao de Sangue***");

		System.out.println(
				"Primeiramente obrigado por se interessar oela doacao de sangue, essa éuma causa muito importante");

		System.out.println("Digite seu nome: ");
		String nome = leia.next();

		System.out.println("Digite sua idade: ");
		int idade = leia.nextInt();

		System.out.println("Já doou sangue antes (Responda com 'S' para sim e 'N' para nao): ");
		String resposta = leia.next();

		boolean doouAntes = resposta.equalsIgnoreCase("S");

		if (idade < 60) {
			System.out.printf("%s está apto para doar sangue!", nome);
		} else if (idade >= 60 && idade <= 69 && doouAntes == true) {
			System.out.printf("%s está apto para doar sangue!", nome);
		} else {
			System.out.printf("%s não esta apto para doar sangue", nome);
		}
		
		leia.close();
	}

}
