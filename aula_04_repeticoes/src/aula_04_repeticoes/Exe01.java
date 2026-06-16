package aula_04_repeticoes;

import java.util.Scanner;

public class Exe01 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int numero1, numero2;

        System.out.print("Digite o primeiro número do intervalo: ");
        numero1 = leia.nextInt();

        System.out.print("Digite o último número do intervalo: ");
        numero2 = leia.nextInt();

        if (numero1 >= numero2) {

            System.out.println("\nIntervalo inválido!");

        } else {

            System.out.println("\nNo Intervalo entre " + numero1 + " e " + numero2 + ":");

            for (int contador = numero1; contador <= numero2; contador++) {

                if (contador % 3 == 0 && contador % 5 == 0) {
                    System.out.println(contador + " é múltiplo de 3 e 5");
                }

            }
        }

        leia.close();
    }
}