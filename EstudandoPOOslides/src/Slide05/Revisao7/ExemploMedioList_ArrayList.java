package Slide05.Revisao7;

import java.util.ArrayList;
import java.util.List;

public class ExemploMedioList_ArrayList {

	public static void main(String[] args) {
		
		List<Produto> lista = new ArrayList<Produto>();
		
		lista.add(new Produto("Cotonet", 27 , 5.50));
		lista.add(new Produto("Talco" , 11  , 7.75));
		lista.add(new Produto("Pedra AntiMofo", 7 , 1.50));
		lista.add(new Produto("Um par de Meias", 8 , 20.00));
		
		System.out.println("\n\nLista de produtos: size ="+ lista.size() +" \n" + lista);
		
		lista.remove(3);
		
		System.out.println("\nLista de produtos: size ="+ lista.size() +" \n" + lista);
		
		//lista.remove(new Produto("Talco" , 11  , 7.75)); este não funciona
		
		System.out.println("\nLista de produtos: size ="+ lista.size() +" \n" + lista);
		
	}

}
