package aula_05_array;

import java.util.Scanner;

public class Exe04 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        float notas[][] = new float[10][4];
        float medias[] = new float[10];

        // Leitura das notas
        for (int aluno = 0; aluno < 10; aluno++) {

            System.out.println("\nAluno " + (aluno + 1));

            float soma = 0;

            for (int bimestre = 0; bimestre < 4; bimestre++) {

                System.out.print("Digite a nota do " + (bimestre + 1) + "º bimestre: ");
                notas[aluno][bimestre] = leia.nextFloat();

                soma += notas[aluno][bimestre];
            }

            medias[aluno] = soma / 4;
        }

        // Exibição das médias
        System.out.println("\nMédias dos participantes:");

        for (int aluno = 0; aluno < medias.length; aluno++) {
            System.out.printf("Participante %d: %.1f%n",
                    aluno + 1, medias[aluno]);
        }

        leia.close();
    }
}