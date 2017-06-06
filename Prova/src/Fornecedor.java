
public class Fornecedor extends Pessoa {

	double creditomax;
	double valoremdivida;

	Fornecedor() {

	}

	public double getCreditomax() {
		return creditomax;
	}

	public void setCreditomax(double creditomax) {
		this.creditomax = creditomax;
	}

	public double getValoremdivida() {
		return valoremdivida;
	}

	public void setValoremdivida(double valoremdivida) {
		this.valoremdivida = valoremdivida;
	}

	public double ObterSaldo(double Saldo) {

		System.out.println("Saldo de : " +  (getCreditomax() - getValoremdivida()));
		return Saldo;
		
	}

}
