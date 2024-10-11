package operacoesbasicas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CarrinhoDeCompras {
	
	/**Atributos**/
	private List<Item> itemList;    
	
	
	/**Construtores**/
	public CarrinhoDeCompras() {
		super();
		this.itemList = new ArrayList<>();
	}
	
	public void adcionarItem(String nome, double preco, int quantidade) {
		Item item = new Item(nome,preco,quantidade);
		this.itemList.add(item);
	}
	
	
		

	
	
}
