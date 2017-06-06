
public class Pessoa {

	private String nome;
	private int idade;
	private double altura;
	private String sexo;

	Pessoa() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	void inf(){
		System.out.println("Nome: " + getNome());
		System.out.println("Altura: " + getAltura());
		System.out.println("Idade: " + getIdade());
		System.out.println("Sexo: " + getSexo());
	}

}
