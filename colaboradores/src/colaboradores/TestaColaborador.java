package colaboradores;

public class TestaColaborador {

	public static void main(String[] args) {

		try {
			Gerente gerente = new Gerente("Andre", "andre@email.com.br", 15000.00, 3000);
			gerente.visualizar();
		}catch (IllegalArgumentException error) {
			System.out.println("Erro: " + error.getMessage());
		}
	}

}
