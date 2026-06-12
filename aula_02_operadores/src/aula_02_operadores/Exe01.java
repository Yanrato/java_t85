package aula_02_operadores;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	double salario, abono;
	
	System.out.println("***Duvida de Quanto vai Receber? ***");
	
	System.out.println("Digite o valor do seu salário: ");
	salario = leia.nextDouble();
	
	System.out.println("Digite o valor do seu abono: ");
	abono = leia.nextDouble();
	
	System.out.printf("Salario: R$%.2f\nAbono: R$%.2f\nValor Total: R$%.2f", salario, abono, salario + abono);
	}

}
