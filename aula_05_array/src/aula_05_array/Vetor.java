package aula_05_array;

import java.util.Arrays;
import java.util.Scanner;

public class Vetor {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        // Vetor inicializado com dados
        int vetorInteiros[] = {10, 20, 70, 45, 78, 100, 35, 71};

        // Vetor vazio
        float vetorReal[] = new float[5];

        // Listar todos os dados do vetor de inteiros
        for (int contador = 0; contador < vetorInteiros.length; contador++) {
            System.out.printf("vetorInteiros[%d] = %d%n", contador, vetorInteiros[contador]);
        }

        System.out.println("Tamanho do vetor de Inteiros: " + vetorInteiros.length);

        // Ler os valores reais
        for (int contador = 0; contador < vetorReal.length; contador++) {
            System.out.printf("Digite um valor real para a posição [%d]: ", contador);
            vetorReal[contador] = leia.nextFloat();
        }

        // Ordenar o vetor em ordem crescente (muda a ordem no vetor)
        Arrays.sort(vetorReal);

        System.out.println("\nVetor ordenado em ordem decrescente:");

        // Exibir em ordem decrescente, nao muda a posica dos elementos no vetor
        for (int contador = vetorReal.length - 1; contador >= 0; contador--) {
            System.out.printf("vetorReais[%d] = %.2f%n", contador, vetorReal[contador]);
        }

        System.out.println("Tamanho do vetor de Reais: " + vetorReal.length);

        leia.close();
    }
}