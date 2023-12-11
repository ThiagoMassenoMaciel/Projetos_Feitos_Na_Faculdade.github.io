package v3;

import java.util.Scanner;

public class NextInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		executarInputForaDoMain();
	}

	public static void executarInputForaDoMain(){
		Scanner  inputValores = new Scanner(System.in);
		
		System.out.println("Digite quantos gols fez o time : ");
		int golsProMandante = inputValores.nextInt();
		
		System.out.println("Digite quantos gols fez o outro time  : ");
		int golsProVisitante = inputValores.nextInt();
		
		System.out.println(" mandante: " + golsProMandante+ "visitante: " + golsProVisitante);
		

	}

}


































