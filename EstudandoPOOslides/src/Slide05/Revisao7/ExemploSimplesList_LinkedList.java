package Slide05.Revisao7;

import java.util.List;
import java.util.LinkedList;

public class ExemploSimplesList_LinkedList {
	public static void main(String args[]) {
		List<String> lista = new LinkedList<String>();
		
		lista.add("Texto 1");
		lista.add("Texto 2");
		lista.add("Texto 3");
		
		System.out.println("Lista :" + lista);
		
		lista.remove(2);
		
		System.out.println("Lista :" + lista);
		
	}

}
