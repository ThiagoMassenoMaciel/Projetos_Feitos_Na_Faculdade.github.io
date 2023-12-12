package version4;

import java.util.Scanner;
public class Tabela {
	
	public static Scanner OBJrecebeINPUTS = new Scanner(System.in);
	public static void main(String[] args) {
		
		int QntdTimes = 4;
		Time[] ArrayTimes = new Time[QntdTimes];
		
		InputTimes(ArrayTimes , QntdTimes);
		ShowTimes(ArrayTimes);
		ShowRodadasPartidas(ArrayTimes);
		ShowTimes(ArrayTimes); // depois do placar
		SaldoGols(ArrayTimes );
		ShowTimes(ArrayTimes);// depois de colocar o saldo de gols
		PontuacaoFinal(ArrayTimes );
		ShowTimes(ArrayTimes);// depois de calcular Pontuação Final
		OrdenarClassificacao(ArrayTimes);
		ShowTimes(ArrayTimes);// depois de ordenada classificação
	}
	
	public static void InputTimes( Time[] ArrayTimes , int QntdTimes ) {  
		
		
		
		for ( int indice = 0 ; indice < ArrayTimes.length ; indice++ ) {
			
			System.out.print("\nDigite o nome do time "+ (indice + 1) +"# : \n");
			
			String inputNomeTime  = OBJrecebeINPUTS.nextLine();
			ArrayTimes[indice]= new Time(inputNomeTime);
			ArrayTimes[indice].Classificacao = indice + 1;

			
			 
		}

		System.out.println("\n\n");
	}
	
	public static void ShowTimes(Time[] ArrayTimes) {
		System.out.println("\n\t\t\tCampeonato Brasileiro");
		System.out.println("\n"+ Spacing("") + "Classificacao\tVit\tDer\tEmp\tGP\tGS\tSG\tPontuacao");
		for( Time i : ArrayTimes) {
			System.out.println( i.nome + Spacing(i.nome)+ "\t" +
														i.Classificacao       + "\t\t" +
														i.QuantidadeVitoria   + "\t" +
														i.QuantidadeDerrotas  + "\t" +
														i.QuantidadeEmpate    + "\t" +
														i.GolPro              + "\t" +
														i.GolSofrido	      + "    " + "\t" +
														i.SaldoGols 		  + "\t" +
														i.Pontuacao			  + "\t"  );
		}	
	}
	
	public static String Spacing( String nomeTime) {
		int spaceCount =  20 - nomeTime.length();
		String space = "";
		for( int chaR = 0 ; chaR < spaceCount ; chaR++) {
			space+=" ";
		}
		return space;
	}
	
	public static void ShowRodadasPartidas(Time[] ArrayTimes) {
		
		System.out.println("\n\t\tRodadas e partidas do Campeonato Brasileiro");
		
		int quantidadeRodadas =  ArrayTimes.length - 1;
		int quantidadePartidasEmCadaRodada = ArrayTimes.length/2;

		for( int indiceRodadas = 0 ; indiceRodadas <  quantidadeRodadas; indiceRodadas++) {
			
			System.out.println("\nRodada -----------"+ (indiceRodadas + 1) +"----------");
			
			for (int indicePartidas = 0 ; indicePartidas < quantidadePartidasEmCadaRodada ; indicePartidas++) {

				if ( indiceRodadas == 0) {
//-------------------------------------------------------------------------------------------------
					System.out.println("\n-------------------Partida #"+ (indicePartidas + 1) );
					
					int posicaoArray;
					
					if( indicePartidas == quantidadePartidasEmCadaRodada-1) {  
						posicaoArray = indicePartidas+1;                    
																			
					}else {													
																		    
						posicaoArray = indicePartidas;
					}

					System.out.println(" "+ ArrayTimes[posicaoArray].nome + " X " + ArrayTimes[posicaoArray + 1 ].nome );
					
					PlacarEmCadaPartida(    ArrayTimes[posicaoArray]        ,       ArrayTimes[posicaoArray + 1 ]);
					

				}else if ( indiceRodadas == 1) {
//-------------------------------------------------------------------------------------------------
					System.out.println("\n-------------------Partida #"+ (indicePartidas + 1) );
					
					int posicaoArray;
					posicaoArray = indicePartidas;

					System.out.println(" "+ ArrayTimes[posicaoArray].nome + " X " + ArrayTimes[posicaoArray + 2 ].nome );
					PlacarEmCadaPartida(    ArrayTimes[posicaoArray]        ,       ArrayTimes[posicaoArray + 2 ]);
					
				}else if ( indiceRodadas == 2) {
//-------------------------------------------------------------------------------------------------
					System.out.println("\n-------------------Partida #"+ (indicePartidas + 1) );
					
					int posicaoArray;
					if( indicePartidas == quantidadePartidasEmCadaRodada-1) {       
						posicaoArray = ArrayTimes.length/2;                           

						System.out.println(" "+ ArrayTimes[indicePartidas].nome + " X " + ArrayTimes[posicaoArray].nome ); // Array[1] X Array[2] 
						
						PlacarEmCadaPartida(    ArrayTimes[indicePartidas]        ,       ArrayTimes[posicaoArray]);
						
					}else {

						posicaoArray = indicePartidas;

						System.out.println(" "+ ArrayTimes[posicaoArray].nome + " X " + ArrayTimes[posicaoArray + 3 ].nome );
						
						PlacarEmCadaPartida(    ArrayTimes[posicaoArray]        ,       ArrayTimes[posicaoArray + 3 ]);
					}
				}
			}
			System.out.println("");
		}	
	}

	public static void PlacarEmCadaPartida(Time mandante , Time visitante) {
		
		System.out.println("Digite quantos gols fez o time "+ mandante.nome + " : ");
		int golsProMandante = OBJrecebeINPUTS.nextInt();
		
		System.out.println("Digite quantos gols fez o outro time "+ visitante.nome + " : ");
		int golsProVisitante = OBJrecebeINPUTS.nextInt();
		 
		GolsProSofridos( mandante , golsProMandante, visitante , golsProVisitante );
		VitoriaEmpateDerrota(mandante, golsProMandante, visitante, golsProVisitante);
		
	}
	
	public static void GolsProSofridos(Time mandante , int golMandante , Time visitante, int golVisitante) {
		mandante.GolPro += golMandante;
		mandante.GolSofrido += golVisitante;
		
		visitante.GolPro += golVisitante;
		visitante.GolSofrido += golMandante;
		
		
	}
	
	public static void VitoriaEmpateDerrota(Time mandante , int golMandante , Time visitante, int golVisitante) {
		if ( golMandante > golVisitante) {
			
			mandante.QuantidadeVitoria   += 1;
			visitante.QuantidadeDerrotas +=1;
			
		}else if( golMandante < golVisitante) {
			
			mandante.QuantidadeDerrotas += 1;
			visitante.QuantidadeVitoria += 1;	
			
		}else if ( golMandante == golVisitante) {
			
			mandante.QuantidadeEmpate += 1;
			visitante.QuantidadeEmpate += 1;
			
		}
	}
	
	public static void SaldoGols( Time[] ArrayTimes ) {
		for( int indice = 0 ; indice < ArrayTimes.length; indice++) {
			
			ArrayTimes[indice].SaldoGols =(  ArrayTimes[indice].GolPro - ArrayTimes[indice].GolSofrido  );
			
		}
	}
	
	public static void PontuacaoFinal( Time[] ArrayTimes ) {
		for( int indice = 0 ; indice < ArrayTimes.length; indice++) {
			
			ArrayTimes[indice].Pontuacao =(  ArrayTimes[indice].QuantidadeVitoria * 3 )
											+ 
										  (  ArrayTimes[indice].QuantidadeEmpate * 1  ) 
										    +
										  ( ArrayTimes[indice].QuantidadeDerrotas* 0  ) 
					;
			
		}
	}
	
	public static void OrdenarClassificacao(  Time[] ArrayTimes  ) {
		
		int quantidadeTimes = ArrayTimes.length;
		
		while ( quantidadeTimes > 0) {
			
			for ( int indice = 0 ; indice < quantidadeTimes-1; indice++) {
				
				if ( ArrayTimes[indice].Pontuacao < ArrayTimes[indice+1].Pontuacao ) {
					TrocarPosicao(ArrayTimes , indice);
					
				}else if( ArrayTimes[indice].Pontuacao == ArrayTimes[indice+1].Pontuacao ) {
					
					
					if(   ArrayTimes[indice].QuantidadeVitoria < ArrayTimes[indice+1].QuantidadeVitoria) {
						TrocarPosicao(ArrayTimes , indice);
					}else if(ArrayTimes[indice].QuantidadeVitoria == ArrayTimes[indice+1].QuantidadeVitoria) {
						
						  if(ArrayTimes[indice].SaldoGols < ArrayTimes[indice+1].SaldoGols ) {
							  TrocarPosicao(ArrayTimes , indice);
							  
						  }else if(ArrayTimes[indice].SaldoGols == ArrayTimes[indice+1].SaldoGols ) {
							  
							  	if(ArrayTimes[indice].GolPro < ArrayTimes[indice+1].GolPro) {
							  		TrocarPosicao(ArrayTimes , indice);
							  	}
							  
						  }
							
					}
				}
			}
			
			quantidadeTimes--;
		}
	}
	
	public static void TrocarPosicao( Time[] ArrayTimes , int indice) {
		Time Aux ;
		Aux = ArrayTimes[indice]; 
		ArrayTimes[indice] = ArrayTimes[indice+1];
		ArrayTimes[indice+1] = Aux;
		
		ArrayTimes[indice+1].Classificacao = indice+1;
		ArrayTimes[indice].Classificacao   = indice;
	}
}