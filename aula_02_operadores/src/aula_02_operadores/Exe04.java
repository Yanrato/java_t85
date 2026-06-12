package aula_02_operadores;

import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double n1, n2, n3, n4;
		
		System.out.println("***Loucura***");
		
		System.out.print("Digite o primeiro valor: ");
		n1 = leia.nextDouble();
		
		System.out.print("Digite o segundo valor: ");
		n2 = leia.nextDouble();
		
		System.out.println("Digite o terceiro valor: ");
		n3 = leia.nextDouble();
		
		System.out.println("Digite o quarto valor: ");
		n4 = leia.nextDouble();
		
		System.out.printf("(%.2f X %.2f) - (%.2f X %.2f) = %.2f", n1, n2, n3, n4, (n1 * n2) - (n3 * n4));
	}

}
