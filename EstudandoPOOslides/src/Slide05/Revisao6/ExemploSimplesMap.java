package Slide05.Revisao6;

import java.util.HashMap;
import java.util.Map;

public class ExemploSimplesMap {

	public static void main(String[] args) {
		//estanciando o mapeamento
		Map<String , Integer> mapa = new HashMap<String , Integer>();
		
		// atribuindo a chave e valor de  cada elemento dentro do mapa
		//lenbrando da ordem    Map< chave , valor >
		mapa.put("Sabonete", 11);
		mapa.put("Talco", 39);
		mapa.put("Frauda", 37);

		//Exibindo o todos os elementos do mapa
		System.out.println(mapa);
		
		//Removendo o elemento do mapa pela chave
		mapa.remove("Talco");
		
		//Exibindo novamente o todos os elementos do mapa depois de um elemento removido
		System.out.println("Depois de removido um elemento , o mapa ficou assim : \n" + mapa);
				
	}

}
