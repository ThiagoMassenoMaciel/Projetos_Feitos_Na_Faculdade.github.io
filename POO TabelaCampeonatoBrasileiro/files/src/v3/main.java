package v3;

import java.util.*;

public class main {

	public static void main(String[] args) {
		
		int QntdTimes = 5;
		int QntdColunas = 8;
		Time[] ListaTimes = new Time[QntdTimes];
		
		int [][]TabelaCampeonato = new int[QntdTimes][QntdColunas];
		
		InputNomeTimes( ListaTimes ,QntdTimes );
		ShowTimes(ListaTimes);
		
	}

	public static void InputNomeTimes( Time[] ListaTimes , int QntdTimes ) {  
		
		Scanner oBJrecebeINPUTS = new Scanner(System.in);
		for ( int indice = 0 ; indice < ListaTimes.length ; indice++ ) {
			System.out.print("\nDigite o nome do time "+ indice +"# : \n");
			String inputNomeTime  = oBJrecebeINPUTS.nextLine();
			ListaTimes[indice]= new Time(inputNomeTime);
			//System.out.println(ListaTimes[indice].getNome());
			
		}
/*
  		 oBJrecebeINPUTS.close();	
		 for( Time i : ListaTimes) {
			 System.out.println(i.getNome());
		 }
*/		oBJrecebeINPUTS.close();
		System.out.println("\n");
	}
	
	public static void ShowTimes(Time[] ArrayTimes) {
		
		for( Time i : ArrayTimes) {
			System.out.println( i.nome + Spacing(i.nome)+ "tam : " + i.nome.length());
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
