package Slide05.Atividade1;

import java.util.Arrays;

import Slide05.Atividade1.Estudante;

public class Turma {
	private String    nome;
	private Estudante estudantes[] = new Estudante[10];
	private int       numEstudantes = 0;
	
	public Turma( String nome) {
		this.nome = nome;
	}

	public void matricular(Estudante objeto) {
		for(int indice = 0; indice < this.estudantes.length; indice++) {
			if( this.estudantes[indice] == null) {
				this.estudantes[indice] = objeto;
				this.estudantes[indice].setMatricula(indice);
				this.numEstudantes += 1;
				break;
			}
		}
	}

	public void listar() {
		System.out.print("Turma "+ this.nome +"\n[");
		
/*		for( Estudante e : this.estudantes) {
			System.out.print("\t"+e);
		} // n uso este for each pois quero exibir apena as posições da array diferente de nulo
*/
		for( int indice = 0 ; indice < this.numEstudantes; indice++){
			System.out.print("\t"+ this.estudantes[indice]);
		}
		
		System.out.println("\n]");
	}
	@Override
	public String toString() {
		return "Turma [nome=" + nome + ", estudantes=" + Arrays.toString(estudantes) + ", numEstudantes="
				+ numEstudantes + "]";
	}

	public Estudante pesquisar( int matricula) {
		for( int indice = 0 ; indice < this.numEstudantes; indice++) {
			if( this.estudantes[indice].getMatricula() == matricula) {
				return estudantes[indice];
			}
		}
		return null; // devo fazer um teste para dentro da variavel que vai receber o retorno desta função , so vai exibir na tela somente se for diferente de nulo
	}
	
	public void trancar( int matricula) {
		//{ e ,  a  , i ,  o ,  u }
	    // a[i] = null-------------------------------------------------------------------------------
		//{   ,  a  , i ,  o ,  u  }-----------------------------------------------------------------
	    // a[i] = a[i+1]
		//{ a ,  a  , i ,  o ,  u  }
	    		// a[i] = a[i+1] 
				//{  a ,  i  , i ,  o ,  u  }
    					// a[i] = a[i+1] 
						//{  a ,  i  , i ,  o ,  u  }
								// a[i] = a[i+1] 
								//{  a ,  i  , o ,  o ,  u  }
										// a[i] = a[i+1] 
										//{  a ,  i  , o ,  u ,  u  }
												// a[i] = a[i+1] ------------------------------------
												//{  a ,  i  , o ,  u ,    }-------------------------

		//{ e ,  a  , i ,  o ,  u }
	    // a[i] = null-------------------------------------------------------------------------------
		//{  e ,    , i ,  o ,  u  }-----------------------------------------------------------------
		
	    // a[i] = a[i+1]
		//{ e ,  i  , i ,  o ,  u  }
		
	    		// a[i] = a[i+1] 
				//{  e ,  i  , o ,  o ,  u   }
		
    					// a[i] = a[i+1] 
						//{  e ,  i  , o ,  u ,  u   }
		
								// a[i] = null------------------------------------------------------- 
								//{  e ,  i  , o ,  u ,   }------------------------------------------
		
		
		
		//{ e ,  a  , i ,  o ,  u }
	    // a[i] = null-------------------------------------------------------------------------------
		//{  e ,  a  ,   ,  o ,  u  }-----------------------------------------------------------------
		
	    // a[i] = a[i+1]
		//{ e ,  a  , o ,  o ,  u  }
		
	    		// a[i] = a[i+1] 
				//{  e ,  a  , o ,  u ,  u   }
		
    					// a[i] = null---------------------------------------------------------------
						//{  e ,  a  , o ,  u ,     }------------------------------------------------
		
		
		
		
		//{ e ,  a  , i ,  o ,  u }
	    // a[i] = null-------------------------------------------------------------------------------
		//{  e ,  a  , i ,    ,  u  }-----------------------------------------------------------------
		
	    // a[i] = a[i+1]
		//{ e ,  a  , o ,  u ,  u  }
		
	    		// a[i] = null ----------------------------------------------------------------------
				//{  e ,  a  , i ,  u ,   }----------------------------------------------------------

		
		
		
		//{ e ,  a  , i ,  o ,  u }
	    // a[i] = null-------------------------------------------------------------------------------
		//{  e ,  a  , i , o   ,    }-----------------------------------------------------------------
		
				
		for( int indice = 0 ; indice < this.numEstudantes; indice++) {
			if( this.estudantes[indice] == null) {
				break;
			}
			
			if( this.estudantes[indice] == pesquisar(matricula)) {
				this.estudantes[indice] = null;
			// antes de redimensionar array deve reordenar os objetos para as posições da array
				this.numEstudantes += -1;
			}
		}
	}

	public void trancar( Estudante e) {
		
		for( int indice = 0 ; indice < this.numEstudantes; indice++) {
			if( this.estudantes[indice] == e ) {
				this.estudantes[indice] = null;
				// antes de redimensionar array deve reordenar os objetos para as posições da array
				
				this.numEstudantes += -1;
			}
		}
	}
}
