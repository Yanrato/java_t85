package aula_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {

	static Scanner ler = new Scanner(System.in);
	static boolean loop = true;
	public static void main(String[] args) {
		
		int dividendo = 0;
		int divisor = 0;
		do {
		try {	
		System.out.println("Digite o Dividendo: ");
		dividendo = ler.nextInt();
				
		System.out.println("Digite o Divisor: ");
		divisor = ler.nextInt();
				
		divide(dividendo, divisor);
		loop = false;
		} catch (InputMismatchException e) {
			System.err.println("Erro de digitação: " + e.getMessage());
		} catch (ArithmeticException e) {
			System.err.println("Erro de calculo: " + e.getMessage());
		} finally {
			System.out.println("Serei executado independente de dar certo ou não!");
		}
		}while(loop);
	}

	public static void divide(int dividendo, int divisor) {
		System.out.println("Divisão = " + (dividendo / divisor));
	}

}
