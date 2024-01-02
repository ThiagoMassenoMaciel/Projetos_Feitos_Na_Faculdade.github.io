package Slide05.Revisao12;

import java.util.HashMap;
import java.util.Map;

public class UmaChaveDoisValores {

	public static void main(String[] args) {
		Map<Integer, String> mapeando = new HashMap<Integer, String>();
		
		mapeando.put(2, "LimpaFacil");
		mapeando.put(17, "Esponja de lavar louca");
		mapeando.put(23, "Copo");
		
		System.out.println(mapeando);
		
		mapeando.put(17, "Esponja de Esfregar o corpo");
		
		System.out.println(mapeando);
	}

}
