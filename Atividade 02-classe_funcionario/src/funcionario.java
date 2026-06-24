
public class funcionario {

	private String nome;
	private int cargo;
	private double salario;
	private int idade;
	private int setor;
	
	public funcionario(String nome, int cargo, double salario, int idade, int setor) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
		this.idade = idade;
		this.setor = setor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCargo() {
		return cargo;
	}

	public void setCargo(int cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getSetor() {
		return setor;
	}

	public void setSetor(int setor) {
		this.setor = setor;
	}
	
	public void visualizar() {
		String tipoCargo = "";
		switch(this.cargo) {
		case 1:
			tipoCargo = "Estagiario";
			break;
		case 2:
			tipoCargo = "Scrum Master";
			break;
		}
		String tipoSetor = "";
		switch(this.setor) {
		case 1:
			tipoSetor = "logistica";
			break;
		case 2:
			tipoSetor = "TI";
			break;
		}
		System.out.println("**********Dados do Funcionario**********");
		System.out.println("Nome do Funcionario: " + this.nome);
		System.out.println("Idade do Funcionario: " + this.idade);
		System.out.println("Cargo do Funcionario: " + tipoCargo);
		System.out.println("Salario do Funcionario: " + this.salario);
		System.out.println("Setor do Funcionario: " + tipoSetor);
	}
}


