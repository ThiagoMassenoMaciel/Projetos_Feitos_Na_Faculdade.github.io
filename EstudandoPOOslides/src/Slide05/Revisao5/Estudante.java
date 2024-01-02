package Slide05.Revisao5;

public class Estudante {
	String nome;
	Integer idade;
	String endereco;
	
	public Estudante(String nome, int idade , String endereco) {
		this.nome = nome;
		this.idade  = idade;
		this.endereco = endereco;
	}
	
	 @Override
	    public String toString() {
	        return "{" +
	                "nome='" + nome + '\'' +
	                ", idade=" + idade + " endereco =" + endereco+
	                "}\n";
	    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	 
	 
}
