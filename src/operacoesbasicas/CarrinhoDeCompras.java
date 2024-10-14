package operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	/**Attributes**/
	private List<Item> listItem;
	
	/**Constructors**/
	public CarrinhoDeCompras() {
		this.listItem = new ArrayList<>();	
	}
	
	/**Add Item**/
	public void adicionarItem(String nome, double valor, int quantidade) {
		listItem.add(new Item(nome, valor, quantidade));
	}
	
	/**Remove Item**/
	public void removerItem(String nome) {
		List<Item> itemParaRemover = new ArrayList<>();
		if (!listItem.isEmpty()) {
			for(Item item : listItem) {
				item.getNome().equalsIgnoreCase(nome);
				itemParaRemover.add(item);
			}
		}
		itemParaRemover.removeAll(itemParaRemover);
	}
	
	/**Calculate Total Value**/
	public void calcularValorTotal() {
		
	}
	
	public void exibirItens(){
		System.out.println(listItem);
		
	}

}
