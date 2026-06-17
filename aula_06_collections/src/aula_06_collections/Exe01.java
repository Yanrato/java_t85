package aula_06_collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<String>();

		for (int contador = 0; contador < 5; contador++) {
			System.out.print("Digite 5 cores: ");
			String cor = leia.next();

			cores.add(cor);
		}

		System.out.println("\nListar todas as cores: ");

		for (String lista : cores) {
			System.out.printf(lista + "\n");
		}

		cores.sort(null);

		System.out.println("\nOrdenar as cores: ");
		
		for (String crescente : cores) {
			System.out.println(crescente);
		}

		leia.close();
	}

}
