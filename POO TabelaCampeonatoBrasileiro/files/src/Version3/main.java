package Version3;

import java.util.*;

import v2.Time.*;

public class main {

	public static void main(String[] args) {
		
		int QntdTime = 20;
//		Object[] ListaTimes = new Object[QntdTime];
		Time[] ListaTimes = new Time[QntdTime];

		ListaTimes[0] = new Time("Sao Paulo");
		ListaTimes[1] = new Time("Palmeiras");
		ListaTimes[2] = new Time("Paris São Germani");
		ListaTimes[3] = new Time("Vasco");
		ListaTimes[4] = new Time("Ceara");
		ListaTimes[5] = new Time("Fluminense");
		ListaTimes[6] = new Time("Barcelona");
		ListaTimes[7] = new Time("Floresta");
		ListaTimes[8] = new Time("Gremio");
		ListaTimes[9] = new Time("Corintians");
		ListaTimes[10] = new Time("Fortaleza");
		ListaTimes[11] = new Time("Atletico mineiro");
		ListaTimes[12] = new Time("Cianorte");
		ListaTimes[13] = new Time("Confiança");
		ListaTimes[14] = new Time("Curitiba");
		ListaTimes[15] = new Time("Corumbaense");
		ListaTimes[16] = new Time("Coruripe");
		ListaTimes[17] = new Time("Cruzeiro");
		ListaTimes[18] = new Time("Cuiabá");
		ListaTimes[19] = new Time("Campinense");
		
		ShowTimes(ListaTimes);

	}
	
	public static void ShowTimes(Time[] ArrayTimes) {
		
		for( Time i : ArrayTimes) {
			System.out.println(i.nome + Spacing(i.nome)+ "tam : " + i.nome.length());
			
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
