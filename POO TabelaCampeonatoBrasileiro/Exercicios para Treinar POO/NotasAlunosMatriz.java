package Exercicios;

import java.util.Scanner;

public class NotasAlunosMatriz {
	private static Scanner teclado;

	public static void main(String[] args) {
		
		teclado = new Scanner(System.in);
		double SomaNotas = 0, Maior, Menor;; 
		int QntdAlunos, QntdNotas = 4;
		
		System.out.print("Quantidade de Alunos: ");
		QntdAlunos = teclado.nextInt();
		
		
		double[][] PlanilhaNotas = new double[QntdAlunos][QntdNotas];
			
			
		// A Variável Aluno é a cantadora para percorrer as Linhas da Matriz
		for(int Aluno = 0; Aluno <= QntdAlunos-1; Aluno++){
			System.out.printf("\n\tAluno %d\n\n", Aluno + 1);
			SomaNotas = 0;
			// A Variável Nota é a cantadora para percorrer as Colunas da Matriz
			for(int Nota = 0; Nota <= QntdNotas - 3; Nota++){
				System.out.printf("Av%d = ", Nota + 1);
				PlanilhaNotas[Aluno][Nota] = teclado.nextFloat();	
				
				SomaNotas = SomaNotas + PlanilhaNotas[Aluno][Nota]; // SomaNotas += Aluno[i]		
			}
		
			PlanilhaNotas[Aluno][3] = SomaNotas/2; 
		
			if(PlanilhaNotas[Aluno][3] < 6 ){
					
				System.out.println("Av3 = ");
				
				
				PlanilhaNotas[Aluno][2] = teclado.nextFloat();	
			
				if(PlanilhaNotas[Aluno][0] >= PlanilhaNotas[Aluno][1]){
					Maior = PlanilhaNotas[Aluno][0];
					Menor = PlanilhaNotas[Aluno][1];
				}else{
					Maior = PlanilhaNotas[Aluno][1];
					Menor = PlanilhaNotas[Aluno][0];
				}
				
				if(PlanilhaNotas[Aluno][2] > Menor){
					PlanilhaNotas[Aluno][3] = (Maior + PlanilhaNotas[Aluno][2])/2; 
					if(PlanilhaNotas[Aluno][3] >= 6 ){
						System.out.printf("\n\nAluno %d\tMédia %.1f\tAprovado!!!\n", Aluno + 1, PlanilhaNotas[Aluno][3]);			
						System.out.printf("Av1 = %.1f\tAv2 = %.1f\tAv3 = %.1f\tMédia = %.1f", PlanilhaNotas[Aluno][0], PlanilhaNotas[Aluno][1], PlanilhaNotas[Aluno][2], PlanilhaNotas[Aluno][3]);
				}
					
				}else{
					System.out.printf("\n\nAluno %d\tMédia %.1f\tReprovado!!!\n", Aluno + 1, PlanilhaNotas[Aluno][3]);
					System.out.printf("Av1 = %.1f\tAv2 = %.1f\tAv3 = %.1f\tMédia = %.1f", PlanilhaNotas[Aluno][0], PlanilhaNotas[Aluno][1], PlanilhaNotas[Aluno][2], PlanilhaNotas[Aluno][3]);
				}
				
				}else{
					System.out.printf("\n\nAluno %d\tMédia %.1f\tAprovado!!!\n", Aluno + 1, PlanilhaNotas[Aluno][3]);
					System.out.printf("Av1 = %.1f\tAv2 = %.1f\tAv3 = %.1f\tMédia = %.1f", PlanilhaNotas[Aluno][0], PlanilhaNotas[Aluno][1], PlanilhaNotas[Aluno][2], PlanilhaNotas[Aluno][3]);	
				}
		}
			
		}

}

