package Slide05.Revisao13;

import java.util.Map;
import java.util.HashMap;
public class DuasChavesUmValor {

	public static void main(String[] args) {
		Map<Integer, String> mapeando = new HashMap<Integer, String>();
		
		mapeando.put(4, "Produto higienicos");
		mapeando.put(91, "Produto higienicos");
		
		System.out.println(mapeando);

	}

}
