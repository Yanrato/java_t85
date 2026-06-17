package aula_05_array;

import java.util.Scanner;

public class Exe02 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int vetorX[] = new int[10];
        
        //coleta denumeros para vetorX 
        for (int contador = 0; contador < vetorX.length; contador++) {
            System.out.print("Digite um número: ");
            vetorX[contador] = leia.nextInt();
        }

        System.out.print("Elementos nos índices ímpares: ");
        //printa na tela os numeros com indices impares (1,3,5,7,9)
        for (int contadorImp = 1; contadorImp < vetorX.length; contadorImp += 2) {
            System.out.print(vetorX[contadorImp] + " ");
        }
        
        System.out.print("\nElementos pares: ");
        //printa os numeros pares
        for (int contadorPar = 0; contadorPar < vetorX.length; contadorPar++) {
        	if(vetorX[contadorPar] % 2 == 0) {
        		System.out.print(vetorX[contadorPar] + " ");
        	}
        }

        //criei uma variavel soma antes do for para poder somar os valores do vetor
        int soma = 0;
        for (int contadorSoma = 0; contadorSoma < vetorX.length; contadorSoma++) {
        	soma += vetorX[contadorSoma];
        }
        System.out.printf("Soma dos Elementos: %d\n", soma);
        //aqui troca o valor para float e mostra o resultado da media 
        System.out.printf("Média: %.2f", (float)soma/vetorX.length);
        leia.close();
    }
}