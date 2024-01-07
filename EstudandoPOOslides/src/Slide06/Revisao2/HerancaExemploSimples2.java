package Slide06.Revisao2;

import Slide06.Revisao2.Veiculo;
import Slide06.Revisao2.Carro;

public class HerancaExemploSimples2 {

	public static void main(String[] args) {
		// usa classes   :   Veiculo    Carro 
		
		Veiculo veiculo1 = new Veiculo();
		
		veiculo1.locomover();
		veiculo1.parar();
		veiculo1.ligarLanternas();
		
		//Este objeto que é criado pela classe filha Carro herda os mesmos metodos daclasse mãe Veiculo
		
		Carro carro1 = new Carro();
		
		carro1.locomover();
		carro1.parar();
		carro1.ligarLanternas();
		
		carro1.travarPortas();
		carro1.abrirVidros();

	}

}
