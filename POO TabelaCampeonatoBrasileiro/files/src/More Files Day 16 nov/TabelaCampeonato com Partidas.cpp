#include<stdio.h>
#include<stdlib.h>
#include<locale.h>
#include<string.h>
#include<windows.h>

#define ColunasTabela 8

/*			 Colunas
GolsPro			4
GolsSofridos	5
Pontuacao		8
Saldo Gols		6  

				Tabela Campeonato	
		Class	V	E	D	GP	GS	SG	Pont
-------------------------------------------|
Time 1|	  1	  |					           |
Time 2|   2	  |				         	   |
Time 3|   3	  |					           |
Time 4|   4	  |					           |					           
.	  |   5	  |					           |
.	  |   6	  |					           |
.	  |   7	  |					           |
Time n|   8	  |					           |
------------------------------------------*/

void Times(char Time[][4], int QntdTimes);
void Pontuacao(int Tabela[][ColunasTabela], int QntdTimes);
void SaldoGols(int Tabela[][ColunasTabela], int QntdTimes);
void EscreverTabela(char Time[][4], int Tabela[][ColunasTabela], int QntdTimes);
void TrocaPosicao(char Time[][4], int Tabela[][ColunasTabela], int QntdTimes, int i);
void BubbleSort(char Time[][4], int Tabela[][ColunasTabela], int QntdTimes);
void Placares(char Time[][4], int Tabela[][ColunasTabela], int QntdTimes);
void VitoriaEmpateDerrota(int Tabela[][ColunasTabela], int i, int j, int GolsMandante, int GolsVisitante);
void GolsProSofridos(int Tabela[][ColunasTabela], int i, int j, int GolsMandante, int GolsVisitante);
void GotoXY(int x, int y);
	
int main(){
	system("cls");
	setlocale(LC_ALL, "Portuguese");
	int i, j;
	int QntdTimes = 4;
	
	char Time[QntdTimes][4];// = {"FAC", "FEC", "CSC", "CAC"}; 
	Times(Time, QntdTimes);
		
	int Tabela[QntdTimes][ColunasTabela] = {1, 0, 0, 0, 0, 0, 0, 0,
											2, 0, 0, 0, 0, 0, 0, 0,
											3, 0, 0, 0, 0, 0, 0, 0,
											4, 0, 0, 0, 0, 0, 0, 0};
							
	Placares(Time, Tabela, QntdTimes);
	Pontuacao(Tabela, QntdTimes);
	SaldoGols(Tabela, QntdTimes);	
	BubbleSort(Time, Tabela, QntdTimes);
	EscreverTabela(Time, Tabela, QntdTimes);					
	
	return 0;
	system("pause");
}

void Times(char Time[][4], int QntdTimes){
	for(int i = 0; i < QntdTimes; i++){
		printf("Time %d: ", i+1);
		gets(Time[i]);
	}
}

void Pontuacao(int Tabela[][ColunasTabela], int QntdTimes){
	for(int i = 0; i < QntdTimes; i++){
		Tabela[i][7] = Tabela[i][1]*3 + Tabela[i][2]*1 + Tabela[i][3]*0;
	}
}

void SaldoGols(int Tabela[][ColunasTabela], int QntdTimes){
	for(int i = 0; i < QntdTimes; i++){
		Tabela[i][6] = Tabela[i][4] - Tabela[i][5];
	}
}

void EscreverTabela(char Time[][4], int Tabela[][ColunasTabela], int QntdTimes){
	printf("\t\t\t\tTabela Campeonato\t\t");
	printf("\n      Class\t\tV\t\tE\t\tD\t       GP\t       GS\t       SG\t       PONT");
	for(int i = 0; i < QntdTimes; i++){
		printf("\n%s ", Time[i]);
		for(int j = 0; j < ColunasTabela; j++){
			printf("\t%d\t", Tabela[i][j]);
		}
	}
	printf("\n\n");
}

void BubbleSort(char Time[][4], int Tabela[][ColunasTabela], int QntdTimes){
	while(QntdTimes > 0){
		for(int i = 0; i < QntdTimes ; i++){
			if(Tabela[i][4] < Tabela[i+1][4]){
				TrocaPosicao(Time, Tabela, QntdTimes, i);
			}else if(Tabela[i][4] == Tabela[i+1][4]){
				if(Tabela[i][1] < Tabela[i+1][1]){
					TrocaPosicao(Time, Tabela, QntdTimes, i);
				}
			}
		}
		QntdTimes--;
	}
}

void TrocaPosicao(char Time[][4], int Tabela[][ColunasTabela], int QntdTimes, int i){
	int Aux;
	char Aux_Time[4];

	strcpy(Aux_Time, Time[i]);
	strcpy(Time[i], Time[i+1]);
	strcpy(Time[i+1], Aux_Time);
				
	for(int j = 1; j <= 8; j++){	
		Aux = Tabela[i][j];
		Tabela[i][j] = Tabela[i+1][j];
		Tabela[i+1][j] = Aux;
	}
}

void Placares(char Time[][4], int Tabela[][ColunasTabela], int QntdTimes){
	int CursorY = 4, GolsVisitante = 0, GolsMandante = 0;
	for(int i = 0; i < QntdTimes; i++){	
		for(int j = i + 1; j < QntdTimes; j++){	
			printf("%s   x   %s", Time[i], Time[j]);		
			GotoXY(4, CursorY);
			scanf("%d", &GolsMandante);
			GotoXY(8, CursorY);
			scanf("%d", &GolsVisitante);
			GolsProSofridos(Tabela, i, j, GolsMandante, GolsVisitante);
			VitoriaEmpateDerrota(Tabela, i, j, GolsMandante, GolsVisitante);
			CursorY++;
		}
	}
}

void GolsProSofridos(int Tabela[][ColunasTabela], int i, int j, int GolsMandante, int GolsVisitante){
	Tabela[i][4] = Tabela[i][4] + GolsMandante;  	// Gols Pro
	Tabela[i][5] = Tabela[i][5] + GolsVisitante; 	// Gols Sofridos

	Tabela[j][4] = Tabela[j][4] + GolsVisitante;	// Gols Pro
	Tabela[j][5] = Tabela[j][5] + GolsMandante;		// Gols Sofridos
}

void VitoriaEmpateDerrota(int Tabela[][ColunasTabela], int i, int j, int GolsMandante, int GolsVisitante){
	if (GolsMandante > GolsVisitante){		
		Tabela[i][1] = Tabela[i][1] + 1;
		Tabela[j][3] = Tabela[j][3] + 1;
	}else if(GolsMandante < GolsVisitante){
		Tabela[i][3] = Tabela[i][3] + 1;
		Tabela[j][1] = Tabela[j][1] + 1;
	}else if(GolsMandante == GolsVisitante){
		Tabela[i][2] = Tabela[i][2] + 1;
		Tabela[j][2] = Tabela[j][2] + 1;
	}
}

void GotoXY(int x, int y){
	COORD Coord;
	Coord.X = x;
	Coord.Y = y;
	
    SetConsoleCursorPosition(GetStdHandle(STD_OUTPUT_HANDLE), Coord);
}


