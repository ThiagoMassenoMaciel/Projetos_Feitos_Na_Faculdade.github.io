package Slide05.Atividade4;

import java.util.ArrayList;
import java.util.List;

import Slide05.Atividade1.Estudante;

public class TurmaArrayList {
	
		private String    		nome;
		private List<Estudante> estudantes = new ArrayList<Estudante>();
		private int       		numEstudantes = 0;
		
		public TurmaArrayList( String nome) {
			this.nome = nome;		
		}

		public void matricular(Estudante objeto) {
			objeto.setMatricula(numEstudantes);
			this.estudantes.add(objeto);
			this.numEstudantes += 1;
			
		}
		
		public void listar() {
			System.out.print("Turma "+ this.nome +"\n[");

			for( Estudante cadaElemento : this.estudantes) {
				
				System.out.println( cadaElemento);
			}
			
			System.out.println("\n]");
		}

		@Override
		public String toString() {
			return "Elemento da turma \n[\n nome=" + nome + ", \nestudantes=" + estudantes + ", \n numEstudantes=" + numEstudantes + "\n]";
		}

		public Estudante pesquisar( int matricula) {
			
			for( Estudante e : this.estudantes) {
				if( e.getMatricula() == matricula) {
					return e;
				}
			}
			return null; // devo fazer um teste para dentro da variavel que vai receber o retorno desta função , so vai exibir na tela somente se for diferente de nulo
		}
		
		public void trancar( int matricula) {
			Boolean flag = false;
			Estudante apagar = this.pesquisar(matricula);
			
			for( Estudante e : this.estudantes) {
				if(e == apagar) {
					this.estudantes.remove(e);
					this.numEstudantes += -1;
					flag = true;
				}
			}
			if(!flag) { 
	// se a flag for diferente de verdadeiro é porque ela continuou falsa logo n foi entrado no teste dentro de todos os loops
				System.out.println("Matricula não encontrada\n");
			}

		}	

		public void trancar( Estudante e) {
			
			for( Estudante a : this.estudantes) {
				if( a == e ) {
					this.estudantes.remove(e);
					// antes de redimensionar array deve reordenar os objetos para as posições da array
					this.numEstudantes += -1;
				}
			}
		}
		

}
