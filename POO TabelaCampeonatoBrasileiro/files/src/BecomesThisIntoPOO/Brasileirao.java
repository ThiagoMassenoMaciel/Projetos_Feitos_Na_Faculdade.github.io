
import java.util.Scanner;
public class Brasileirao {

		private static Scanner Teclado;

		public static void main(String[] args) {
			
			Teclado = new Scanner(System.in);
			
			int QntdTimes = 6;
			int Colunas = 8;
			
			int[][] Tabela = new int[QntdTimes][Colunas];
			
			String[] Time = new String[10];
			
			Time(Time, QntdTimes);
			Tabela(Time, Tabela, QntdTimes, Colunas);
			
			
		}

		private static void Time(String[] Time, int QntdTimes) {
			System.out.println("Informes os Times Participantes!!!");
			for(int i = 0; i < QntdTimes; i++){
				System.out.printf("Time %d: ",i+1);
				Time[i] = Teclado.nextLine();
			}
		}
		
		private static void EscreverTime(String[] Time, int QntdTimes, int i) {
			//System.out.printf("%s",Time[i]);
			int QntdEspacos = 12 - Time[i].length() / 2;
			String Espacos = "";

			for (int j = 0; j < QntdEspacos; j++ ) {
				Espacos += " ";
			}

			System.out.printf(Time[i] + Espacos);
			
		}
		
		void Pontuacao(String[] Time, int[][] Tabela, int QntdTimes) {
			for(int i = 0; i < QntdTimes; i++){
				Tabela[i][7] = Tabela[i][1]*3 + Tabela[i][2]*1 + Tabela[i][3]*0;
			}
		}
		
		void SaldoGols(String[] Time, int[][] Tabela, int QntdTimes){
			for(int i = 0; i < QntdTimes; i++){
				Tabela[i][6] = Tabela[i][4] - Tabela[i][5];
			}
		}
		
		private static void Tabela(String[] Time, int[][] Tabela, int QntdTimes, int Colunas) {
			System.out.println("\t\tTabela Campeonato!!!");
			System.out.println("\t   Class\tV\tE\tD\tGP\tGS\tSG\tPont");
			for(int i = 0; i < QntdTimes; i++){
				
				EscreverTime(Time, QntdTimes, i);
				
				for(int j = 0; j < Colunas; j++){
					System.out.printf("\t%d", Tabela[i][j]);
				}
			System.out.println();
			}		
		}

	}
}
