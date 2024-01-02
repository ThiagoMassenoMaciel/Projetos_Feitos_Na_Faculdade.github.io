package Slide05.Revisao5;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		//estanciando a coleção/conjunto
		Set<Estudante> Turma = new HashSet<Estudante>();
		
		// estanciando os elementos da coleção
		Estudante objeto1 = new Estudante("Jose", 14 , "Fortaleza - Bairro de Fatima");
		Estudante objeto2 = new Estudante("Maria", 14 , "Fortaleza - Pedras");
		Estudante objeto3 = new Estudante("Felipe", 14 , "Fortaleza - Washington Soares");
		
		//Add os objeto como elementos pra coleção
		Turma.add(objeto1);
		Turma.add(objeto2);
		Turma.add(objeto3);
		
		// pesquisar depois como exibir os elementos dentro ca coleção , como acessar Usando tostring e definindo os atributos do atual objeto que vai retornar como string

		System.out.println(Turma);
		System.out.println(Turma.size());
		
		Turma.remove(objeto1);
		
		System.out.println(Turma);
		System.out.println(Turma.size());
	}

}
