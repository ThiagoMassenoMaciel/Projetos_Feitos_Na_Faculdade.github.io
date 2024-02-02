package Slide06.Revisao4;

import Slide06.Revisao4.SuperClasse;

//esta classe representa um filho
public class SubClasse extends SuperClasse{
// herda olhos azuis e personalidade alterada
	
	@Override
	public void personalidade() {
		System.out.println("Introvertido");	
	}
	
}
