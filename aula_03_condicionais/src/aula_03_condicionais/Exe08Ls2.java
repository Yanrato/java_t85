package aula_03_condicionais;

import java.util.Scanner;

public class Exe08Ls2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float saldo = 1000.00f;
		
		System.out.println("*** Banco Lavagem de dinheiro S2 Vorcaro ***");
		System.out.println("Bem-vindo ao Banco Lavagem de dinheiro S2 Vorcaro");
		System.out.println("Onde seu dinheiro esta sempre protegido, no meu bolso");
		
		System.out.println("*****************************************");
		System.out.println("   Digite a operacao  - Evite sacar S2   ");
		System.out.println("*****************************************");
		System.out.println(" ");
		System.out.println("          1 - Saldo");
		System.out.println("          2 - Saque");
		System.out.println("          3 - Deposito");
		System.out.println(" ");
		System.out.println("*****************************************");
		
		System.out.println(": ");
		int operacao = leia.nextInt();
		
		String nomeOperacao = "";
		
		switch (operacao) {
		case 1:
			nomeOperacao = "Saldo";
			System.out.printf("Nome da operacao: %s",nomeOperacao);
			System.out.printf("Saldo: R$%.2f", saldo);
			break;
		case 2:
			nomeOperacao = "Saque";
			System.out.printf("Nome da operacao: %s",nomeOperacao);
			System.out.println("\nDigite o valor do saque: ");
			float saque = leia.nextFloat();
			if (saque>saldo) {
				System.out.println("Saldo insuficiente");
			} else {
				saldo = saldo-saque;
				System.out.printf("Saque Efetuado! \nSaldo Atual R$%.2f", saldo);
			}
		break;
		case 3: 
			nomeOperacao = "Deposito";
			System.out.printf("Nome da operacao: %s",nomeOperacao);
			System.out.printf("\nDigite valor a ser depositado: ");
			float deposito = leia.nextFloat();
			saldo = saldo + deposito;
			System.out.printf("Saldo atual: R$%.2f", saldo);
		break;
		
		default:
			System.out.print("operacao invalida!");
		
		}
		
	}

}
