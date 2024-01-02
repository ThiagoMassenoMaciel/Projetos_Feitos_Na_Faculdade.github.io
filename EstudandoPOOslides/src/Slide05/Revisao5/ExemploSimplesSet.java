package Slide05.Revisao5;

import java.util.Set;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class ExemploSimplesSet {

	public static void main(String[] args) {
		//Criar um conjunto/coleção
		Set<String> conjunto = new HashSet<String>();

		//Adicionando elementos ao conjunto
		conjunto.add("Este texto e o primeiro elemento inserido dentro desta colecao/conjunto\n");
		conjunto.add("Esta frase e o segundo elemento inserido dentro desta colecao/conjunto\n");
		conjunto.add("Logo este é o ultimo elemento inserido dentro  desta colecao/conjunto\n");
		
		//Imprimindo o conjunto
		System.out.println("\nColecao HashSet : \n" + conjunto);
		//Removendo um elemento da coleção
		conjunto.remove("Esta frase e o segundo elemento inserido dentro desta colecao/conjunto\n");
		//Imprimindo o conjunto novamente
		System.out.println("\nDepois de removido elemento : \n" + conjunto);
//-----------------------------------------------------------------------------------------------
		Set<String> conjunto2 = new TreeSet<String>();

		conjunto2.add("o primeiro elemento inserido dentro desta colecao/conjunto\n");
		conjunto2.add("o segundo elemento inserido dentro desta colecao/conjunto\n");
		conjunto2.add("o ultimo elemento inserido dentro  desta colecao/conjunto\n");
		
		System.out.println("\nColecao TreeSet: \n" + conjunto2);

		conjunto2.remove("o ultimo elemento inserido dentro  desta colecao/conjunto\n");

		System.out.println("\nDepois de removido elemento : \n" + conjunto2);
//-----------------------------------------------------------------------------------------------
		Set<String> conjunto3 = new LinkedHashSet<String>();


		conjunto3.add("primeiro elemento inserido dentro desta colecao/conjunto\n");
		conjunto3.add("segundo elemento inserido dentro desta colecao/conjunto\n");
		conjunto3.add("o ultimo elemento inserido dentro  desta colecao/conjunto\n");

		System.out.println("\nColecao LinkedHashSet: \n" + conjunto3);
		
		conjunto3.remove("segundo elemento inserido dentro desta colecao/conjunto\n");

		System.out.println("\nDepois de removido elemento : \n" + conjunto3);
	}
	
}

/*Notes
 * 
 * Como hashSet n garante a ordem , da primeira vez que executei , a ordem que os textos foram armazenado na coleção foi diferente da ordem que eu inseri
 * 
 * */