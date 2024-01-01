package Slide05.Revisao2;

public class ExemploDoChatBing_Carro {
	private ExemploDoChatBing_Motor motor;
	private ExemploDoChatBing_Roda  rodas[];
	
	public ExemploDoChatBing_Carro() {
		this.motor = new ExemploDoChatBing_Motor();
		this.rodas = new  ExemploDoChatBing_Roda[4];
		
		for( int loop = 0 ; loop < 4 ; loop++) {
			this.rodas[loop] = new ExemploDoChatBing_Roda();
		}
	}
}
