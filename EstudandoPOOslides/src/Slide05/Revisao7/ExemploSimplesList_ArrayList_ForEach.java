package Slide05.Revisao7;
// aqui iterei os elementos usando for Each e dentro da classe artista um toString
import java.util.ArrayList;
import java.util.List;

public class ExemploSimplesList_ArrayList_ForEach {

	public static void main(String[] args) {
		List<String> CassiaEller = new ArrayList<String>();
		
		CassiaEller.add("Palavras");
		CassiaEller.add("apenas");
		CassiaEller.add("palavras");
		CassiaEller.add("pequenas");
		CassiaEller.add("Palavras");
		CassiaEller.add("ao");
		CassiaEller.add("vento");
		
		for(String a : CassiaEller) {
			System.out.print(a + " ,");
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
		
		for( Artista cadaElemento : GeneroMusical) {
			
			System.out.println(cadaElemento);
		}
	}
}
