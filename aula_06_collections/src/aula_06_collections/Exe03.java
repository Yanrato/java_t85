package aula_06_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exe03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Set<Integer> numeros = new HashSet<>();
		
		for(int contador = 0; contador < 10; contador++) {
			
			System.out.print("Digite 10 números sem repetir: ");
			int numero = leia.nextInt();
			
			numeros.add(numero);
			
		}
		
		 Iterator<Integer> iterator = numeros.iterator();
		 System.out.println("Listar dados do Set: \n");
	        while (iterator.hasNext()) {
	            System.out.println( iterator.next());
	        }
		
		
		
	}

}
