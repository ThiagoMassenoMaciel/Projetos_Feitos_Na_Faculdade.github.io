package Slide05.Atividade5;

public class Estudante {
	private String nome;;
	
	public Estudante( String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "\nEstudante [ nome = " + nome +  " ]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
