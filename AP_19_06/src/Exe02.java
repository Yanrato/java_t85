import java.util.ArrayList;
import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {

		//defini fora do do while para nao dar problema
		Scanner leia = new Scanner(System.in);
		int soma = 0, opcao = 0, novaIdade = 0;
		float novaNota = 0.0f;
		//aqui faz a conexao da class que criei em outro arquivo e salva no array
		ArrayList<Aluno> alunos = new ArrayList<>();
		
		//pra repetir o menu até digitar 4
		do {
			System.out.println("\n************Escola dos xarope************");
			System.out.println("     1 - Adicionar um aluno a uma coleção");
			System.out.println("     2 - Listar todos os alunos");
			System.out.println("     3 - Calcular a média geral das notas");
			System.out.println("     4 - Sair");
			System.out.println("*****************************************");
			System.out.println("\nDigite a opção deseada: ");
			opcao = leia.nextInt();

			//switch para direcionar as opcoes
			switch (opcao) {

			case 1:
				boolean continuar = true;
				//continuara dando opcao de inserir aluno até continuar = false 
				while (continuar) {

					boolean confirmaDados = false;
					
					//esse while e para confirmar se os dados estao corretos antes de salvar
					while (!confirmaDados) {

						System.out.print("Digite o nome do aluno: ");
						String novoNome = leia.next();

						//para nao deixar idade menor que 0
						boolean validaIdade = false;
						while (!validaIdade) {
							System.out.print("Digite a idade: ");
							novaIdade = leia.nextInt();
							if (novaIdade > 0) {
								validaIdade = true;
							} else {
								System.out.println("Digite uma idade válida: ");
								validaIdade = false;
							}
						}
						
						//para nao ter notar maiores que 10 e menores que 0
						boolean validaNota = false;
						while(!validaNota) {
						System.out.print("Digite a nota: ");
						novaNota = leia.nextFloat();
						if(novaNota <= 10 && novaNota >= 0) {
							validaNota = true;
						} else {
							System.out.println("Digite uma nota válida\n");
						}
						}

						//confirmar os dados antes de salvar
						System.out.println("\nConfirme os dados:");
						System.out.println("Nome: " + novoNome);
						System.out.println("Idade: " + novaIdade);
						System.out.println("Nota Final: " + novaNota);

						System.out.print("\nOs dados estão corretos? (S/N): ");
						String sn = leia.next();

						if (sn.equalsIgnoreCase("S")) {

							Aluno aluno = new Aluno(novoNome, novaIdade, novaNota);
							alunos.add(aluno);
							soma += novaNota;
							confirmaDados = true;
						}
					}

					System.out.print("\nDeseja cadastrar outro aluno? (S/N): ");
					String resposta = leia.next();

					if (resposta.equalsIgnoreCase("N")) {
						continuar = false;
					}
				}
				break;

				//para printar os alunos cadastrados na tela
			case 2:
				//se nao tiver alunos
				if(alunos.isEmpty()) {
					System.out.println("Não tem alunos cadastrados...");
				} 
				else {
				System.out.println("\n*** ALUNOS CADASTRADOS ***");

				for (Aluno a : alunos) {
					System.out.println("Nome: " + a.nome);
					System.out.println("Idade: " + a.idade);
					System.out.println("Nota: " + a.notaFinal);
					System.out.println("-------------------");
				}}
				break;

			case 3:
				//calculo da media
				float media = (float)soma / alunos.size();
				System.out.println("Média geral das notas: " + media);
				break;

			case 4:
				System.out.println("encerrado programa...");
				break;

			default:
				System.out.println("Digite um numero válido");

			}
		} while (opcao != 4);

		leia.close();
	}
}