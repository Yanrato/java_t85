package aula_06_collections;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));

		System.out.println("Digite um número: ");
		int numero = leia.nextInt();
		
		boolean encontrado = false;

		for (int i = 0; i < numeros.size(); i++) {

            if (numero == numeros.get(i)) {
                System.out.printf( "O número %d está localizado na posição: %d", numero, i );
                encontrado = true;
                
            }
        }

        if (!encontrado) {
            System.out.printf("O número %d não foi encontrado!",numero);
        }

		leia.close();
	}
}