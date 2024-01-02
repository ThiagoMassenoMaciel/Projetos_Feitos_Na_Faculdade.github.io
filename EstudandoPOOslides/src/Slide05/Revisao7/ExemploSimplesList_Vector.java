package Slide05.Revisao7;

import java.util.Vector;
import java.util.List;

public class ExemploSimplesList_Vector {
	public static void main( String args[]) {
		List<Integer> lista = new Vector<Integer>();
		
		lista.add(365);
		lista.add(0);
		lista.add(999);
		
		System.out.println(lista);
		
		lista.remove(1);
		
		System.out.println(lista);
	}
}