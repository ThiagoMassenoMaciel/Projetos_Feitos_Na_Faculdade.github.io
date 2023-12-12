package version4;

public class Time {
	String nome;
	
	int Classificacao;
	int QuantidadeVitoria = 0, QuantidadeEmpate = 0, QuantidadeDerrotas = 0;
	int GolPro = 0 , GolSofrido = 0, SaldoGols = 0;
	int Pontuacao = 0;
	
	public Time ( String nome) {
		this.nome = nome;
		//this.Classificacao      = 0;
		this.QuantidadeVitoria  = 0; 
		this.QuantidadeEmpate   = 0 ;
		this.QuantidadeDerrotas = 0;
		this.GolPro             = 0;
		this.GolSofrido         = 0;
		this.SaldoGols          = 0;
		this.Pontuacao          = 0;
	}
	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
}
