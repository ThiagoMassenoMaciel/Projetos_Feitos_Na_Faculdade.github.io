package v1;

public class Tabela {
	// a tabela é uma matriz 
	String time;
	// toda variavelo maximo possivel explicita no que ela esta guardadno e que n misture sgnificado com outras variaveis especificas 
	int pontos;
	// lregibilita
	int Vitoria, PontosEmpate, PontosDerrotas;
	
	int GolPro, GolSofrido, GolSaldo;
	
	int Partidas_Jogadas;
	
	int peso1 = 3 ,  peso2 = 1 , peso3= 0;

	public Tabela( String time, 
				   int pontos ,
				   int Partidas_Jogadas, 
				   int vitoria, 
				   int empate , 
				   int derrotas, 
				   int GP , 
				   int GS , 
				   int SG ) {
		
		this.time = time;
		this.pontos = pontos;
		
		this.Partidas_Jogadas = Partidas_Jogadas ;
		

		
		
		if( vitoria + empate + derrotas > this.Partidas_Jogadas) {
			// a pessoa vai ver que ficou tudo zerado e vai refazer o objeto
			this.Vitoria = 0;
			this.PontosEmpate = 0;
			this.PontosDerrotas = 0;
		}else {
			
			this.Vitoria = vitoria;
			this.PontosEmpate = empate;
			this.PontosDerrotas = derrotas;
		}
		
		this.pontos = CalcPonts();
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getPartidas_Jogadas() {
		return Partidas_Jogadas;
	}

	public void setPartidas_Jogadas(int partidas_Jogadas) {
		Partidas_Jogadas = partidas_Jogadas;
	}

	public int getVitoria() {
		return this.Vitoria;
	}

	public void setVitoria(int vitoria) {
		this.Vitoria = vitoria;
	}

	public int getEmpate() {
		return this.PontosEmpate;
	}

	public void setEmpate(int empate) {
		this.PontosEmpate = empate;
	}

	public int getDerrotas() {
		return this.PontosDerrotas;
	}

	public void setDerrotas(int derrotas) {
		this.PontosDerrotas = derrotas;
	}
	
	public int CalcPonts() {
	
		int pontos =( getVitoria()  * this.peso1  )
				 		+ 
					( getEmpate()   * this.peso2   ) 
						+ 
			    	( getDerrotas() * this.peso3 ) ;
		
		return pontos;
	}
	
}
