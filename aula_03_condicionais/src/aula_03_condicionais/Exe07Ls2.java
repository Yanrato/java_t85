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
			System.out.println("          1 - Adicao");
			System.out.println("          2 - subtracao");
			System.out.println("          3 - multiplicacao");
			System.out.println("          4 - divisao");
			System.out.println(" ");
			System.out.println("*****************************************");

			System.out.println("Digite o numero da operacao: ");
			int operacao = leia.nextInt();
			
			switch (operacao) {
			case 1:
				System.out.print("Adicao");
				System.out.printf("\n %.2f + %.2f = %.2f", numero1, numero2, numero1 + numero2);
				break;
			case 2:
				System.out.print("Subtracao");
				System.out.printf("\n %.2f - %.2f = %.2f", numero1, numero2, numero1 - numero2);
			break;
			case 3: 
				System.out.print("Adicao");
				System.out.printf("\n %.2f X %.2f = %.2f", numero1, numero2, numero1 * numero2);
			break;
			case 4:
				System.out.printf("\n %.2f / %.2f = %.2f", numero1, numero2, numero1 / numero2);
				break;
			default:
				System.out.print("operacao invalida!");
			
			}
			leia.close();

		}

	
	}


