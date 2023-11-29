package v2;

import java.util.*;

import v2.Time.*;

public class main {

	public static void main(String[] args) {
		
		int QntdTime = 5;
		
		Object[] ListaTimes = new Object[QntdTime];
		
		for( int time = 0 ; time < QntdTime; time++) {
			ListaTimes[time] = new Time();
		}
		
		
		System.out.println("Tamanho da array :" + ListaTimes.length 
				     + " isto quer dizer que \ntemos 5 Times(vazio)"
				                    + " dentro de uma lista array");
		
		System.out.print("Agora como vamos editar e colocar os dados para cada objeto dentro da array ? \n");
		
		 Scanner scanner = new Scanner(System.in); 
		 
		 for( int time = 0 ; time < ListaTimes.length; time++) {
			 
			 System.out.print("\nDigite o nome do primeiro time\n");

			 String input = scanner.nextLine();
			 
			 ListaTimes[time].setNome(input);
			 
			 System.out.print(input); 
		 }
		 
		 String input = scanner.nextLine();
		 
		 System.out.print(input);
		
	}

}
