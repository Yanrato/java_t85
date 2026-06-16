package aula_03_condicionais;

import java.util.Scanner;

public class Exe07Ls2 {

	public static void main(String[] args) {

			
			Scanner leia = new Scanner(System.in);
			
			double numero1, numero2;
			
			System.out.println("*** Calculadora ***");
			
			System.out.print("Digite o primeiro numero: ");
			numero1 = leia.nextDouble();
			
			System.out.print("Digite o segundo numero: ");
			numero2 = leia.nextDouble();
			
			System.out.println("*****************************************");
			System.out.println("                 Calculadora                ");
			System.out.println("*****************************************");
			System.out.println(" ");
			System.out.println("          1 - Adição");
			System.out.println("          2 - Subtração");
			System.out.println("          3 - Multiplicação");
			System.out.println("          4 - Divisão");
			System.out.println(" ");
			System.out.println("*****************************************");

			System.out.println("Digite o número da operação: ");
			int operacao = leia.nextInt();
			
			switch (operacao) {
			case 1:
				System.out.print("Adição");
				System.out.printf("\n %.2f + %.2f = %.2f", numero1, numero2, numero1 + numero2);
				break;
			case 2:
				System.out.print("Subtração");
				System.out.printf("\n %.2f - %.2f = %.2f", numero1, numero2, numero1 - numero2);
			break;
			case 3: 
				System.out.print("Multiplicação");
				System.out.printf("\n %.2f X %.2f = %.2f", numero1, numero2, numero1 * numero2);
			break;
			case 4:
				System.out.print("Divisão");
				System.out.printf("\n %.2f / %.2f = %.2f", numero1, numero2, numero1 / numero2);
				break;
			default:
				System.out.print("operacao invalida!");
			
			}
			leia.close();

		}

	
	}


