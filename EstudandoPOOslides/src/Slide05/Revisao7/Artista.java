package Slide05.Revisao7;
//Usado no ExemploSimples_ArrayList_ForEach
import java.util.Arrays;

public class Artista {
	private String nomeArtistico;
	private String musicas[];
	
	public Artista( String nomeArtistico , String array[]) {
		this.nomeArtistico = nomeArtistico;
		this.musicas = array;
	}

	@Override
	public String toString() {
		return "\n[\nnomeArtistico=" + nomeArtistico + ", \nmusicas=" + Arrays.toString(musicas) + "\n]";
	}

	public String getNomeArtistico() {
		return nomeArtistico;
	}

	public void setNomeArtistico(String nomeArtistico) {
		this.nomeArtistico = nomeArtistico;
	}

	public String[] getMusicas() {
		return musicas;
	}

	public void setMusicas(String[] musicas) {
		this.musicas = musicas;
	}
	
	
	
}


