package Slide05.Revisao7;

import java.util.ArrayList;
import java.util.List;

public class ExemploSimplesList_ArrayList {

	public static void main(String[] args) {
		
		ArrayList listaMisturada = new ArrayList();
		
		int numero = 234;
		double pontoFlutuante = 2.98;
		String frase = "Um tipo de dado nao primitivo";
		char caractere = 'a';
		OutraClasse objeto = new OutraClasse() ;
		
		listaMisturada.add(numero);
		listaMisturada.add(pontoFlutuante);
		listaMisturada.add(frase);
		listaMisturada.add(caractere);
		listaMisturada.add(objeto);
		
		System.out.println("\nLista misturada: size ="+ listaMisturada.size() +" \n" + listaMisturada);
		
		listaMisturada.remove(frase);
		
		System.out.println("\nLista misturada: size ="+ listaMisturada.size() + " \n" + listaMisturada);
		
		listaMisturada.remove(3);
		
		System.out.println("\nLista misturada: size ="+ listaMisturada.size() + " \n" + listaMisturada);
		
//----------------------------------------------------------
		//criando uma lista com o tipo de dado igual especifico (STRING)
		List<String> listaPalavras = new ArrayList<String>();
		
		listaPalavras.add("Acorda");
		listaPalavras.add("Pedinho");
		listaPalavras.add("que");
		listaPalavras.add("hoje");
		listaPalavras.add("tem");
		listaPalavras.add("Campeonato!");
		
		System.out.println("\n\nLista Especifica: size ="+ listaPalavras.size() +" \n" + listaPalavras);
		
		listaPalavras.remove(2);
		
		System.out.println("\nLista Especifica: size ="+ listaPalavras.size() +" \n" + listaPalavras);
		
		
	}

}
