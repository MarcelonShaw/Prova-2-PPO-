
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

		System.out.println("Sal�rio de :" + getSalario());
		return getSalario();
	}

}
