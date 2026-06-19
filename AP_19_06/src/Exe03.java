import java.util.ArrayList;
import java.util.Scanner;

public class Exe03 {

	static ArrayList<Produtos> produtos = new ArrayList<>();
	
	public static void main(String[] args) {

		// defini fora do do while para nao dar problema
		Scanner leia = new Scanner(System.in);
		int opcao = 0, novaQuantidade = 0;
		
		// aqui faz a conexao da class que criei em outro arquivo e salva no array
		

		// pra repetir o menu até digitar 4
		do {
			System.out.println("\n************Loja dos xarope************");
			System.out.println("     1 - Adicionar um novo Produto");
			System.out.println("     2 - Atualizar a quantidade de um produto");
			System.out.println("     3 - listar todos os Produtos");
			System.out.println("     4 - Sair");
			System.out.println("*****************************************");
			System.out.println("\nDigite a opção deseada: ");
			opcao = leia.nextInt();

			// switch para direcionar as opcoes
			switch (opcao) {

			case 1:
				System.out.println("\nOPÇÃO 1 - ADCIONAR UM NOVO PRODUTO");

				boolean continuar = true;
				// continuara dando opcao de inserir produto até continuar = false
				while (continuar) {

					boolean confirmaDados = false;

					// esse while e para confirmar se os dados estao corretos antes de salvar
					while (!confirmaDados) {

						System.out.print("Digite o nome do produto: ");
						String novoProduto = leia.next();

						
						boolean validaQuantidade = false;
						while (!validaQuantidade) {
							System.out.print("Digite a quantidade: ");
							novaQuantidade = leia.nextInt();
							if (novaQuantidade > 0) {
								validaQuantidade = true;
							} else {
								System.out.println("Digite uma quantidade válida: ");
								validaQuantidade = false;
							}
						}

						

						// confirmar os dados antes de salvar
						System.out.println("\nConfirme os dados:");
						System.out.println("Nome: " + novoProduto);
						System.out.println("Quantidade: " + novaQuantidade);
						

						System.out.print("\nOs dados estão corretos? (S/N): ");
						String sn = leia.next();

						if (sn.equalsIgnoreCase("S")) {

							Produtos produto = new Produtos(novoProduto, novaQuantidade);
							produtos.add(produto);
						
							confirmaDados = true;
						}
					}

					System.out.print("\nDeseja cadastrar outro produto? (S/N): ");
					String resposta = leia.next();

					if (resposta.equalsIgnoreCase("N")) {
						continuar = false;
					}
				}
				break;

			
			case 2:
			    System.out.println("\nOPÇÃO 2 - ATUALIZAR PRODUTO");

			    listarProdutos();

			    System.out.print("Digite o nome do produto: ");
			    String nomeBusca = leia.next();

			    boolean encontrado = false;

			    for (Produtos p : produtos) {

			        if (p.produto.equalsIgnoreCase(nomeBusca)) {

			            System.out.print("Digite a nova quantidade: ");
			            novaQuantidade = leia.nextInt();

			            if (novaQuantidade >= 0) {
			                p.quantidade = novaQuantidade;
			                System.out.println("Quantidade atualizada!");
			                System.out.println("Produto: "+ p.produto + "\nQuantidade: " + p.quantidade);
			            } else {
			                System.out.println("Quantidade inválida!");
			            }

			            encontrado = true;
			            break;
			        }
			    }

			    if (!encontrado) {
			        System.out.println("Produto não encontrado!");
			    }

				
				break;
				// para printar os produtos cadastrados na tela
			case 3:
				// se nao tiver produtos
				System.out.println("\nOPÇÃO 3 - LISTAR TODOS OS PRODUTOS");
				listarProdutos();
				break;

			case 4:
				System.out.println("encerrando programa...");
				break;

			default:
				System.out.println("Digite um numero válido");

			}
		} while (opcao != 4);

		leia.close();
	}

	public static void listarProdutos(){
		if (produtos.isEmpty()) {
			System.out.println("Não tem produtos cadastrados...");
		} else {
			System.out.println("\n*** PRODUTOS CADASTRADOS ***");

			for (Produtos a : produtos) {
				System.out.println("Produto: " + a.produto);
				System.out.println("Quantidade: " + a.quantidade);
				System.out.println("-------------------");
			}
		}
		
	}
}
