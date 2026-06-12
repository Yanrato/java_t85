package aula_02_operadores;

import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double nota1, nota2, nota3, nota4;
		
		System.out.println("***Será que passei?***");
		
		System.out.print("Digite sua primeira nota: ");
		nota1 = leia.nextDouble();
		
		System.out.print("Digite sua segunda nota: ");
		nota2 = leia.nextDouble();
		
		System.out.print("Digite sua terceira nota: ");
		nota3 = leia.nextDouble();
		
		System.out.print("Digite sua quarta nota: ");
		nota4 = leia.nextDouble();
		
		System.out.printf("Media: %.2f",(nota1 + nota2 + nota3 + nota4)/4 );
		
		System.out.print("\n Eai passou?");
	}

}
