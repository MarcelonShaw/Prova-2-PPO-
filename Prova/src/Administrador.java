
public class Administrador extends Empregado {

	double ajudadecustos;

	public double getAjudadecustos() {
		return ajudadecustos;
	}

	public void setAjudadecustos(double ajudadecustos) {
		this.ajudadecustos = ajudadecustos;
	}

	double  ObterLucros() {

		System.out.println("Sal�rio de :" + getSalario() + getAjudadecustos());
		return ( getSalario() + getAjudadecustos());
	
	}

}
