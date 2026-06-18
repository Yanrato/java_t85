package aula_06_collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ExePilha {

    public static void main(String[] args) {

        Deque<String> pilha = new ArrayDeque<>();

        Scanner leia = new Scanner(System.in);

        boolean sair = false;

        while (!sair) {

            System.out.println("\n******************************************************************");
            System.out.println("             1 - Adicionar Livro na Pilha");
            System.out.println("             2 - Listar Todos os Livros");
            System.out.println("             3 - Retirar Livro da Pilha");
            System.out.println("             0 - Sair");
            System.out.println("******************************************************************");
            System.out.print("Entre com a opção desejada: ");

            int opcao = leia.nextInt();
            leia.nextLine(); // Limpa o buffer

            switch (opcao) {

            case 1:

                System.out.println("\nOpção 1 - Adicionar Livro na Pilha");
                System.out.print("\nDigite o nome do Livro: ");

                String novoLivro = leia.nextLine();

                pilha.push(novoLivro);

                System.out.println("\nPilha:");

                Object[] livros1 = pilha.toArray();

                for (Object livro : livros1) {
                    System.out.println(livro);
                }

                System.out.println("\nLivro Adicionado!");
                break;

            case 2:

                System.out.println("\nOpção 2 - Listar Todos os Livros");

                if (pilha.isEmpty()) {
                    System.out.println("A Pilha está vazia!");
                } else {

                    System.out.println("\nPilha:");

                    Object[] livros2 = pilha.toArray();

                    for (Object livro : livros2) {
                        System.out.println(livro);
                    }
                }

                break;

            case 3:

                if (pilha.isEmpty()) {

                    System.out.println("\nA Pilha está vazia!");

                } else {

                    System.out.println("\nOpção 3 - Retirar Livro da Pilha");

                    String removido = pilha.pop();

                    System.out.println("\nLivro removido: " + removido);

                    System.out.println("\nPilha:");

                    Object[] livros3 = pilha.toArray();

                    for (Object livro : livros3) {
                        System.out.println(livro);
                    }

                    System.out.println("\nUm Livro foi retirado da Pilha!");
                }

                break;

            case 0:

                System.out.println("\nPrograma Finalizado!");
                sair = true;
                break;

            default:

                System.out.println("\nOpção Inválida!");
            }
        }

        leia.close();
    }
}