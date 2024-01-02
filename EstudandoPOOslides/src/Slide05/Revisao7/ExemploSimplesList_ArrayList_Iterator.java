package Slide05.Revisao7;
//Usando a interface ListIterator com a classe Artista com toString()  
/*
interface ListIterator {
	boolean hasNext();
	boolean hasPrevious();
	Object next();
	Object previous();
	int nextIndex();
	int previousIndex();
}

*/
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class ExemploSimplesList_ArrayList_Iterator {

	public static void main(String[] args) {

		List<String> CassiaEller = new ArrayList<String>();
		
		CassiaEller.add("Palavras");
		CassiaEller.add("apenas");
		CassiaEller.add("palavras");
		CassiaEller.add("pequenas");
		CassiaEller.add("Palavras");
		CassiaEller.add("ao");
		CassiaEller.add("vento");
		
		ListIterator it = CassiaEller.listIterator();
		
		while ( it.hasNext()) {
			System.out.println( it.next());
		}
		
		List<Artista> GeneroMusical = new ArrayList<Artista>();
		
		String musicasCassia[] = {"Segundo Sol", "Malandragem", "Palavras", "Por enquanto", "All Star"};
		Artista objeto1 = new Artista( "Cassia Eller", musicasCassia ) ;

		String musicasCazuza[] = {"O tempo nao para", "Exagerado", "Ideologia", "Brasil"};
		Artista objeto2 = new Artista( "Cazuza", musicasCazuza ) ;
		
		String musicasTimMaia[] = {"Azul da cor do mar", "Gostava tanto de voce", "Descobrindo os sete mares"};
		Artista objeto3 = new Artista( "Tim Maia", musicasTimMaia ) ;
		
		GeneroMusical.add(objeto1);
		GeneroMusical.add(objeto2);
		GeneroMusical.add(objeto3);
		
		ListIterator<Artista> iterator =  GeneroMusical.listIterator();
		while( iterator.hasNext()) {
			Artista elemento = iterator.next();
			System.out.println(elemento);
		}
		
	}

}
