package Slide05.Revisao6;
//usado no exemplo medio
public class Funcionario {
	String nome;
	String cargo;
	Double salario;
	String endereco;
	
	public Funcionario( 	String nome , String cargo, Double salario,	String endereco ){
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "\tFuncionario [nome=" + nome + ", cargo=" + cargo + ", salario=" + salario + ", endereco=" + endereco
				+ "]\n";
	}
	
}
