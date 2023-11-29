package v1;

public class Time {
	
	String nome;
	
	int Classificacao = 0;
	
	int QuantidadeVitoria = 0, QuantidadeEmpate = 0, QuantidadeDerrotas = 0;
	
	int GolPro = 0 , GolSofrido = 0, SaldoGols = 0;
	
	int Pontos = 0;
	
	

	public Time ( String nome) {
		this.nome = nome;
	}

	public int getQuantidadeVitoria() {
		return QuantidadeVitoria;
	}

	public void setQuantidadeVitoria(int quantidadeVitoria) {
		QuantidadeVitoria = quantidadeVitoria;
	}

	public int getQuantidadeEmpate() {
		return QuantidadeEmpate;
	}

	public void setQuantidadeEmpate(int quantidadeEmpate) {
		QuantidadeEmpate = quantidadeEmpate;
	}

	public int getQuantidadeDerrotas() {
		return QuantidadeDerrotas;
	}

	public void setQuantidadeDerrotas(int quantidadeDerrotas) {
		QuantidadeDerrotas = quantidadeDerrotas;
	}

	public int getGolPro() {
		return GolPro;
	}

	public void setGolPro(int golPro) {
		GolPro = golPro;
	}

	public int getGolSofrido() {
		return GolSofrido;
	}

	public void setGolSofrido(int golSofrido) {
		GolSofrido = golSofrido;
	}

	public int getSaldoGols() {
		return SaldoGols;
	}

	public void setSaldoGols(int saldoGols) {
		SaldoGols = saldoGols;
	}

	public int getPontos() {
		return Pontos;
	}

	public void setPontos(int pontos) {
		Pontos = pontos;
	}

	public int getClassificacao() {
		return Classificacao;
	}

	public void setClassificacao(int classificacao) {
		Classificacao = classificacao;
	}
}
