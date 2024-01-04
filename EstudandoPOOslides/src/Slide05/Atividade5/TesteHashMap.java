package Slide05.Atividade5;

import java.util.HashMap;
import java.util.Map;
import Slide05.Atividade5.Estudante;

public class TesteHashMap {

	public static void main(String[] args) {
		Map<Integer , Estudante> Turma = new HashMap<Integer,Estudante>();
		
		Estudante OBJ1 = new Estudante("Andrie Queromin Damasceno");
		Estudante OBJ2 = new Estudante("Andressa de Chagas Chavier");
		Estudante OBJ3 = new Estudante("Benevides Silva Maciel");
		
		Turma.put(56051837,OBJ1);
		Turma.put(57054181,OBJ2);
		Turma.put(54042134,OBJ3);
		
		System.out.println("Pesquisando o elemento do map que tem a chave 56051837");
		System.out.println(Turma.get(56051837));
		
		

	}

}
