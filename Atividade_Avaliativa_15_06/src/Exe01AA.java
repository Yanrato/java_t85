import java.util.Scanner;

public class Exe01AA {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		// eu gosto de incrementar a lore dos codigos
		System.out.println("***Bem-Vindo a festa mais louca da tua vida inteiro***");
		System.out.println("Mas antes de tudo vamos apenas confirmar alguns dados...");
		
		// aqui recolhe o nome do usuario e salva na variavel nome
		System.out.println("Primeiro Digite seu nome: ");
		String nome = leia.nextLine();
		
		System.out.printf("%s, falta pouco para voce ser liberado...\n", nome);
		
		// agora vai coletar a idade do usuario e salvar na variavel idade
		System.out.println("Agora preciso da sua idade: ");
		int idade = leia.nextInt();
		
		// aqui vamos fazer a verificacao de idade e caso necessario pedir a autorizacao
		if (idade < 18 && idade >= 16) {
			
			System.out.println("Menor de idade só com autorização dos reponsaveis");
			System.out.println("Voce tem a autorizacao? responda com Sim ou Não: ");
			
			String sn = leia.next();
			boolean autorizacao = sn.equalsIgnoreCase("Sim");
			
			//se tiver autorizacao vai aparecer isso
			if (autorizacao) {
				
				System.out.printf("Autorização confirmada, %s! Aproveita!!!\n", nome);
				
				int falta = 18 - idade;
				System.out.println("Faltam " + falta + " ano(s) para voce atingir a maioridade.");
				
				//se nao, aparecera isso
			} else {
				
				System.out.println("Calma lá meu patrão, menor de idade so com autorizacao dos responsaveis... Regras da casa");
				System.out.println("Acesso negado para " + nome + ".");
			}
			
			//caso ja tenha 18 ou mais anos de idade vai pulardireto para ca
		} else if (idade >= 18) {
			
			System.out.println("Liberado camarada, aproveite a maior farra da sua vida!!!!");
			
			//aqui e so pra brincar mesmo e colcar mais uma camada
		} else if (idade < 16 && idade > 0) {
			
			System.out.println("Meu amigo, esse horario criança tem que tá na cama");
			
			//caso digite uma idade negativa
		} else {
			
			System.out.println("Idade invalida");
		}
		
		leia.close();
	}
}