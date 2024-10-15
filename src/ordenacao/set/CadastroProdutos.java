package ordenacao.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	
	/**Attributes**/
	public Set<Produto> setProduto;
	
	/**Constructor**/
    public CadastroProdutos() {
    	this.setProduto = new HashSet<>();
    }
    
    /**Adicionar Produto**/
    /**Add Product**/
    public void adicionarProduto(Long codigo, String nome, double valor, int quantidade) {
    	setProduto.add( new Produto(codigo, nome, quantidade, quantidade));
    }
    
    /**Exibir Produto por Nome**/
    /**Display Product By Name**/
    public Set<Produto> exibirProdutosPorNome(){
    	Set<Produto> produtosPorNome = new TreeSet<>(setProduto);
		return produtosPorNome;
    }
    
    /**Exibir Produto Por Valor**/
    /**Display Product By Value**/
    public Set<Produto> exibirProdutosPorValor() {    	
    	Set<Produto> produtoPorValor = new TreeSet<>(new ComparatorPorValor());
    	produtoPorValor.addAll(setProduto);
		return produtoPorValor;
    }
    
    
    
}
