import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		
		//main fica apneas para colocar a função
		analise();
	}

	public static void analise() {

		// Defini fora do main porque serão tratados só aqui
		Scanner leia = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<>();
		int soma = 0;

		// Solicita 5 números
		for (int contador = 0; contador < 5; contador++) {
			
			// caso coloquem número com virgula vai pedir para digitar de novo
			while (true) {

				try {

					System.out.printf("Digite o %dº número: ", contador + 1);

					int numero = leia.nextInt();

					numeros.add(numero);
					soma += numero;

					break; 

				} catch (InputMismatchException e) {

					System.out.println("Digite apenas números inteiros, sem vírgula!");

					leia.nextLine(); 
				}
			}
		}

		// Exibe todos números digitados com iterator
		Iterator<Integer> tudo = numeros.iterator();

		System.out.println("\nNúmeros Digitados:");

		while (tudo.hasNext()) {
			System.out.println(tudo.next());
		}

		// Obtém maior e menor numeros
		int maior = Collections.max(numeros);
		int menor = Collections.min(numeros);

		// Calcula a média com soma dividido pelo numeros de indices na collection
		float media = (float) soma / numeros.size();

		// Exibe os valores
		System.out.println("\nSoma total: " + soma);
		System.out.println("Média: " + media);
		System.out.println("Maior Valor: " + maior);
		System.out.println("Menor Valor: " + menor);

		leia.close();
	}
}