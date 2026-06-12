package aula_02_operadores;

public class OperadoresAtribuicao {

	public static void main(String[] args) {
		
		int numero1 = 4;
		int numero2 = 4;
		int numero3 = 4;
		int numero4 = 4;
		int numero5 = 4;

		System.out.println("Atribuicao com soma: " + (numero1 += 2));
		System.out.println("Atribuicao com subtracao: " + (numero2 -= 2));
		System.out.println("Atribuicao com multiplicacao: " + (numero3 *= 2));
		System.out.println("Atribuicao com divisao: " + (numero4 /= 2));
		System.out.println("Atribuicao com modulo: " + (numero5 %= 2));
		
		
	}

}
