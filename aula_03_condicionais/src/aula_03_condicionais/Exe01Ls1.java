package aula_03_condicionais;

import java.util.Scanner;

public class Exe01Ls1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("***Maior ou Menor?***");

		System.out.println("Digite o primeiro valor: ");
		int n1 = leia.nextInt();

		System.out.println("Digite o segundo valor: ");
		int n2 = leia.nextInt();

		System.out.println("Digite o terceiro valor: ");
		int n3 = leia.nextInt();

		if (n1 + n2 > n3) {
			System.out.printf("%d + %d = %d, que é maior que %d", n1, n2, n1 + n2, n3);
		} else if(n1 + n2 == n3){
			System.out.printf("%d + %d = %d, que é igual a %d", n1, n2, n1 + n2, n3);
		} else {
			System.out.printf("%d + %d = %d, que é menor que %d", n1, n2, n1 + n2, n3);
		} 
		
		leia.close();
	}

}
