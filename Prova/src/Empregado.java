
public class Empregado extends Pessoa {

	private double salario;

	Empregado() {

	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	double ObterLucros() {

		System.out.println("Salário de :" + getSalario());
		return getSalario();
	}

}
