package colaboradores;

public class Gerente extends Funcionario {

	private double bonus;

	public Gerente(String nome, String email, double salario, double bonus) {
		super(nome, email, salario);
		this.bonus = bonus;

	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		Validacao.validarBonus(bonus);
		this.bonus = bonus;
	}

	public double calcularSalario() {

		return this.getSalario() + this.getBonus();
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.printf("Bonus: %.2f", bonus);
		System.out.printf("Salario do gerente %s é R$%.2f", this.getNome(), calcularSalario());
	}

}
