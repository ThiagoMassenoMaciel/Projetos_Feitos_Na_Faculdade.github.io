package v3;

import java.util.Scanner;

public class Tabela {

	public static void main(String[] args) {
		
		int QntdTimes = 5;
		//int QntdColunas = 8;
		Time[] ArrayTimes = new Time[QntdTimes];
		
		InputTimes(ArrayTimes , QntdTimes);
		ShowTimes(ArrayTimes);
		
		

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
	

}
