package Slide05.Revisao14;

import java.util.Map;
import java.util.HashMap;

public class ExemploContainsKey {

	public static void main(String[] args) {
		Map<Integer, String> guardaRoupa = new HashMap<Integer, String>();
		
		guardaRoupa.put(10, "blusas");
		guardaRoupa.put(17, "Shorts");
		guardaRoupa.put(9, "cuecas");
		guardaRoupa.put(21, "Outras coisas");
		
		System.out.println("Será que no guarda roupa voce tem alguma peca com 11 unidades ? " + guardaRoupa.containsKey(11));
		System.out.println("e com 17 unidades ? " + guardaRoupa.containsKey(17) + "---->" + guardaRoupa.get(17) );

	}

}
