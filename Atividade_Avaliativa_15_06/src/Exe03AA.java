import java.util.Scanner;

public class Exe03AA {

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
		System.out.println("          5 - Potenciação");
		System.out.println("          6 - Raiz Quadrada");
		System.out.println(" ");
		System.out.println("*****************************************");

		System.out.println("Digite o numero da operacao: ");
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

		    if (numero2 != 0) {
		        System.out.printf("\n %.2f / %.2f = %.2f",
		                numero1,
		                numero2,
		                numero1 / numero2);
		    } else {
		        System.out.println("\nErro: não é possível dividir por zero.");
		    }

		    break;
		case 5:
			System.out.print("Potenciação");
			System.out.printf("\n %.2f ^ %.2f = %.2f", numero1, numero2, Math.pow(numero1, numero2 ));
			break;
		case 6:
		    System.out.print("Raiz Quadrada");

		    if (numero1 >= 0) {
		        System.out.printf("\n Raiz quadrada de %.2f = %.2f",
		                numero1,
		                Math.sqrt(numero1));
		    } else {
		        System.out.println("\nNão existe raiz quadrada real de números negativos.");
		    }

		    break;
		default:
			System.out.print("operacao invalida!");

		}
		leia.close();

	}

}
