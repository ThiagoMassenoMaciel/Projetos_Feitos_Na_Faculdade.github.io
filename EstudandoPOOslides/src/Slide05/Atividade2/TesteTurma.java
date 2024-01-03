package Slide05.Atividade2;

import Slide05.Atividade1.Estudante;
import Slide05.Atividade1.Turma;

public class TesteTurma {

	public static void main(String[] args) {
		Estudante objeto1 = new Estudante("Maria da Rosario Silva");
		Estudante objeto2 = new Estudante("Jose Erasmo Castro");
		Estudante objeto3 = new Estudante("Felipe Gonsalez Maciel");
		
		System.out.println("Os Alunos ainda nao matriculados");
		System.out.println(objeto1);
		System.out.println(objeto2);
		System.out.println(objeto3);
		
		Turma turmaUm = new Turma("Nono Ano C");
		
		turmaUm.matricular(objeto1);
		turmaUm.matricular(objeto2);
		turmaUm.matricular(objeto3);
		
		System.out.println("Depois de matriculados" +  objeto1 + objeto2 + objeto3);
		
		System.out.println("\nA turma esta completa\n");
		
		turmaUm.listar();
		
		System.out.println("\nOs dados de um estudante, o que tem a matricula 2");
		
		System.out.print(turmaUm.pesquisar(2) + "\n");
		
		System.out.println("\nUm aluno trancou o curso [obj]");
		
		turmaUm.trancar(objeto2);
		turmaUm.listar();
		
		System.out.println("\nUm aluno da matricula 2 trancou o curso [obj]");
		
		turmaUm.trancar(2);
		turmaUm.listar();

	}

}
