package Slide05.Revisao7;
// usando for tradicional e funcao de framework collections get(index)
import java.util.ArrayList;
import java.util.List;

public class ExemploSimplesList_ArrayList_Get {

	public static void main(String[] args) {

				List<String> CassiaEller = new ArrayList<String>();
				
				CassiaEller.add("Palavras");
				CassiaEller.add("apenas");
				CassiaEller.add("palavras");
				CassiaEller.add("pequenas");
				CassiaEller.add("Palavras");
				CassiaEller.add("ao");
				CassiaEller.add("vento");
				
				for(int i = 0 ; i < CassiaEller.size(); i++) {
					System.out.print( CassiaEller.get(i) + " ,");
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
				
				for(int i = 0 ; i < GeneroMusical.size(); i++) {
					System.out.print( GeneroMusical.get(i) + " ,");
				}
	}
}
