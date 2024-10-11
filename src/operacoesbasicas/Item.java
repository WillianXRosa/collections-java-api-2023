package operacoesbasicas;

public class Item {

	/**Atributos**/
	private String nome;
	private double valor;
	private int quantidade;
	
	/**Getters**/
	public String getNome() {
		return nome;
	}
	
	public double getValor() {
		return valor;
	}
	
    public int getQuantidade() {
		return quantidade;
	}
    
    /**Construtores**/
    public Item(String nome, double valor, int quantidade) {
    	super();
    	this.nome = nome;
    	this.valor = valor;
    	this.quantidade = quantidade;
    }
}
