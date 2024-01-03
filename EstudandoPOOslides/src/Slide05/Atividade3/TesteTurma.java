package Slide05.Atividade3;

import Slide05.Atividade3.TurmaArrayList;
import Slide05.Atividade1.Estudante;

public class TesteTurma {

	public static void main(String[] args) {
		TurmaArrayList turma = new TurmaArrayList( "Setimo ano B");
		
		Estudante OBJ1 = new Estudante("Andrie Queromin Damasceno");
		Estudante OBJ2 = new Estudante("Andressa de Chagas Chavier");
		Estudante OBJ3 = new Estudante("Benevides Silva Maciel");
		Estudante OBJ4 = new Estudante("Eluize Manuele Monteiro Josefa");
		
		System.out.println(OBJ1 + "\t"+ OBJ2 + "\t"+ OBJ3 + "\t"+ OBJ4);
		
		turma.matricular(OBJ1);
		turma.matricular(OBJ2);
		turma.matricular(OBJ3);
		turma.matricular(OBJ4);
		
		System.out.println("\n A turma esta completa");
		turma.listar();
		
		System.out.println("\nOs dados de um estudante, o que tem a matricula 2 : " + turma.pesquisar(2));
		
		System.out.println("\nUm aluno trancou o curso [obj]\n");
		turma.trancar(OBJ3);
		
		turma.listar();
		
		System.out.println("\nTrancar o curso do aluno com a matricula = 2 \n");
		turma.trancar(2);
		
		System.out.println("\nTrancar o curso do aluno com a matricula = 1 \n");
		turma.trancar(1);
		
		turma.listar();
	}

}
