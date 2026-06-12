package aula_02_operadores;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double salario, noturno, extras, desconto; 
		
		System.out.println("***Vou ganhar quanto?***");
		
		System.out.print("Digite o valor do seu salario bruto: ");
		salario = leia.nextDouble();
		
		System.out.print("Digite o valor do adcional noturno: ");
		noturno = leia.nextDouble();
		
		System.out.print("Digite o valor das horas extras: ");
		extras = leia.nextDouble();
		
		System.out.print("Digite o valor do desconto: ");
		desconto = leia.nextDouble();
		
		System.out.printf("Você irá receber: %.2f", (salario + noturno + extras)-desconto);
		
	}

}
