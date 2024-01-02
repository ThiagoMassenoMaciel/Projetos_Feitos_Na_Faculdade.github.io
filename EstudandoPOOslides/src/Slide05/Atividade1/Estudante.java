package Slide05.Atividade1;

public class Estudante {
	private String nome;
	private int    matricula;
	
	public Estudante( String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "\nEstudante [ nome = " + nome + ", matricula = " + matricula + " ]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
}
