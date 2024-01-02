package Slide05.Revisao3;

public class Carro_ObjetoContainReferenciaDeOutrosObjetos {
	String marca;
	Roda rodas[];
	
	public Carro_ObjetoContainReferenciaDeOutrosObjetos() {
		this.marca = "Chevrolet";
		this.rodas = new Roda[4];
		
		for( int indice = 0 ; indice < rodas.length ; indice++) {
			this.rodas[indice] = new Roda();
		}
	}
}
