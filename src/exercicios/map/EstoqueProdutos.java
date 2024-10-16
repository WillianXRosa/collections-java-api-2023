package exercicios.map;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

	/**Attributes**/
	private Map<Long, Produto>estoqueProdutoMap;
	
	/**Constructors**/
	public EstoqueProdutos() {
		this.estoqueProdutoMap = new HashMap<>();		
		
	}
	
	/**Add Product**/
	public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
		estoqueProdutoMap.put(codigo, new Produto(nome, preco, quantidade));
	}
	
	/**Display product**/
	public void exibirProdutos() {
		System.out.println(estoqueProdutoMap);
	}
	
	/**Calculate Total Stock Value**/
	public double calcularValorTotalEstoque() {
		double valorTotalEstoque = 0d;
		if(!estoqueProdutoMap.isEmpty()) {
			for(Produto objProduto : estoqueProdutoMap.values()) {
				valorTotalEstoque += objProduto.getAmount() * objProduto.getPrice();
			}
		}
		return valorTotalEstoque;
		
	}
	
	/**Obter produto mais caro**/
	/**Get Most Expensive Product**/
	public Produto obterProdutoMaisCaro() {
		Produto produtoMaisCaro = null;
		double maiorPreco = Double.MIN_VALUE;
		for(Produto objProduto : estoqueProdutoMap.values()) {
			if(objProduto.getPrice() > maiorPreco) {
				produtoMaisCaro = objProduto;
			}
		}
		return produtoMaisCaro;
	}
	
}
