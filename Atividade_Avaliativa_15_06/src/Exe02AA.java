import java.util.Scanner;

public class Exe02AA {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//só um titulo para não pedir direto nome
		System.out.println("Será que passei de ano??");
		
		//aqui vamos pegar o nome e salvar na variavel nome
		System.out.println("Digite Seu nome completo: ");
		String nome = leia.nextLine();
		
		//aquivamos pegar a nota e salvar na variavel nota
		System.out.println("Digite sua note final: ");
		float nota = leia.nextFloat();
		
		//aqui vamos usar a vaiavel nota para ver em qual status ela encaixa
		if (nota >=0 && nota < 5) {
			float falta = 7 -nota;
			System.out.printf("Alunx: %s\nNota Final: %.2f\nStatus: Reprovado\nFaltou %.2f pontos para ser aprovadx ",nome, nota,falta);
			System.out.println("\nRecomendo que reze antes de chegar em casa!!");
		} else if (nota >=5 && nota < 7) {
			float falta = 7 -nota;
			System.out.printf("Alunx: %s\nNota Final: %.2f\nStatus: Recuperação\nFaltou %.2f pontos para ser aprovadx ",nome, nota,falta);
			System.out.println("\nRecomendo que se preprare para proximas provas, essa será sua segunda chance!");
		} else if (nota >=7 && nota < 11) {
			System.out.printf("Alunx: %s\nNota Final: %.2f\nStatus: Aprovadx",nome, nota);
			System.out.println("\nPassou tanquilo, meus parabêns !!!");
		} 
		//aqui e caso alguem digite numero negativo ou numero maior que 10
		else {
			System.out.println("Digite uma nota valida");
		}
		
		leia.close();
	}

}
