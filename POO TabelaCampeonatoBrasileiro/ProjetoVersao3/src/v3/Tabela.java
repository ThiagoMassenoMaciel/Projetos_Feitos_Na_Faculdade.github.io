package v3;

import java.util.Scanner;

public class Tabela {

	public static void main(String[] args) {
		
		int QntdTimes = 4;
		//int QntdColunas = 8;
		Time[] ArrayTimes = new Time[QntdTimes];
		
		InputTimes(ArrayTimes , QntdTimes);
		ShowTimes(ArrayTimes);
		ShowRodadasPartidas(ArrayTimes);
		
	}
	
	public static void InputTimes( Time[] ArrayTimes , int QntdTimes ) {  
		
		Scanner OBJrecebeINPUTS = new Scanner(System.in);
		
		for ( int indice = 0 ; indice < ArrayTimes.length ; indice++ ) {
			
			System.out.print("\nDigite o nome do time "+ (indice + 1) +"# : \n");
			
			String inputNomeTime  = OBJrecebeINPUTS.nextLine();
			ArrayTimes[indice]= new Time(inputNomeTime);
			ArrayTimes[indice].Classificacao = indice + 1;
			//System.out.println(ListaTimes[indice].getNome());
		}
/*
  		 oBJrecebeINPUTS.close();	
		 for( Time i : ListaTimes) {
			 System.out.println(i.getNome());
		 }
*/		OBJrecebeINPUTS.close();
		System.out.println("\n\n");
	}
	
	public static void ShowTimes(Time[] ArrayTimes) {
		System.out.println("\n\t\t\tCampeonato Brasileiro");
		System.out.println("\n"+ Spacing("") + "Classificacao\tVit\tDer\tEmp\tGP\tGS\tSG\tPontuacao");
		for( Time i : ArrayTimes) {
			System.out.print( i.nome + Spacing(i.nome)+ "\t" +
														i.Classificacao       + "\t\t" +
														i.QuantidadeVitoria   + "\t" +
														i.QuantidadeDerrotas  + "\t" +
														i.QuantidadeEmpate    + "\t" +
														i.GolPro              + "\t" +
														i.GolSofrido	      + "    " + "\t" +
														i.SaldoGols 		  + "\t" +
														i.Pontuacao			  + "\t"  );
			System.out.println("");
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
					System.out.println("\nPartida #"+ (indicePartidas + 1) );
					
					int posicaoArray;
					
					if( indicePartidas == quantidadePartidasEmCadaRodada-1) {  //quanto tiver na Partida 2 fazer     Array[i+2] X Array[i+3]
						posicaoArray = indicePartidas+1;                      //                                     Array[1+1] X Array[(1+1)+1]
																			 // na ultima partida o time jogando tem posicao alterada i+3
					}else {													// quanto tiver na Partida 1 fazer     Array[i] X Array[i+1]
																		   //                                      Array[0] X Array[0+1]    
						posicaoArray = indicePartidas;
					}

					System.out.println(" "+ ArrayTimes[posicaoArray].nome + " X " + ArrayTimes[posicaoArray + 1 ].nome );
					

				}else if ( indiceRodadas == 1) {
//-------------------------------------------------------------------------------------------------
					System.out.println("\nPartida #"+ (indicePartidas + 1) );
					
					int posicaoArray;
					posicaoArray = indicePartidas;
					
					 //quanto tiver na Partida 1 fazer     Array[i] X Array[i+2]
				    //                                     Array[0] X Array[0+2]
						
					// quanto tiver na Partida 2 fazer     Array[i] X Array[i+2]
					//                                     Array[1] X Array[1+2]    	
					
					System.out.println(" "+ ArrayTimes[posicaoArray].nome + " X " + ArrayTimes[posicaoArray + 2 ].nome );
					
				}else if ( indiceRodadas == 2) {
//-------------------------------------------------------------------------------------------------
					System.out.println("\nPartida #"+ (indicePartidas + 1) );
					
					int posicaoArray;
					if( indicePartidas == quantidadePartidasEmCadaRodada-1) {         // Perguntei se é a partida 2 
						posicaoArray = ArrayTimes.length/2;                           // para eu achar o elemento sucessor do elemento[1]
																					  // este mesmo numero é encontrado na variavel  quantidadePartidasEmCadaRodada
																					  // Então eu coloco ela ----> dentro da variavel posicaoArray ?
						
						System.out.println(" "+ ArrayTimes[indicePartidas].nome + " X " + ArrayTimes[posicaoArray].nome ); // Array[1] X Array[2] 
					}else {

						posicaoArray = indicePartidas;
						
						 //quanto tiver na Partida 1 fazer     Array[i] X Array[i+3]
					    //                                     Array[0] X Array[0+3]
							
						// quanto tiver na Partida 2 fazer     Array[i] X Array[O indice do elemento sucessor de Array[i] ]
						//                                     Array[1] X Array[2]    	
						
						System.out.println(" "+ ArrayTimes[posicaoArray].nome + " X " + ArrayTimes[posicaoArray+3].nome ); // Array[0] X Array[0+3]
					}
				}
			}
			System.out.println("");
		}	
	}
}
