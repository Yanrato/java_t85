package aula_03_condicionais;

import java.util.Scanner;

public class Exe06Ls2 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("***Reajuste Salarial***");

        System.out.println("Digite seu nome completo: ");
        String nome = leia.nextLine();

        System.out.println("*****************************************");
        System.out.println("                 CARGOS                  ");
        System.out.println("*****************************************");
        System.out.println("1 - Gerente");
        System.out.println("2 - Vendedor");
        System.out.println("3 - Supervisor");
        System.out.println("4 - Motorista");
        System.out.println("5 - Estoquista");
        System.out.println("6 - Técnico de TI");
        System.out.println("*****************************************");

        System.out.println("Digite o número do seu cargo: ");
        int cargo = leia.nextInt();

        System.out.println("Digite o valor do seu salário: ");
        float salario = leia.nextFloat();

        float novoSalario = 0;
        String nomeCargo = "";

        switch (cargo) {
            case 1:
                nomeCargo = "Gerente";
                novoSalario = salario + (salario * 0.10f);
                break;

            case 2:
                nomeCargo = "Vendedor";
                novoSalario = salario + (salario * 0.07f);
                break;

            case 3:
                nomeCargo = "Supervisor";
                novoSalario = salario + (salario * 0.09f);
                break;

            case 4:
                nomeCargo = "Motorista";
                novoSalario = salario + (salario * 0.06f);
                break;

            case 5:
                nomeCargo = "Estoquista";
                novoSalario = salario + (salario * 0.05f);
                break;

            case 6:
                nomeCargo = "Técnico de TI";
                novoSalario = salario + (salario * 0.08f);
                break;

            default:
                System.out.println("Cargo inválido!");
                leia.close();
                return;
        }

        System.out.println("\n*****************************************");
        System.out.printf("Nome do colaborador: %s%n", nome);
        System.out.printf("Cargo: %s%n", nomeCargo);
        System.out.printf("Novo salário: R$ %.2f%n", novoSalario);

        leia.close();
    }
}