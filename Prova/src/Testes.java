
public class Testes {

	public static void main(String[] args) {

		Pessoa p = new Pessoa();
		
		p.setNome("Adoleta");
		p.setAltura(1.70);
		p.setIdade(21);
		p.setSexo("Masculino");

		Empregado e = new Empregado();
		
		e.setNome("açucar");
		e.setAltura(1.50);
		e.setIdade(25);
		e.setSexo("Masculino");
		e.setSalario(3000);
		
		Fornecedor f = new Fornecedor();
		
		f.setNome("Mister");
		f.setAltura(1.80);
		f.setIdade(35);
		f.setSexo("Masculino");
		f.setCreditomax(200);
		
		Administrador a = new Administrador();
		
		a.setNome("Mira");
		a.setAltura(1.65);
		a.setIdade(28);
		a.setSexo("Feminino");
		a.setSalario(2500);
		a.setAjudadecustos(300);
		
		
		a.inf();
		

	}

}
