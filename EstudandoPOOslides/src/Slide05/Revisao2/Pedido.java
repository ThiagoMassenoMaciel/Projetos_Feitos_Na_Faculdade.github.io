package Slide05.Revisao2;

public class Pedido {
	int id_pedido ;
	int data;
	int valorDesconto;
	ItemPedido itensPedido[];
	
	public Pedido( int quantosItens) {
		for( int indice = 0 ; indice < quantosItens ; indice++) {
			this.itensPedido[indice] = new ItemPedido();
		}
	}
}
